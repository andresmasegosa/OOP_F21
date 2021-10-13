package Chess2;

public class Bishop extends ChessPiece{

    public Bishop(ChessBoard chessBoard, String type, String color) {
        super(chessBoard, type, color);
    }

    @Override
    public boolean move(int newX, int newY) {
        boolean insideBoard = isDistInsideBoard(newX,newY);

        boolean notSameColor = isDistSameColor(newX, newY);

        boolean success = chessBoard.isLegalDiagonalMovement(x, y, newX, newY, 8);

        boolean isAllOkay = insideBoard && notSameColor && success;

        if (isAllOkay){
            movePiece(newX, newY);
        }

        return isAllOkay;
    }

    @Override
    public boolean isLegalMovement(int newX, int newY) {
        return false;
    }
}
