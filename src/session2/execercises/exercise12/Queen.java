package session2.execercises.exercise12;

public class Queen extends ChessPiece {

    public Queen(ChessBoard chessBoard, String color) {
        super(chessBoard,"King",color);
    }

    @Override
    public boolean isLegalMove(int newX, int newY) {
        return chessBoard.isLegalVerticalMovement(x, y, newX, newY, 8) ||
                chessBoard.isLegalHorizontalMovement(x, y, newX, newY, 8) ||
                chessBoard.isLegalDiagonalMovement(x, y, newX, newY, 8);
    }
}
