package session1.Problem15_session0_Matthias;

import java.util.Random;
import java.util.Scanner;

public class Demo {
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

}
