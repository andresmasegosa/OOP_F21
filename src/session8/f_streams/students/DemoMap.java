package session8.f_streams.students;

import java.util.List;
import java.util.stream.Collectors;

public class DemoMap {

    public static void main(String[] args) {

        List<String> names = Names.names;

        List<String> upperCaseNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

        for (String name: upperCaseNames){
            System.out.println(name);
        }

        //Exercise: Only convert to upper case those names which ends with an "n". Tip: Filter first and then do the map.


    }
}
