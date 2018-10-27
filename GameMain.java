package goosegame;
import goosegame.*;

public class GameMain{

public static void main(String[] args){
  Board board=new InitCells();
  board.initBoard();
  Game game=new Game(board);
  Player player1=new Player("Pablo",new StartCell());
  Player player2=new Player("Sam",new StartCell());
  game.addPlayers(player1);
  game.addPlayers(player2);
  game.play();

}





}
