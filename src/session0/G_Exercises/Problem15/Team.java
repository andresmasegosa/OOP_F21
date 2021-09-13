package session0.excercise15;

public class Team {
    String teamName;
    BadmintonPlayer p1;
    BadmintonPlayer p2;

    Team(String teamName, BadmintonPlayer p1, BadmintonPlayer p2){
        this.teamName = teamName;
        this.p1 = p1;
        this.p2 = p2;
    }

    double avgTeamAge(){
        return (double) (this.p1.age + this.p2.age) / 2;
    }
}
