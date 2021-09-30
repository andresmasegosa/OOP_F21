package session1.Problem15_session0_Matthias;

public class Team {
    String name;
    Player p1, p2;

    Team(String name, Player one, Player two) {
        this.name = name;
        this.p1 = one;
        this.p2 = two;
    }

    double averageAge() {
        return (p1.getAge() + p2.getAge()) / 2.0;
    }


    void printInfo() {
        String teamInfo = String.format("Teamname: %s, Average Age: %.2f", this.name, averageAge());
        System.out.println(teamInfo);
        System.out.println("\tPlayer1) " + p1.toString());
        System.out.println("\tPlayer2) " + p2.toString());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + this.name + '\'' +
                ", p1=" + this.p1 +
                ", p2=" + this.p2 +
                '}';
    }

    public void updateTeamStats(boolean wonMatch) {
        this.p1.updatePlayerStats(wonMatch);
        this.p2.updatePlayerStats(wonMatch);
    }

    Player bestTeamPlayer() {
        if (this.p1.ratio()>this.p2.ratio())
            return p1;
        else
            return p2;
    }

    public static void main(String[] args) {
        Player p1 = new Player("Eric", "Cartman", 10),
                p2 = new Player("Kenny", "McCormick", 10);

        // Instantiate Teams
        Team redTeam = new Team("Red Team", p1, p2);

        System.out.println(redTeam);
    }
}
