package session2.c_inheritance.c_designWithAbstractClass;

public class ChessDemo {

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();

        ChessPiece king = new King(chessBoard,"Black");
        chessBoard.setChessPiece(4,7, king);

        ChessPiece queen = new Queen(chessBoard,"Black");
        chessBoard.setChessPiece(3,7, queen);

     }
}
