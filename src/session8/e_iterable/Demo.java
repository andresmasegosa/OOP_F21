package session8.e_iterable;

public class Demo {

    public static void main(String[] args) {

        Planet venus = new Planet("Venus");
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");
        Planet pluto = new Planet("pluto");


        SolarSystem solarSystem = new SolarSystem("Solar System", venus, earth, mars, pluto);

        for (Planet system: solarSystem){
            System.out.println(system);
        }

    }

}
