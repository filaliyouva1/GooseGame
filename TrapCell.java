package goosegame;



public class TrapCell extends Cell{

/**
*Constructor of the Trap cell
*@param index the index of the cell
*/
public TrapCell(int index){
  super(index);
}


/**
*allows to know if the player on this cell can move or no
@return <code>true</code> if can move  <code>false</code>else 
*/
public boolean canBeLeft(){
  return false;
}







}
