package session8.c_sortedset;

class Person implements Comparable<Person> {
    private String fstName;
    private String lstName;
    private int age;

    public Person(String fstName, String lstName, int age) {
        this.fstName = fstName;
        this.lstName = lstName;
        this.age = age;
    }

    @Override
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
