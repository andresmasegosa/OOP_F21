package Chess2;

public class Queen extends ChessPiece {

    public Queen(ChessBoard chessBoard, String color) {
        super(chessBoard,"Queen",color);
    }

    @Override
    public boolean isLegalMovement(int newX, int newY){

        boolean success =
                        chessBoard.isLegalVerticalMovement(x, y, newX, newY, 8) ||
                        chessBoard.isLegalHorizontalMovement(x, y, newX, newY, 8) ||
                        chessBoard.isLegalDiagonalMovement(x, y, newX, newY, 8);

        if (success){
            movePiece(newX, newY);
        }

        return success;
    }

    @Override
    public boolean isCheck() {
        ChessPiece opposingKingFound = findOppositeKing();

        if(opposingKingFound){
            return true;

        }
        return false;
    }

}
