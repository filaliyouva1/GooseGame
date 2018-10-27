package goosegame;

public class GooseCell extends Cell{


  /**
  *Constructor of the GooseCell
  *@param index the index of the cell
  */
  public GooseCell(int index){
    super(index);
  }
/**
*allows to bounce on another cell
*@param d the number of cells to jump
*@return the index of reached cell 
*/
  public int bounce(int d){
    return this.index+d;
  }








}
