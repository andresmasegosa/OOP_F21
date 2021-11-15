package session8.f_streams.solarsystem;

import java.util.List;
import java.util.stream.Collector;

public class SolarSystemCollector {

    public static Collector<Planet, SolarSystem, SolarSystem> collect(){
        return Collector.of(SolarSystem::new, SolarSystem::add,
                (left, right) -> { left.addAll(right); return left; });
    }

}
