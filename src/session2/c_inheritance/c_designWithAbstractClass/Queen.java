package session2.c_inheritance.c_designWithAbstractClass;

public class Queen extends ChessPiece {

    public Queen(ChessBoard chessBoard, String color) {
        super(chessBoard,"King",color);
    }

    @Override
    public boolean move(int newX, int newY){
        //Check if the final destination is out of board
        if (newX>7 || newY>7)
            return false;

        //Check if there is a piece of the same color at the final destination
        if (chessBoard.getChessPiece(newX,newY)!=null && chessBoard.getChessPiece(newX,newY).getColor().compareTo(chessBoard.getChessPiece(x,y).getColor())==0)
            return false;

        //Check if the movement is allowed.
        boolean success =
                        chessBoard.isLegalVerticalMovement(x, y, newX, newY, 8) ||
                        chessBoard.isLegalHorizontalMovement(x, y, newX, newY, 8) ||
                        chessBoard.isLegalDiagonalMovement(x, y, newX, newY, 8);

        //If OK effectively move the piece
        if (success){
            chessBoard.setChessPiece(newX,newY,chessBoard.getChessPiece(x,y));
            chessBoard.setChessPiece(x,y,null);
        }

        return success;
    }

}
