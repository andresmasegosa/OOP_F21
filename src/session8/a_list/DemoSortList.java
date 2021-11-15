package session8.a_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoSortList {

    public static void main(String[] args) {
        List<String> cards = new ArrayList<>();

        cards.add("Ace of Hearts");
        cards.add("Queen of Spades");
        cards.add("Ten of Hearts");
        cards.add("Ace of Hearts");
        cards.add("Two of Clubs");

        //Collections.sort(cards, (o1,o2)-> o1.compareTo(o2));
        Collections.sort(cards, (o1,o2)-> o1.length() - o2.length());
        Comparator<String> comparator = new StringOrder();
        Collections.sort(cards, comparator);

        for (String card: cards){
            System.out.println(card);
        }

        //Sort the list in reverse order.


    }

}
