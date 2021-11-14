package session8.b_set;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;


class Card {
    String name;

    public Card(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return name.equals(card.name);
    }

    @Override
    public int hashCode() {
        Random r = new Random();
        return r.nextInt();
    }
}

public class DemoCard_HashCode {

    public static void main(String[] args) {
        Card q1 = new Card("Queen of Spaces");
        Card q2 = new Card("Queen of Spaces");

        Set<Card> cards = new HashSet<>();
        cards.add(q1);
        cards.add(q2);

        System.out.println(cards.contains(q1));

        //Exercise: Fix the hasCode.
    }


}

