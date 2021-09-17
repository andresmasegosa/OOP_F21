package Chess;

enum Color {
    WHITE,
    BLACK
}

enum PieceNames{
    PAWN,
    ROOK,
    KNIGHT,
    BISHOP,
    QUEEN,
    KING
}
public class Piece {
    Color playerColor;
    PieceNames nameOfPiece;

    public Piece(Color playerColor, PieceNames nameOfPiece) {
        this.playerColor = playerColor;
        this.nameOfPiece = nameOfPiece;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "playerColor='" + playerColor + '\'' +
                ", nameOfPiece='" + nameOfPiece + '\'' +
                '}';
    }
}
