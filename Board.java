package goosegame;

public abstract class Board{
  //Attributs
  /**Number of cells in the board */
  protected final int nbOfCells;
  /** The list of all the cellsof the board*/
  protected Cell[] theCells;

  /**
  *@param nbOfCells the number of cells in the board
  */
  public Board(int nbOfCells){
    this.theCells=new Cell[nbOfCells];
    this.nbOfCells=nbOfCells;

  }
  /**Abstract method wich initilize the board
  *
  */
  public abstract void initBoard();

  /**method wich allows to get a cell depending on an index given
  *@param index the index of the cell we want
  *@return the cell we want
  */
  public Cell getCell(int index){
    return this.theCells[index];
  }

  /**Get the number of cells in the board
  *@return the number of cells
  */
  public int getNbOfCells(){
    return this.nbOfCells;
  }



}
