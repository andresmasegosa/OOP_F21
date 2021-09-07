package session0.B_ClassesAndObjects;

/**
 * This class describes ..asdf
 */
class Vehicle {
    int passengers; // number of passengers.
    int fuelcap; // fuel capacity in gallons.
    int mpg; // fuel consumption in miles per gallon.

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        minivan.passengers = 7;
        minivan.fuelcap    = 16;
        minivan.mpg        = 21;

        System.out.println("Minivan Vehicle:");
        System.out.println(" Passengers: " + minivan.passengers);
        System.out.println(" Fuel Cap: " + minivan.fuelcap);
        System.out.println(" Milles Per Gallon (mgp)" + minivan.mpg);
        System.out.println();

        Vehicle sportscar = new Vehicle();
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        int minivanRange = minivan.fuelcap * minivan.mpg;
        int sportscarRange = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Range of:");
        System.out.println(" minivan: " + minivanRange + " miles.");
        System.out.println(" sportscar: " + sportscarRange + " miles.");

    }
}

