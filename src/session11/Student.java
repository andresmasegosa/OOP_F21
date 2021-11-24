package session11;

/**
 * The {@code Student} class represents a person attending to a university. A {@code Student} object
 * contains information about the name of the student, her/his age, the city where s/he is atteding to
 * the university and, finally, the name of the university.
 *
 * <p>
 *  This name of the student is not mutable, but the age, the city and the university are mutable.
 *  The student's university is defined according to the enum {@link session11.University University}.
 *  <p>
 *
 *  This is an example of the creation of a {@code Student} object.
 *
 * <blockquote><pre>
 *     Student student = new Student("Andres");
 *     student.setAge(40);
 *     student.setCity("Copenhagen");
 *     student.setUniversity(University.AAU);
 * </pre></blockquote>
 *
 * @author Andres Masegosa
 * @see session11.University
 * @since 0.1
 */
public class Student {

    /* Contains the name of the student */
    private String name;

    /* Contains the age of the student */
    private int age;

    /* Contains the city of the student */
    private String city;

    /**
     * Contains the university of the student.
     * The value is defined according to the enum {@link session11.University University}.
     */
    private University university;

    /**
     * Initializes a newly created {@code Student} object with a given name. Information
     * about the age, the city and the university is not provided.
     * @param name, a A {@code String} object containing the name of the student.
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Getter for the age of the student.
     * @return an {@code integer} specifying the age of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the age of the student.
     * @param age, an {@code integer} specifying the age of the student.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter for the age of the student
     * @return the age of the student as an {@code integer} value.
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter for the city where the student is attending the university.
     * @param city, an {@code String} object specifying the city where the student is attending the university.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for the city where the student is attending the university.
     * @return an {@code String} object specifying the city where the student is attending the university.
     */
    public String getCity() {
        return city;
    }


    //Fill the comments


    public void setUniversity(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }

}
