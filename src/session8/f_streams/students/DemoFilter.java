package session8.f_streams.students;

import java.util.List;
import java.util.stream.Collectors;

public class DemoFilter {

    public static void main(String[] args) {

        List<String> names = Names.names;

        List<String> namesStartingWithL = names.stream().filter(name -> name.startsWith("L")).collect(Collectors.toList());

        for (String name: namesStartingWithL){
            System.out.println(name);
        }

        //Exercise: Filter those names which ends with an "n".


    }
    
}
