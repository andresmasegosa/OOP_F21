package session2.c_inheritance.b_designWithInterface;

public class King implements ChessPiece {

    private String type;
    private String color;
    private int x;
    private int y;
    private ChessBoard chessBoard;

    public King(ChessBoard chessBoard, String color) {
        this.chessBoard = chessBoard;
        this.type = "King";
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean move(int newX, int newY){
        //Check if the final destination is out of board
        if (newX>7 || newY>7)
            return false;

        //Check if there is a piece of the same color at the final destination
        if (chessBoard.getChessPiece(newX,newY)!=null && chessBoard.getChessPiece(newX,newY).getColor().compareTo(chessBoard.getChessPiece(x,y).getColor())==0)
            return false;

        boolean success =
                chessBoard.isLegalVerticalMovement(x, y, newX, newY, 1) ||
                chessBoard.isLegalHorizontalMovement(x, y, newX, newY, 1) ||
                chessBoard.isLegalDiagonalMovement(x, y, newX, newY, 1);

        //If OK effectively move the piece
        if (success){
            chessBoard.setChessPiece(newX,newY,chessBoard.getChessPiece(x,y));
            chessBoard.setChessPiece(x,y,null);
        }

        return success;
    }

}
