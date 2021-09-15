public class Player {
	String firstname;
	String lastname;
	int age;
	//String sponsor;
	int wins;
	int loses;

	Player (String firstname, String lastname, int age, int wins, int loses){
		this.firstname 	= firstname;
		this.lastname  	= lastname;
		this.age 				= age;
		//this.sponsor 		= sponsor;
		this.wins 			= wins;
		this.loses 			= loses;
	}

	double ratio (){
		return (((double) this.wins / (double) this.loses));
	}

}
