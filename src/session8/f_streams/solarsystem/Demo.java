package session8.f_streams.solarsystem;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        Planet venus = new Planet("Venus");
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");

        SolarSystem solarSystem = new SolarSystem(venus,earth,mars);

        SolarSystem solarSystem2 = solarSystem.stream().filter(planet -> planet.getName().contains("s")).collect(SolarSystemCollector.collect());

        for (Planet planet: solarSystem2){
            System.out.println(planet);
        }

    }

}
