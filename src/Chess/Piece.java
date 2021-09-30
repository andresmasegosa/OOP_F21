package Chess;

enum Color {
    WHITE,
    BLACK,
    NO_COLOR
}

enum PieceNames{
    PAWN,
    ROOK,
    HORSE,
    BISHOP,
    QUEEN,
    KING,
    NO_PIECE
}
public class Piece {
    Color playerColor;
    PieceNames nameOfPiece;

    public Piece(Color playerColor, PieceNames nameOfPiece) {
        this.playerColor = playerColor;
        this.nameOfPiece = nameOfPiece;

    }

    public String getPieceSymbol(){
        switch (this.nameOfPiece) {
            case PAWN -> {
               return "P ";
            }
            case ROOK -> {
                return "R ";
            }
            case HORSE -> {
                return "H ";
            }
            case BISHOP -> {
                return "B ";
            }
            case QUEEN -> {
                return "Q ";
            }
            case KING -> {
                return "K ";
            }
            default -> {
                return "  ";
            }
        }
    }

    public boolean pawnMove(int xCurrent, int yCurrent, int xFuture, int yFuture){
        //check if white pawn is at start location
        if(this.playerColor == Color.WHITE){
            //checks if white pawn move is 1 square forward
            if((xCurrent == xFuture) && (yFuture - yCurrent == 1)){
                return true;
            }
            else if(yCurrent == 1){
                if((xCurrent == xFuture) && (yFuture - yCurrent) == 2){
                    return true;
                }
            }

        }

        //else runs only if piece is black
        else{
            //checks if black pawn move is 1 square forward
            if((xCurrent == xFuture) && (yCurrent - yFuture == 1)){
                return true;
            }
            //check if black pawn is at start location
            else if(yCurrent == 6){
                if((xCurrent == xFuture) && (yCurrent - yFuture) == 2){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean rookMove(int xCurrent, int yCurrent, int xFuture, int yFuture){
        if((xCurrent == xFuture) ||(yCurrent == yFuture)){
            return true;
        }
        return false;
    }

    public boolean horseMove(int xCurrent, int yCurrent, int xFuture, int yFuture){
        if(((Math.abs(xCurrent - xFuture) == 1) && ((Math.abs(yCurrent - yFuture)) == 2)) ||
            (Math.abs(xCurrent - xFuture) == 2) && ((Math.abs(yCurrent - yFuture)) == 1)){
            return true;
        }
        return false;
    }

    public boolean bishopMove(int xCurrent, int yCurrent, int xFuture, int yFuture){
        if(Math.abs(xCurrent - xFuture) == Math.abs(yCurrent - yFuture)){
           return true;
        }
        return false;
    }

    public boolean queenMove(int xCurrent, int yCurrent, int xFuture, int yFuture){
        if(((xCurrent == xFuture) ||(yCurrent == yFuture)) || (xCurrent - xFuture == yCurrent - yFuture)){
            return true;
        }
        return false;
    }

    public boolean kingMove(int xCurrent, int yCurrent, int xFuture, int yFuture){
        if((Math.abs(xCurrent - xFuture) <= 1) || (Math.abs(yCurrent - yFuture) <= 1)){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "playerColor=" + playerColor +
                ", nameOfPiece=" + nameOfPiece +
                '}';
    }
}
