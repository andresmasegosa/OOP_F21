package session8.b_set;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> cards = new HashSet<>();

        cards.add("Ace of Hearts");
        cards.add("Ace of Hearts");
        cards.add("Queen of Spades");
        cards.add("Queen of Spades");
        cards.add("Ten of Hearts");
        cards.add("Two of Clubs");

        cards.remove("Ten of Hearts");
        int size = cards.size();

        System.out.println(size);

        //Exercise: Print all elements of the set using a for-loop


    }
}
