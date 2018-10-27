package goosegame;

public class InitCells extends Board{

	/**
	*constructor of the board 
	*/
	public InitCells(){
		super(64);
	}

/**
*allows to initilize the board
*/

public void initBoard(){
  for (int i = 1; i <64; i++) {
      this.theCells[i] = new Cell(i);
    }


  this.theCells[9] =new GooseCell(9);
  this.theCells[18]=new GooseCell(18);
  this.theCells[27]=new GooseCell(27);
  this.theCells[36]=new GooseCell(36);
  this.theCells[45]=new GooseCell(45);
  this.theCells[54]=new GooseCell(54);
  this.theCells[31]=new TrapCell(31);
  this.theCells[52]=new TrapCell(52);
  this.theCells[19]=new WaitingCell(19,2);
  this.theCells[6] =new TeleportCell(6,12);
  this.theCells[42]=new TeleportCell(42,30);
  this.theCells[58]=new TeleportCell(58,1);


}




}
