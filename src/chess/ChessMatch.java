package chess;
import boardgame.Position;
import boardgame.board;
import chess.pieces.King;
import chess.pieces.Rook;
public class ChessMatch {
		private board board;
		public ChessMatch() {
			board =  new board(8,8);
			initialSetup();
		}
		public ChessPiece[][]getPices(){
			ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
			for(int i=0;i<board.getRows();i++) {
				for(int j = 0;j < board.getColumns();j++) {
					mat[i][j] = (ChessPiece) board.piece(i, j);
				}
			}
				return mat;
		}
		private void initialSetup() {
			board.PlacePiece(new Rook(board,Color.WHITE),new Position(2,1) );
			board.PlacePiece(new King(board,Color.BLACK),new Position(0,4) );
		}
}

