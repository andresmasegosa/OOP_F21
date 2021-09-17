package Chess;

public class Location {
    int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + this.x +
                ", y=" + this.y +
                '}';
    }
}
