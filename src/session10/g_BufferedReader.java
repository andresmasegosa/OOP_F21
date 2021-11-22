package session10;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class g_BufferedReader {

    public static void main(String[] args) {
        Path path = Paths.get("./src/session10/names.txt");

        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }


        //Now Using Streams:
        try (BufferedReader reader = Files.newBufferedReader(path)) {

            reader.lines().forEach(line -> System.out.println(line));

        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }


        //Exercise: Read each line and create a Student object (using map function).
        //          Finally, print out all students objects.
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("./src/session10/names.csv"))) {
            List<StudentImproved> students = reader.lines().map(StudentImproved::new).toList();
            students.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }



    }
}
