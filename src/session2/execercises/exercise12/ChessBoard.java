package session2.execercises.exercise12;

public class ChessBoard {

    private ChessPiece[][] pieces = new ChessPiece[8][8];

    public ChessBoard() {

    }

    public ChessPiece getChessPiece(int x, int y){
        return pieces[x][y];
    }


    public void setChessPiece(int x, int y, ChessPiece piece){
        this.pieces[x][y]=piece;
        piece.setX(x);
        piece.setY(y);
    }

    public boolean isLegalHorizontalMovement(int x1, int y1, int x2, int y2, int maxDistance)
    {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        maxDistance = Math.abs(maxDistance);

        // If not moving, moving vertically or further than allowed
        if (dx == 0 || dy != 0 || dx > maxDistance)
            return false;

        // Check if piece passed any other piece in order to make this move
        int lower = Math.min(x1, x2) + 1;
        int higher = Math.max(x1, x2);

        for (; lower < higher; lower++)
            if (pieces[lower][y1] != null)
                return false; // False if trying to pass over another piece

        return true; // All according to the rules
    }

    public boolean isLegalVerticalMovement(int x1, int y1, int x2, int y2, int maxDistance)
    {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        maxDistance = Math.abs(maxDistance);

        // If moving horizontally, not moving or further than allowed
        if (dx != 0 || dy == 0 || dy > maxDistance)
            return false;

        // Check if piece passed any other piece in order to make this move
        int lower = Math.min(y1, y2) + 1;
        int higher = Math.max(y1, y2);

        for (; lower < higher; lower++)
            if (pieces[x1][lower] != null)
                return false; // False if trying to pass over another piece

        return true; // All according to the rules
    }

    public boolean isLegalDiagonalMovement(int x1, int y1, int x2, int y2, int maxDistance)
    {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        maxDistance = Math.abs(maxDistance);

        // If not purely diagonal or further movement than allowed
        if (dx != dy || dx > maxDistance)
            return false;

        // Check if piece passed any other piece in order to make this move
        int currX = x1 + (x2 < x1 ? -1 : 1);
        int currY = y1 + (y2 < y1 ? -1 : 1);
        while (currX != x2 && currY != y2)
        {
            if (pieces[currX][currY] != null)
                return false;

            currX += (x2 < x1 ? -1 : 1);
            currY += (y2 < y1 ? -1 : 1);
        }

        return true;
    }

    public boolean isLegalJumpMovement(int x1, int y1, int x2, int y2)
    {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        // Move 2 vertical/horizontal + 1 !(vertical/horizontal)
        if (dx + dy != 3 || (dx != 2*dy && dy != 2*dx) )
            return false;

        return true;
    }

}
