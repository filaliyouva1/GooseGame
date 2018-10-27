package goosegame;

public class Cell{
  //Attributs
  /** The player of the current cell */
  protected Player player;
  /** The index of the current cell*/
  protected int index;

  /**
  *@param index the index of the cell
  */
  public Cell(int index){
    this.index=index;
    this.player=null;

  }
  /**
  *Method wich allows to get the index of the cell
  *@return the index of the cell
  */
  public  int getIndex(){
    return this.index;
  }
  /**
  *Method wich allows to get the player of the cell
  *@return the player of the cell
  */
  public Player getPlayer(){
    return this.player;
  }

  /**Set a player in the cell
  *@param player the player who will be setting in the cell
  */
  public void setPlayer(Player player){
    this.player=player;
  }

  /**
  *@return <code>true</code> if the cell is not busy else <code>false</code>
  */
  public boolean isBusy(){
    return this.player!=null;
  }

  /**
  *@return <code>true</code> the cell can be left else <code>false</code>
  */
  public boolean canBeLeft(){
    return true;
  }

  /**
  *allows to get a index of reached cell
  *@param d number of cell to jump
  @return an index on the board 
  */
  public int bounce(int d){
    return this.index;
  }



}
