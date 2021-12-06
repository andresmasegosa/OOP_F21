package session8.b_set;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;


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

