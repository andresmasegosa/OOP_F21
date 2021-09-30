package session1.Problem15_session0_Matthias;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
    Team team;

    @BeforeEach
    void setup(){
        Player p1 = new Player("Eric", "Cartman", 10),
                p2 = new Player("Kenny", "McCormick", 20);

        // Instantiate Teams
        team = new Team("Red Team", p1, p2);
        team.updateTeamStats(true);
        team.updateTeamStats(false);
    }

    @Test
    void averageAge() {
        assertEquals(15.0, team.averageAge());
    }

    @Test
    void updateTeamStats() {
        assertEquals(1.0, team.p1.ratio());
        assertEquals(1.0, team.p2.ratio());
    }

    @Test
    void bestTeamPlayer() {

    }
}