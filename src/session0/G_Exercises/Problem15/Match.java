package session0.G_Exercises.Problem15;

public class Match {
    Team red;
    Team blue;
    boolean redWins;

    Match(Team red, Team blue, boolean redWins) {
        this.red = red;
        this.blue = blue;
        this.redWins = redWins;
    }

    double winLossRatio() {
        return (double) (this.red.p1.won + this.red.p2.won + this.blue.p1.won + this.blue.p2.won) /
                (double) (this.red.p1.lost + this.red.p2.lost + this.blue.p1.lost + this.blue.p2.lost);
    }

    public void updateRedWon() {
        if (this.redWins) {
            this.red.p1.won++;
            this.red.p2.won++;
            this.blue.p1.lost++;
            this.blue.p2.lost++;
        } else {
            this.red.p1.lost++;
            this.red.p2.lost++;
            this.blue.p1.won++;
            this.blue.p2.won++;
        }
    }

    public static void main(String[] args) {
        BadmintonPlayer p1 = new BadmintonPlayer("Anders", "Andersen",23,10, 0, true);
        BadmintonPlayer p2 = new BadmintonPlayer("Benny", "Bennysen",25,8, 2, false);
        BadmintonPlayer p3 = new BadmintonPlayer("Carsten", "Carstensen",20,5, 5, true);
        BadmintonPlayer p4 = new BadmintonPlayer("Daniel", "Danielsen",32,1, 9, false);
        Team red = new Team("red", p1, p2);
        Team blue = new Team("blue", p3, p4);
        Match match1 = new Match(red, blue, true);
        match1.updateRedWon();

        System.out.println(match1.red.p1.won);
    }
}
