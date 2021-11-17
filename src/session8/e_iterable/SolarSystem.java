package session8.e_iterable;

import java.util.*;

public class SolarSystem implements Iterable<Planet>{
    Collection<Planet> planets;

    public SolarSystem(String solars_system, Planet... planets) {
        this.planets = new ArrayList<>();

        this.planets.addAll(Arrays.asList(planets));

    }


    @Override
    public Iterator<Planet> iterator() {
        return planets.iterator();
    }

}
