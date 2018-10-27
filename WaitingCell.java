package goosegame;

public class WaitingCell extends Cell{
    int waitingTime;
    int nbTours;
    /**
    *allows to know if the player on this cell can move or no
    @return <code>true</code> if can move  <code>false</code>else
    */
  public boolean canBeLeft(){
    if (this.nbTours==0){
    return true ;
  }
  else{
    this.nbTours--;

  }
  return false;
}
/**
*Constructor of WaitingCell
*@param index the index of the cell
*@param waitingTime the number of tours to wait to play
*/
  public WaitingCell(int index,int waitingTime){
    super(index);
    this.waitingTime=waitingTime;

  }
  /**
  *allows to add a player on the cell 
  */
  public void setPlayer(){
    this.nbTours=this.waitingTime;
    super.setPlayer(player);
  }

}
