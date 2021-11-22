package session10;

public class StudentImproved {
    private String name;
    private int age;
    private String city;
    private String university;

    public StudentImproved(String name) {
        if (!name.contains(",")) {
            this.name = name;
        } else {
            String[] csventries = name.split(",");
            this.name = csventries[0].trim();
            this.age = Integer.parseInt(csventries[1].trim());
            this.city = csventries[2].trim();
            this.university = csventries[3].trim();
        }
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
