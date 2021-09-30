package session1.Problem15_session0_Matthias;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player;

    @BeforeEach
    void setUp(){
        player = new Player("Andres", "Masegosa", 40);
        player.updatePlayerStats(true);
        player.updatePlayerStats(true);
        player.updatePlayerStats(false);
    }
    @Test
    void ratio() {
        assertEquals(2.0, player.ratio());

    }

    @Test
    void updatePlayerStats() {
        assertEquals(2, player.numberOfWonMatches);
        assertEquals(1, player.numberOfLostMatches);
    }
}