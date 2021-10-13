import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KingTest {

    @Test
    void isLegalMove() {
        ChessBoard board = new ChessBoard();
        King king = new King(board,"White");
        board.setChessPiece(5,5, king);

        assertTrue(king.isLegalMove(5+0,5+1));
        assertTrue(king.isLegalMove(5+1,5+0));
        assertTrue(king.isLegalMove(5+1,5+1));
    }
}