package Chess2;

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

    public boolean isDistInsideBoard(int newX, int newY){
        //Check if the final destination is out of board
        if (newX>7 || newY>7){
            return false;
        }
        return true;
    }

    public boolean isDistSameColor(int newX, int newY){
        //Check if there is a piece of the same color at the final destination
        if (chessBoard.getChessPiece(newX,newY)!=null && chessBoard.getChessPiece(newX,newY).getColor().compareTo(chessBoard.getChessPiece(x,y).getColor())==0){
            return false;
        }
        return true;
    }

    public void movePiece(int newX, int newY){
            chessBoard.setChessPiece(newX,newY,chessBoard.getChessPiece(x,y));
            chessBoard.setChessPiece(x,y,null);
    }

    public boolean move(int newX, int newY) {
        boolean insideBoard = isDistInsideBoard(newX,newY);

        boolean notSameColor = isDistSameColor(newX, newY);

        boolean success = isLegalMovement(newX,newY);

        boolean isAllOkay = insideBoard && notSameColor && success;

        if (isAllOkay){
            movePiece(newX, newY);
        }

        return isAllOkay;
    }

    public ChessPiece findOppositeKing(){

        return this;
    }

    public abstract boolean isLegalMovement(int newX, int newY);

    public abstract boolean isCheck();

}
