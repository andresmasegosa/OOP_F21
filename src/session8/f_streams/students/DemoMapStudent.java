package session8.f_streams.students;

import java.util.List;
import java.util.stream.Collectors;

public class DemoMapStudent {


    public static void main(String[] args) {

        List<String> names = Names.names;

        List<Student> students = names.stream().map(name -> new Student(name)).collect(Collectors.toList());

        for (Student student: students){
            System.out.println(student);
        }

        //Exercise: Use the local variable **students** and create another list with Student objects whose name ends with an "n".


    }
}
