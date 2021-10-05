package session2.c_inheritance.c_designWithAbstractClass;

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

    public abstract boolean move(int newX, int newY);

}
