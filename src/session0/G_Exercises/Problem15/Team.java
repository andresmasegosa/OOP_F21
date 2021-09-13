public class Team {
	String teamName;
	Player player1;
	Player player2;

	Team(String team, Player p1, Player p2){
		this.teamName = team;
		this.player1 = p1;
		this.player2 = p2;
	}

	double teamAverage(){
		return (((double) player1.age + (double) player2.age) / 2);
	}


	//
	double playerWithHighestRatioOnTheTeam(){
		if (this.player1.ratio() > this.player2.ratio()){
			return this.player1.ratio();
		}
		else
			return this.player2.ratio();
	}
}
