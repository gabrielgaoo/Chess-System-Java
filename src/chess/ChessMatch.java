package chess;
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
		private void placeNewPiece(char column,int row,ChessPiece piece) {
			board.PlacePiece(piece, new ChessPosition(column,row).toPosition());
		}
		private void initialSetup() {	
				placeNewPiece('c', 1, new Rook(board, Color.WHITE));
				placeNewPiece('c', 2, new Rook(board, Color.WHITE));
		        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
		        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
		        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
		        placeNewPiece('d', 1, new King(board, Color.WHITE));

		        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
		        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
		        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
		        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
		        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
		        placeNewPiece('d', 8, new King(board, Color.BLACK));
					
		}
		
}

