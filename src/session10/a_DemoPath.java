package session10;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class a_DemoPath {

    public static void main(String[] args) {
        Path path = Paths.get("./src/session10/giraffe.jpg");
        if (!Files.exists(path)) {
            System.out.println("The file does not exist.");
            return;
        }
        if (!Files.isRegularFile(path)) {
            System.out.println("The file is not a regular file.");
            return;
        }
        if (!Files.isReadable(path)) {
            System.out.println("The file is not readable.");
            return;
        }
        System.out.println("We can read the file.");

        //Exercise: Try to open a folder (e.g. session10)

    }
}
