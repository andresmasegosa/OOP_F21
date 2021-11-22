package session10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class h_FilesAllLines {
    public static void main(String[] args) {
        Path path = Paths.get("./src/session10/names.txt");


        try {
            Files.lines(path).map(line -> new Student(line)).forEach(student -> System.out.println(student));
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }


        //Exercise: Repeat the above process by using

    }
}
