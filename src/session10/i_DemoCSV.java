package session10;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class i_DemoCSV {

    public static void main(String[] args) {
        Path path = Paths.get("./src/session10/names.csv");

        try (BufferedReader reader = Files.newBufferedReader(path)) {

            List<StudentImproved> list = reader.lines()
                    .map(line -> StudentParser.parse(line)).toList();

            List<StudentImproved> studentBelow50 =
                    list.stream().filter(student -> student.getAge()<50).toList();


            for (StudentImproved student : list) {
                System.out.println(student);
            }
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }

    }
}
