package goosegame;

public class TeleportCell extends Cell{
 protected int index;
 protected int dest;

public TeleportCell(int index,int dest){
  super(index);
  this.dest=dest;

}

/** returns the cell really reached when player enters in this Cell
@param d the dice throw
@return the destination cell index
*/
 public int bounce(int d){
   return this.dest;
 }

 public boolean canBeLeft(){
   return true;
 }














}
