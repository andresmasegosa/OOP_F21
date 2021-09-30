package Chess;

import java.util.Scanner;

public class Chessboard {
    Piece[][] piecesOnChessboard;

    public Chessboard() {
        this.piecesOnChessboard = new Piece[8][8];
    }

    public void printChessBoard(){
        for(int i = 0; i <= 7; i++){
            for(int j = 0; j <= 7; j++){
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

    public boolean checkMoveRules(Piece piece, int xCurrent, int yCurrent, int xFuture, int yFuture){
        switch (piece.nameOfPiece){
            case PAWN -> {
                return piece.pawnMove(xCurrent, yCurrent, xFuture, yFuture);
            }
            case ROOK -> {
                return piece.rookMove(xCurrent,yCurrent,xFuture,yFuture);
            }
            case HORSE -> {
                return piece.horseMove(xCurrent,yCurrent,xFuture,yFuture);
            }
            case BISHOP -> {
                return piece.bishopMove(xCurrent,yCurrent,xFuture, yFuture);
            }
            case QUEEN -> {
                return piece.queenMove(xCurrent, yCurrent, xFuture, yFuture);
            }
            case KING -> {
                return piece.kingMove(xCurrent, yCurrent, xFuture, yFuture);
            }
            default -> {
                return false;
            }
        }
    }

    public boolean isInputValid(int xCurrent, int yCurrent, int xFuture, int yFuture){
        //if user want to exit game, or if input is out of array
        if(xCurrent > 7 || yCurrent > 7 || xFuture > 7 || yFuture > 7){
            System.out.println("Game over.");
            System.exit(0);
        }
        //if move means not moving the piece
        else if ((xCurrent - xFuture == 0) && (yCurrent - yFuture == 0)){ return false; }

        return true;
    }

    public void updateChessBoard(int xCurrent, int yCurrent, int xFuture, int yFuture){
        this.piecesOnChessboard[yFuture][xFuture] = this.piecesOnChessboard[yCurrent][xCurrent];
        this.piecesOnChessboard[yCurrent][xCurrent] = new Piece(Color.NO_COLOR, PieceNames.NO_PIECE);
    }

    public void playChessGame(){

        //create Scanner object to take user input
        Scanner moveInput = new Scanner(System.in);

        boolean stillPlaying = true;
        boolean validInput;
        boolean isLegalMove;
        while (stillPlaying){
            this.printChessBoard();
            System.out.print("Enter move (9 9 9 9 to exit): ");
            int xCurrent = moveInput.nextInt() - 1;
            int yCurrent = moveInput.nextInt() - 1;
            int xFuture = moveInput.nextInt() - 1;
            int yFuture = moveInput.nextInt() - 1;

            validInput = isInputValid(xCurrent, yCurrent, xFuture, yFuture);
            isLegalMove = this.checkMoveRules(this.piecesOnChessboard[yCurrent][xCurrent], xCurrent, yCurrent, xFuture, yFuture);

            if(validInput && isLegalMove){
                updateChessBoard(xCurrent, yCurrent, xFuture, yFuture);
            } else {
                stillPlaying = false;
            }
        }
    }

    public static void main(String[] args) {
        //create new chessboard
        Chessboard ChessBoard = new Chessboard();

        //setup pieces for a new game
        ChessBoard.setupNewChessGame();

        //start playing chess
        ChessBoard.playChessGame();
    }
}
