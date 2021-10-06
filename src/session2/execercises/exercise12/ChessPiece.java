package session2.execercises.exercise12;

public abstract class ChessPiece {

    private String type;
    private String color;
    protected int x;
    protected int y;
    protected ChessBoard chessBoard;

    public ChessPiece(ChessBoard chessBoard, String type, String color) {
        this.chessBoard = chessBoard;
        this.type = type;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean move(int newX, int newY){
        //Check if the final destination is out of board
        if (newX>7 || newY>7 || newX<0 || newY<0)
            return false;

        //Check if there is a piece of the same color at the final destination
        if (chessBoard.getChessPiece(newX,newY)!=null && chessBoard.getChessPiece(newX,newY).getColor().compareTo(chessBoard.getChessPiece(x,y).getColor())==0)
            return false;

        boolean success = isLegalMove(newX, newY);

        //If OK effectively move the piece
        if (success){
            chessBoard.setChessPiece(newX,newY,chessBoard.getChessPiece(x,y));
            chessBoard.setChessPiece(x,y,null);
        }

        return success;
    }

    public abstract boolean isLegalMove(int newX, int newY);

}
