package goosegame;
import java.util.*;
import goosegame.*;

public class Game{
  //Attributs
  /** The list of the players */
  protected List<Player> thePlayers;
  /** The board of the game */
  protected Board board;

  private boolean endOfGame;






  /**
  *Constructor of the class goosegame
  *@param board  the board of game
  */
  public Game(Board board){
    this.board=board;
    this.thePlayers=new ArrayList<Player>();
    this.endOfGame=false;
  }

  /**
  *allows to verify if the game is Finished or no
  *@return <code>true</code> if the game is finished <code>false</code> else
  */
  public boolean isFinished(){
   if (this.board.getCell(63).isBusy()){
     return true;
   }
   else{
     return false;
   }
 }



  /**
  *allows to change the cells of two players
  *@param p1 the first player
  *@param p2 the second player
  */
  public void swap(Player p1,Player p2){
    Cell cell=p1.getCell();
    Cell cell2=p2.getCell();
    p1.setCell(cell2);
    cell2.setPlayer(p1);
    p2.setCell(cell);
    cell.setPlayer(p2);

}
  /**
  *allows to get an index on the board
  *@param d number to check
  *@return an index between 1 and 62
  */
  public int real(int d){
    int b=this.board.getNbOfCells()-1;
    if(d>b){
      return b - (d- b);
    }
    else{
      return d;
    }
  }




 /**
 *allows to play a game
 */
  public void play(){
    while(!this.endOfGame){
      for(Player p:this.thePlayers){

      if(p.getCell().canBeLeft()){
        int d=p.twoDiceThrow();
        System.out.println(p.toString()+" is in cell "+p.getCell().getIndex()+", "+p.toString()+" throws "+d);
        int reached=this.real(p.getCell().getIndex()+d);
        Cell reachedCell=this.board.getCell(reached);
        System.out.println("and reaches cell "+reachedCell.getIndex());
        int realReached=reachedCell.bounce(d);
        int realReachedIndex=this.real(realReached);
        Cell destCell=this.board.getCell(realReachedIndex);
        if(reached!=realReachedIndex){
          System.out.println(" and jump to cell "+destCell.getIndex());
        }

        Cell currentCell=p.getCell();
        currentCell.setPlayer(null);

        if(destCell.isBusy()){

          destCell.getPlayer().setCell(currentCell);
          currentCell.setPlayer(destCell.getPlayer());




          System.out.println("cell is busy "+p.toString()+"move to cell "+destCell.getIndex()+" and "+destCell.getPlayer()+" move to cell"+p.getCell().getIndex());
        }


          p.setCell(destCell);
          destCell.setPlayer(p);


      }
      System.out.println(p.toString()+" can't play ");


    if (p.getCell().getIndex() ==this.board.getNbOfCells()-1) {
           System.out.println(p + " has won");
           this.endOfGame = true;
           break;
         }

      }
    }


      }

      /**
      *allows to add a players on the game
      *@param player the player to add
      */
    public void addPlayers(Player player){
          this.thePlayers.add(player);
      }
























}
