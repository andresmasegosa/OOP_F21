package session8.e_iterable;

import java.util.*;

public class SolarSystem implements Iterable<Planet>{
    Collection<Planet> planets;
    String name;

    public SolarSystem(String name, Planet... planets) {
        this.name = name;
        this.planets = new ArrayList<>();

        for (Planet system: planets)
            this.planets.add(system);

    }


    public Planet getClosesPlanetToSun(){
        //Do something
        return null;
    }

    @Override
    public Iterator<Planet> iterator() {
        return planets.iterator();
    }

}
