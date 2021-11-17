package session8.c_sortedset;


import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSortedSetComparator {
    public static void main(String[] args) {
        SortedSet<Double> number = new TreeSet<>();
        //SortedSet<Double> number = new TreeSet<>(new DoubleComparator());

        number.add(2.0);
        number.add(1.0);
        number.add(3.0);


        System.out.println(number.first());
        System.out.println(number.last());

    }
}

