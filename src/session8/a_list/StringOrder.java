package session8.a_list;

import java.util.Comparator;

public class StringOrder implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        //return o1.length()-o2.length();
        return o1.compareTo(o2);
    }
}
