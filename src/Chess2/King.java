package Chess2;

public class King extends ChessPiece {

    public King(ChessBoard chessBoard, String color) {
        super(chessBoard,"King",color);
    }

    @Override
    public boolean isLegalMovement(int newX, int newY){

        boolean success =
                    chessBoard.isLegalVerticalMovement(x, y, newX, newY, 1) ||
                    chessBoard.isLegalHorizontalMovement(x, y, newX, newY, 1) ||
                    chessBoard.isLegalDiagonalMovement(x, y, newX, newY, 1);

        if (success){
            movePiece(newX, newY);
        }

        return success;
    }

    @Override
    public boolean isCheck() {
        return false;
    }

}
