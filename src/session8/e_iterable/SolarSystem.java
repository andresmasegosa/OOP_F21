package session8.e_iterable;

import java.util.*;

public class SolarSystem implements Iterable<Planet>{
    Collection<Planet> planets;

    public SolarSystem(Planet... planets) {
        this.planets = new ArrayList<>();

        for (Planet system: planets)
            this.planets.add(system);

    }


    @Override
    public Iterator<Planet> iterator() {
        return planets.iterator();
    }

}
