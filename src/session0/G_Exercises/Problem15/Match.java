package session0.G_Exercises.Problem15;

import java.util.Random;
import java.util.Scanner;

public class Match {
    Team t1, t2;
    double odds = .5;

    public static void main(String[] args) {
        Random rng = new Random();
        Scanner scanner = new Scanner(System.in);

        // Instantiate Players
        Player p1 = new Player("Eric", "Cartman", 10),
               p2 = new Player("Kenny", "McCormick", 10),
               p3 = new Player("Herbert", "Garrison", 41),
               p4 = new Player("Mr.", "Mackey", 50, "South Park Elementary");

        // Instantiate Teams
        Team redTeam = new Team("Red Team", p1, p2);
        Team blueTeam = new Team("Blue Team", p3, p4);

        // Instantiate Match
        Match m = new Match(redTeam, blueTeam);

        // Print Team Info
        redTeam.printInfo();
        blueTeam.printInfo();

        // Simulate match
        m.simulateMatch(rng);

        // Print Team Info again
        redTeam.printInfo();
        blueTeam.printInfo();

        // Simulate N Matches
        System.out.print("Simulate N Matches, N: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            m = new Match(redTeam, blueTeam, rng.nextDouble());
            System.out.printf("Match %d: ", i+1);
            m.simulateMatch(rng);
        }

        System.out.println("\nFinal stats:");
        redTeam.printInfo();
        blueTeam.printInfo();
    }

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
            updateTeamStats(t1, t2);
        else
            updateTeamStats(t2, t1);
    }

    private void updateTeamStats(Team winner, Team loser) {
        winner.p1.wins++;
        winner.p2.wins++;

        loser.p1.losses++;
        loser.p2.losses++;
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
        Player best = t1.p1;
        if (t1.p2.ratio() > best.ratio()) best = t1.p2;
        if (t2.p1.ratio() > best.ratio()) best = t2.p1;
        if (t2.p2.ratio() > best.ratio()) best = t2.p2;
        return best;
    }
}
