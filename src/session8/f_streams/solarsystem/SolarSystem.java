package session8.f_streams.solarsystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class SolarSystem  implements Collection<Planet>{
    Collection<Planet> planets;

    public SolarSystem(Planet... planets) {
        this.planets = new ArrayList<>();

        for (Planet system: planets)
            this.planets.add(system);

    }

    @Override
    public Stream<Planet> stream(){
        return planets.stream();
    }

    @Override
    public Stream<Planet> parallelStream(){
        return planets.parallelStream();
    }

    @Override
    public int size() {
        return this.planets.size();
    }

    @Override
    public boolean isEmpty() {
        return this.planets.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.planets.contains(o);
    }

    @Override
    public Iterator<Planet> iterator() {
        return planets.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.planets.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.planets.toArray(a);
    }

    @Override
    public boolean add(Planet planet) {
        return this.planets.add(planet);
    }

    @Override
    public boolean remove(Object o) {
        return this.planets.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.planets.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Planet> c) {
        return this.planets.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.planets.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.planets.removeAll(c);
    }

    @Override
    public void clear() {
        this.planets.clear();
    }

}
