package session0.E_Constructors;

/**
 * A constructor is a special method called when an object is created.
 *   ◦ A class comes with a default empty constructor.
 *   ◦ We can use constructors to better control object creation.
 *   ◦ A constructor has the same name as the class name.
 */

class Vehicle {
    int passengers; // number of passengers.
    int fuelcap; // fuel capacity in gallons.
    int mpg; // fuel consumption in miles per gallon.


    /**
     * Empty Constructor. Instance variables will not be set.
     */
    Vehicle() {

    }

    /**
     * Constructor where number of passengers, fuel capacity and consumption in miles per gallon can be specified.
     * @param p, number of passengers of the vehicle.
     * @param f, fuel capacity in gallons of the vehicle.
     * @param m, fuel consumption in miles per gallon of the vehicle.
     */
    Vehicle(int p, int f, int m) {
        this.passengers = p;
        this.fuelcap = f;
        this.mpg = m;
    }


    /**
     * Constructor where fuel capacity and consumption in miles per gallon can be specified. The number of
     * passengers is set by default to 5.
     * @param f, fuel capacity in gallons of the vehicle.
     * @param m, fuel consumption in miles per gallon of the vehicle.
     */
    Vehicle(int f, int m) {
        this.passengers = 5;
        this.fuelcap = f;
        this.mpg = m;
    }

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        minivan.passengers = 7;
        minivan.fuelcap    = 16;
        minivan.mpg        = 21;

        System.out.println("Vehicle created with empty constructor:");
        System.out.println(" Passengers: " + minivan.passengers);
        System.out.println(" Fuel Cap: " + minivan.fuelcap);
        System.out.println(" Milles Per Gallon (mgp): " + minivan.mpg);
        System.out.println();

        Vehicle minivan2 = new Vehicle(7, 14, 12);

        System.out.println("Vehicle created with non-empty constructor:");
        System.out.println(" Passengers: " + minivan2.passengers);
        System.out.println(" Fuel Cap: " + minivan2.fuelcap);
        System.out.println(" Milles Per Gallon (mgp): " + minivan2.mpg);
        System.out.println();

        Vehicle minivan3 = new Vehicle(14, 12);

        System.out.println("Vehicle created with alternative non-empty constructor:");
        System.out.println(" Passengers: " + minivan3.passengers);
        System.out.println(" Fuel Cap: " + minivan3.fuelcap);
        System.out.println(" Milles Per Gallon (mgp): " + minivan3.mpg);

    }
}

