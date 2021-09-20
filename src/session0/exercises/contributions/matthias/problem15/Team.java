package session0.exercises.contributions.matthias.problem15;

public class Team {
    String name;
    Player p1, p2;

    Team(String name, Player one, Player two) {
        this.name = name;
        this.p1 = one;
        this.p2 = two;
    }

    double averageAge() {
        return (p1.age + p2.age) / 2;
    }

    void printInfo() {
        String teamInfo = String.format("Teamname: %s, Average Age: %.2f", this.name, averageAge());
        System.out.println(teamInfo);
        System.out.println("\tPlayer1) " + p1.toString());
        System.out.println("\tPlayer2) " + p2.toString());
        System.out.println();
    }
}
