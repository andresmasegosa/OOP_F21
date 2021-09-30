package session1.Problem15_session0_Matthias;

public class Player {
    String firstName, lastName;
    int age,
        numberOfWonMatches = 0,
        numberOfLostMatches = 0;
    String sponsor = "";

    Player(String firstName, String ln, int age) {
        this.firstName = firstName;
        this.lastName = ln;
        this.age = age;
    }

    Player(String fn, String ln, int age, String sponsor) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = age;
        this.sponsor = sponsor;
    }

    public int getAge() {
        return age;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder(
                String.format(
                        "Name: %s %s, Age: %d, Wins: %d, Losses: %d, W/L Ratio: %.2f",
                        this.firstName, this.lastName, this.age, this.numberOfWonMatches, this.numberOfLostMatches, this.ratio()
                )
        );
        if(!this.sponsor.isEmpty())
            sb.append(" (Sponsor: ").append(this.sponsor).append(')');

        return sb.toString();
    }

    double ratio() {
        return (this.numberOfLostMatches != 0 && this.numberOfWonMatches != 0) ? (double) this.numberOfWonMatches / (double) this.numberOfLostMatches : 0.0;
    }

    public void updatePlayerStats(boolean wonMatch){
        if (wonMatch){
            this.numberOfWonMatches++;
        }else{
            this.numberOfLostMatches++;
        }
    }
    public static void main(String[] args) {
        Player player = new Player("Andres", "Masegosa", 40);
        System.out.println(player);
    }
}





