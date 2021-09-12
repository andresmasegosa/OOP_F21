package session0.G_Exercises.Problem15;

public class Player {
    String firstName, lastName;
    int age,
        wins = 0,
        losses = 0;
    String sponsor = "";

    Player(String fn, String ln, int age) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = age;
    }
    Player(String fn, String ln, int age, String sponsor) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = age;
        this.sponsor = sponsor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(
                String.format(
                        "Name: %s %s, Age: %d, Wins: %d, Losses: %d, W/L Ratio: %.2f",
                        this.firstName, this.lastName, this.age, this.wins, this.losses, this.ratio()
                )
        );
        if(!this.sponsor.isEmpty())
            sb.append(" (Sponsor: ").append(this.sponsor).append(')');

        return sb.toString();
    }

    double ratio() {
        return (this.losses != 0 && this.wins != 0) ? (double) this.wins / (double) this.losses : 0.0;
    }
}