package session1.Problem15_session0_Matthias;

import java.util.Random;

public class Match {
    Team t1, t2;
    double odds = .5;

    Match(Team one, Team two) {
        this.t1 = one;
        this.t2 = two;
    }

    Match(Team one, Team two, double chance) {
        this.t1 = one;
        this.t2 = two;
        this.odds = chance;
    }

    double averageAgeOfPlayers() {
        return (this.t1.averageAge() + this.t2.averageAge())/2;
    }

    void simulateMatch(Random rng) {
        if (rng.nextDouble() < odds)
            updateMatchStats(t1, t2);
        else
            updateMatchStats(t2, t1);
    }

    private void updateMatchStats(Team winner, Team loser) {
        winner.updateTeamStats(true);
        loser.updateTeamStats(false);

        //winner.p1.numberOfWonMatches++;
        //winner.p2.numberOfWonMatches++;

        //loser.p1.numberOfLostMatches++;
        //loser.p2.numberOfLostMatches++;

        printMatchResults(winner, loser);
    }

    private void printMatchResults(Team winner, Team loser) {
        Player mvp = bestPlayer();
        System.out.println(
                String.format("%s vs %s | %s WINS! | MVP: %s %s, Ratio: %.2f | (Avg. age of players: %.2f)",
                        t1.name, t2.name,
                        winner.name,
                        mvp.firstName, mvp.lastName, mvp.ratio(),
                        averageAgeOfPlayers()
                )
        );
    }

    Player bestPlayer() {

        if (this.t1.bestTeamPlayer().ratio()>this.t2.bestTeamPlayer().ratio())
            return this.t1.bestTeamPlayer();
        else
            return this.t2.bestTeamPlayer();
    }
}
