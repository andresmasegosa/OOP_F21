package session10;

public class StudentImproved {
    private String name;
    private int age;
    private String city;
    private String university;

    public StudentImproved(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "StudentImproved{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
