package Chess;

public class Pawn {
    Piece Pawn;
    Location locationOfPiece;

    public Pawn(Piece pawn, Location locationOfPiece) {
        this.Pawn = pawn;
        this.locationOfPiece = locationOfPiece;
    }

    boolean move(int xFuture, int yFuture){
        //check if white pawn is at start location
        if(this.locationOfPiece.y == 1){
            if((this.locationOfPiece.x == xFuture) && (yFuture - this.locationOfPiece.y) == 2){
                this.locationOfPiece.y = yFuture;
                return true;
            }
        }
        //checks if white pawn move is 1 square forward
        else if((this.locationOfPiece.x == xFuture) && (yFuture - this.locationOfPiece.y == 1)){
            this.locationOfPiece.y = yFuture;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "Pawn=" + Pawn +
                ", locationOfPiece=" + locationOfPiece +
                '}';
    }
}
