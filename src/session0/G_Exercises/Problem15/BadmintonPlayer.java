package session0.G_Exercises.Problem15;

public class BadmintonPlayer {
    String firstName;
    String lastName;
    int age;
    int won;
    int lost;
    boolean sponsor;

    BadmintonPlayer(String firstName, String lastName, int age, int won, int lost, boolean sponsor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.won = won;
        this.lost = lost;
        this.sponsor = sponsor;
    }

    double winLossRatio(){

        return (double) this.won / this.lost;
    }
}
