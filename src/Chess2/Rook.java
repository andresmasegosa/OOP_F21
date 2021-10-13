package Chess2;

public class Rook extends ChessPiece{
    public Rook(ChessBoard chessBoard, String type, String color) {
        super(chessBoard, type, color);
    }

    @Override
    public boolean move(int newX, int newY) {
        boolean insideBoard = isDistInsideBoard(newX,newY);

        boolean notSameColor = isDistSameColor(newX, newY);

        boolean success =
                        chessBoard.isLegalVerticalMovement(x, y, newX, newY, 8) ||
                        chessBoard.isLegalHorizontalMovement(x, y, newX, newY, 8);

        boolean isAllOkay = insideBoard && notSameColor && success;

        if (isAllOkay){
            movePiece(newX, newY);
        }

        return isAllOkay;
    }
}

