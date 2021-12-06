package session8.g_enums;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player("Andres", Colour.BLUE);
        Player player2 = new Player("Andres", Colour.RED);

        System.out.println(player.equals(player2));

    }
}
