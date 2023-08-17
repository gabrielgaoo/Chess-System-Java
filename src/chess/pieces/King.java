package chess.pieces;

import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{
  public King(boardgame.board board, Color color) {
	  super(board, color);
  }
  public String toString() {
	  return"K";
  }
}
