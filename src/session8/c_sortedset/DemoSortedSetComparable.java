package session8.c_sortedset;


import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private String fstName;
    private String lstName;
    private int age;

    public Person(String fstName, String lstName, int age) {
        this.fstName = fstName;
        this.lstName = lstName;
        this.age = age;
    }

    public int compareTo(Person that) {
        int fstNameCmp = this.fstName.compareTo(that.fstName);

        if (fstNameCmp != 0) {
            return fstNameCmp;
        }
        int lstNameCmp = this.lstName.compareTo(that.lstName);

        if (lstNameCmp != 0) {
            return lstNameCmp;
        }
        return this.age - that.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fstName='" + fstName + '\'' +
                ", lstName='" + lstName + '\'' +
                ", age=" + age +
                '}';
    }
}

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

