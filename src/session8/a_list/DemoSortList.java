package session8.a_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoSortList {

    public static void main(String[] args) {
        List<String> cards = new ArrayList<>();

        cards.add("Ace of Hearts");
        cards.add("Queen of Spades");
        cards.add("Ten of Hearts");
        cards.add("Ace of Hearts");
        cards.add("Two of Clubs");

        //Collections.sort(cards, (c1,c2)-> c1.compareTo(c2));
        //cards.sort(String::compareTo);

        // Other sort methods
        //Collections.sort(cards, (c1,c2)-> c1.length());
        //Collections.sort(cards, (c1,c2)-> c1.length() - c2.length());
        Collections.sort(cards, (c1,c2)-> c2.length() - c1.length());

        System.out.println(cards);
        for (String card: cards){
            System.out.println(card);
        }

        //Sort the list in reverse order.


    }

}
