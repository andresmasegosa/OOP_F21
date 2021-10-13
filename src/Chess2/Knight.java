package Chess2;

public class Knight extends ChessPiece{

    public Knight(ChessBoard chessBoard, String type, String color) {
        super(chessBoard, type, color);
    }

    @Override
    public boolean isLegalMovement(int newX, int newY) {
        return chessBoard.isLegalJumpMovement(x, y, newX, newY);
    }
}
