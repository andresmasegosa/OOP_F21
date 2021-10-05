package session2.c_inheritance.a_designNoInterfaceNoInheritance;

public class ChessPiece {

    private String type;
    private String color;
    private int x;
    private int y;
    private ChessBoard chessBoard;

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
        if (newX>7 || newY>7)
            return false;

        //Check if there is a piece of the same color at the final destination
        if (chessBoard.getChessPiece(newX,newY)!=null && chessBoard.getChessPiece(newX,newY).getColor().compareTo(chessBoard.getChessPiece(x,y).getColor())==0)
            return false;

        //Check if the movement is allowed.
        boolean success = false;
        switch(type){
            case "King":
                // Do movement
                success =
                        chessBoard.isLegalVerticalMovement(x, y, newX, newY, 1) ||
                        chessBoard.isLegalHorizontalMovement(x, y, newX, newY, 1) ||
                        chessBoard.isLegalDiagonalMovement(x, y, newX, newY, 1);

            case "Queen":
                success =
                        chessBoard.isLegalVerticalMovement(x, y, newX, newY, 8) ||
                        chessBoard.isLegalHorizontalMovement(x, y, newX, newY, 8) ||
                        chessBoard.isLegalDiagonalMovement(x, y, newX, newY, 8);

        }


        //If OK effectively move the piece
        if (success){
            chessBoard.setChessPiece(newX,newY,chessBoard.getChessPiece(x,y));
            chessBoard.setChessPiece(x,y,null);
        }

        return success;
    }



}
