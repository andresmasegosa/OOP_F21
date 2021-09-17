package Chess;

public class Chessboard {
    Location[][] piecesLocation;

    public Chessboard() {
        this.piecesLocation = new Location[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                this.piecesLocation[i][j] = new Location(i,j);
            }
        }
    }

    public void printChessBoard(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.println(this.piecesLocation[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        //create new chessboard
        Chessboard ChessBoard = new Chessboard();
        //ChessBoard.printChessBoard();

        //create white pieces
        Piece whitePawn = new Piece(Color.WHITE, PieceNames.PAWN);
        Piece whiteRook = new Piece(Color.WHITE, PieceNames.ROOK);
        Piece whiteKnight = new Piece(Color.WHITE, PieceNames.KNIGHT);
        Piece whiteBishop = new Piece(Color.WHITE, PieceNames.BISHOP);
        Piece whiteQueen = new Piece(Color.WHITE, PieceNames.QUEEN);
        Piece whiteKing = new Piece(Color.WHITE, PieceNames.KING);

        //create white pawns
        Pawn whiteAPawn = new Pawn(whitePawn, ChessBoard.piecesLocation[0][1]);
        Pawn whiteBPawn = new Pawn(whitePawn, ChessBoard.piecesLocation[1][1]);
        Pawn whiteCPawn = new Pawn(whitePawn, ChessBoard.piecesLocation[2][1]);
        Pawn whiteDPawn = new Pawn(whitePawn, ChessBoard.piecesLocation[3][1]);
        Pawn whiteEPawn = new Pawn(whitePawn, ChessBoard.piecesLocation[4][1]);
        Pawn whiteFPawn = new Pawn(whitePawn, ChessBoard.piecesLocation[5][1]);
        Pawn whiteGPawn = new Pawn(whitePawn, ChessBoard.piecesLocation[6][1]);
        Pawn whiteHPawn = new Pawn(whitePawn, ChessBoard.piecesLocation[7][1]);


        System.out.println(whiteAPawn);
    }
}
