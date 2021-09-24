package Chess;

import java.util.Scanner;

public class Chessboard {
    Piece[][] piecesOnChessboard;

    public Chessboard() {
        this.piecesOnChessboard = new Piece[8][8];
    }

    public void printChessBoard(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(this.piecesOnChessboard[i][j].getPieceSymbol());
            }
            System.out.println();
        }
    }

    public void setupNewChessGame(){
        //prepare array to handle pieces by filling with empty pieces (squares with no piece on it)
        Piece noPiece = new Piece(Color.NO_COLOR, PieceNames.NO_PIECE);
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                this.piecesOnChessboard[i][j] = noPiece;
            }
        }
        //create white pieces
        Piece whitePawn = new Piece(Color.WHITE,PieceNames.PAWN);
        Piece whiteRook = new Piece(Color.WHITE, PieceNames.ROOK);
        Piece whiteHorse = new Piece(Color.WHITE, PieceNames.HORSE);
        Piece whiteBishop = new Piece(Color.WHITE, PieceNames.BISHOP);
        Piece whiteQueen = new Piece(Color.WHITE, PieceNames.QUEEN);
        Piece whiteKing = new Piece(Color.WHITE, PieceNames.KING);

        for(int i = 0; i < 8; i++){
            this.piecesOnChessboard[1][i] = whitePawn;
        }
        this.piecesOnChessboard[0][0] = whiteRook;
        this.piecesOnChessboard[0][7] = whiteRook;
        this.piecesOnChessboard[0][1] = whiteHorse;
        this.piecesOnChessboard[0][6] = whiteHorse;
        this.piecesOnChessboard[0][2] = whiteBishop;
        this.piecesOnChessboard[0][5] = whiteBishop;
        this.piecesOnChessboard[0][3] = whiteQueen;
        this.piecesOnChessboard[0][4] = whiteKing;


        //create black pieces
        Piece blackPawn = new Piece(Color.BLACK,PieceNames.PAWN);
        Piece blackRook = new Piece(Color.BLACK, PieceNames.ROOK);
        Piece blackHorse = new Piece(Color.BLACK, PieceNames.HORSE);
        Piece blackBishop = new Piece(Color.BLACK, PieceNames.BISHOP);
        Piece blackQueen = new Piece(Color.BLACK, PieceNames.QUEEN);
        Piece blackKing = new Piece(Color.BLACK, PieceNames.KING);

        for(int i = 0; i < 8; i++){
            this.piecesOnChessboard[6][i] = blackPawn;
        }
        this.piecesOnChessboard[7][0] = blackRook;
        this.piecesOnChessboard[7][7] = blackRook;
        this.piecesOnChessboard[7][1] = blackHorse;
        this.piecesOnChessboard[7][6] = blackHorse;
        this.piecesOnChessboard[7][2] = blackBishop;
        this.piecesOnChessboard[7][5] = blackBishop;
        this.piecesOnChessboard[7][3] = blackQueen;
        this.piecesOnChessboard[7][4] = blackKing;
    }

    public boolean checkLegalMove(Piece piece, int xCurrent, int yCurrent, int xFuture, int yFuture){
        switch (piece.nameOfPiece){
            case PAWN -> {
                return piece.pawnMove(xCurrent, yCurrent, xFuture, yFuture);
            }
            case ROOK -> {
                return piece.rookMove(xCurrent,yCurrent,xFuture,yFuture);
            }
            case HORSE -> {
                return false;
            }
            case BISHOP -> {
                return false;
            }
            case QUEEN -> {
                return false;
            }
            case KING -> {
                return false;
            }
            default -> {
                return false;
            }
        }
    }

    public void playChessGame(){
        //create Scanner object to take user input
        Scanner moveInput = new Scanner(System.in);
        boolean stillPlaying = true;
        while (stillPlaying){
            System.out.print("Enter move (9 9 9 9 to exit): ");
            int xCurrent = moveInput.nextInt() - 1;
            int yCurrent = moveInput.nextInt() - 1;
            int xFuture = moveInput.nextInt() - 1;
            int yFuture = moveInput.nextInt() - 1;

            if(xCurrent > 7 && yCurrent > 7 && xFuture > 7 && yFuture > 7){
                stillPlaying = false;
                System.out.println("Game over.");
                return;
            }
            //System.out.println(this.piecesOnChessboard[yCurrent][xCurrent].nameOfPiece);

            boolean isLegalMove = this.checkLegalMove(this.piecesOnChessboard[yCurrent][xCurrent], xCurrent, yCurrent, xFuture, yFuture);
            //System.out.println("the move is legal: " + isLegalMove);
            if(isLegalMove){
                this.piecesOnChessboard[yFuture][xFuture] = this.piecesOnChessboard[yCurrent][xCurrent];
                this.piecesOnChessboard[yCurrent][xCurrent] = new Piece(Color.NO_COLOR, PieceNames.NO_PIECE);
            }
            this.printChessBoard();
        }
    }

    public static void main(String[] args) {
        //create new chessboard
        Chessboard ChessBoard = new Chessboard();

        //setup pieces for a new game
        ChessBoard.setupNewChessGame();

        //print the chess board to start the game
        ChessBoard.printChessBoard();

        //start playing chess
        ChessBoard.playChessGame();

    }
}
