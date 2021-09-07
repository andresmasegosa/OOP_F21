package session0.D_Methods;


class Vehicle {
    int passengers; // number of passengers.
    int fuelcap; // fuel capacity in gallons.
    int mpg; // fuel consumption in miles per gallon.


    /**
     * Method for computing
     * @param miles
     * @return
     */
    double fuelNeeded(int miles) {
        return (double) miles / (double) this.mpg;
    }

    double fuelNeeded2(int miles) {
        return (double) miles / (double) mpg; // equivalent.
    }

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        minivan.passengers = 7;
        minivan.fuelcap    = 16;
        minivan.mpg        = 21;

        Vehicle sportscar = new Vehicle();
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println("Fuel Needed for 250 miles :");
        System.out.println(" minivan: " + minivan.fuelNeeded(250) + " gallons.");
        System.out.println(" sportscar: " + sportscar.fuelNeeded(250) + " gallons.");

        System.out.println();
    }
}

