package session8.c_sortedset;


import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSortedSetComparable {
    public static void main(String[] args) {
        SortedSet<Person> persons = new TreeSet<>();

        persons.add(new Person("Magnus", "Madsen", 31));
        persons.add(new Person("Bjarke", "Thomsen", 27));

        System.out.println(persons.first());
        System.out.println(persons.last());

        System.out.println(persons.first().compareTo(persons.last()));
        System.out.println(persons.last().compareTo(persons.first()));

    }
}

