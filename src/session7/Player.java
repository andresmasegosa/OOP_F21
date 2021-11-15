package session7;

import java.util.Objects;

public class Player{

    String name;
    Colour colour;

    public Player(String name, Colour colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return name.equals(player.name) && colour.equals(player.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, colour);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", color='" + colour + '\'' +
                '}';
    }

}
