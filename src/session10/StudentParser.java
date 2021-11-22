package session10;

public class StudentParser {

    public static StudentImproved parse(String line){
        String[] parts = line.split(",");

        StudentImproved student= new StudentImproved(parts[0].trim());
        student.setAge(Integer.valueOf(parts[1].trim()));
        student.setCity(parts[2].trim());
        student.setUniversity(parts[3].trim());

        return student;
    }

}
