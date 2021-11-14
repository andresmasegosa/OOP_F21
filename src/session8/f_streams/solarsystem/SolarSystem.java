package session8.f_streams.solarsystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class SolarSystem  implements Iterable<Planet>{
    Collection<Planet> planets;

    public SolarSystem(Planet... planets) {
        this.planets = new ArrayList<>();

        for (Planet system: planets)
            this.planets.add(system);

    }

    public void addPlanet(Planet planet){
        this.planets.add(planet);
    }

    public void addSolarSystem(SolarSystem solarSystem){
        this.planets.addAll(solarSystem.planets);
    }

    public Stream<Planet> stream(){
        return planets.stream();
    }

    public Stream<Planet> parallelStream(){
        return planets.parallelStream();
    }

    @Override
    public Iterator<Planet> iterator() {
        return planets.iterator();
    }

}
