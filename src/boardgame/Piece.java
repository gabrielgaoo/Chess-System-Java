package boardgame;

public class Piece {
   protected Position position;
   private board board;
   public Piece (board board) {
	   this.board = board;
	   position = null;
   }
   protected board getboard() {
	   return board;
   }
}
