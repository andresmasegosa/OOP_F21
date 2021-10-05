package session2.c_inheritance.a_designNoInterfaceNoInheritance;

public class ChessDemo {

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();

        ChessPiece king = new ChessPiece(chessBoard, "King", "Black");
        chessBoard.setChessPiece(4,7, king);

        ChessPiece queen = new ChessPiece(chessBoard, "Queen", "Black");
        chessBoard.setChessPiece(3,7, queen);
    }
}
