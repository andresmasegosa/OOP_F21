package Chess2;

public class Pawn extends ChessPiece{

    public Pawn(ChessBoard chessBoard, String type, String color) {
        super(chessBoard, type, color);
    }

    @Override
    public boolean move(int newX, int newY) {
        boolean insideBoard = isDistInsideBoard(newX,newY);

        boolean notSameColor = isDistSameColor(newX, newY);

        //basic implementation of pawn to focus on inheritance etc.
        boolean success = chessBoard.isLegalVerticalMovement(x, y, newX, newY, 2);

        boolean isAllOkay = insideBoard && notSameColor && success;

        if (isAllOkay){
            movePiece(newX, newY);
        }

        return isAllOkay;
    }
}
