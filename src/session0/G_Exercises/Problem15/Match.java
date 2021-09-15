public class Match {
	Team red;
	Team blue;

	Match(Team teamOne, Team teamTwo){
		this.red = teamOne;
		this.blue = teamTwo;
	}

	double averageOfMatch(){
		return ((red.teamAverage() + blue.teamAverage())/2);
	}

	double bestRatio(){
		//return highest win ratio of all the players in the match.
		if (red.playerWithHighestRatioOnTheTeam() > blue.playerWithHighestRatioOnTheTeam()) {
			return red.playerWithHighestRatioOnTheTeam();
		}
		else
			return blue.playerWithHighestRatioOnTheTeam();
	}

	static boolean matchResult() {
		//Math.random returns a value between 0.0 - 1.0. We round it and get a boolean answer to see who wins.
		if (Math.round(Math.random()) == 0) {
			System.out.println("Team red wins this round!");
			return true;
		}
		else
			System.out.println("Team blue wins this round!");
			return false;
	}

	public static void main(String[] args) {
		Player player1 = new Player("Poul", "Richard", 27, 5, 2);
		Player player2 = new Player("Life", "Bryan", 81, 10, 20);
		Player player3 = new Player("Hob", "Scott", 15, 19, 28);
		Player player4 = new Player("Eva", "Smith", 61, 20, 15);

		Team red = new Team("red", player1, player2);
		Team blue = new Team("blue", player3, player4);

		Match match = new Match(red, blue);

		int maxRounds = 10;
		System.out.println("This match has an average age of: " + match.averageOfMatch());

		int blueWins = 0;
		int redWins = 0;

		for(int i = 0; i < maxRounds; i++) {
			System.out.println("Round: " + (i+1));
			System.out.println("team red player 1: " + red.player1.ratio());
			System.out.println("team red player 2: " + red.player2.ratio());
			System.out.println("team blue player 1: " + blue.player1.ratio());
			System.out.println("team blue player 2: " + blue.player2.ratio());
			if (matchResult()) {
				red.player1.wins += 1;
				red.player1.ratio();
				red.player2.wins += 1;
				red.player2.ratio();
				redWins ++;
			}
			else {
				blue.player1.wins += 1;
				blue.player1.ratio();
				blue.player2.wins += 1;
				blue.player2.ratio();
				blueWins ++;
			}
			System.out.println("The current best player is ratio: " + match.bestRatio() + "\n");
		}
		if (redWins > blueWins){
			System.out.println("The winner of the tournament is team red!!!!");
		}
		else {
			System.out.println("The winner of the tournament is team blue!!!!");
		}
	}

}
