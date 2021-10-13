package session2.c_inheritance.b_designWithInterface;

public interface ChessPiece {

    public String getColor();

    public int getX();

    public void setX(int x);

    public int getY();

    public void setY(int y);

    public boolean move(int newX, int newY);

}
