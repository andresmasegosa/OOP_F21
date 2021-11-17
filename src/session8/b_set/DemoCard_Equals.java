package session8.b_set;


import java.util.HashSet;
import java.util.Set;

public class DemoCard_Equals {
    public static void main(String[] args) {
        Card2 q1 = new Card2("QUEEN of Spaces");
        Card2 q2 = new Card2("Queen of Spaces");

        //System.out.println(q1.equals(q2));

        Set<Card2> cards = new HashSet<>();
        cards.add(q1);
        cards.add(q2);

        System.out.println(cards.size());

        //Exercise: Fix the equals method.

    }
}
