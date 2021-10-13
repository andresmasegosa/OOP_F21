import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessPieceTest {

    ChessBoard board;
    ChessPiece piece;

    @BeforeEach
    void setUp() {
        board = new ChessBoard();
    }

    @Test
    void getColor() {
        piece = new King(board,"White");
        assertEquals("White",piece.getColor());
    }

    @Test
    void getX() {
        piece = new King(board,"White");
        piece.setX(6);
        assertEquals(6,piece.getX());
    }

    @Test
    void getY() {
    }

    @Test
    void getType() {
    }

    @Test
    void move() {
    }

    @Test
    void isLegalMove() {
    }
}