package session8.f_streams.solarsystem;

public class Planet {
    String name;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "System{" +
                "name='" + name + '\'' +
                '}';
    }

}
