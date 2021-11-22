package session10;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class c_DemoTry_With_Resources {
    public static void main(String[] args) {
        Path path = Paths.get("./src/session10/giraffe.jpg");

        try (InputStream is = Files.newInputStream(path)) {
            System.out.println("Ready to read the file.");

            System.out.println("Reading the File.");
            for (int i = 0; i < 100; i++) {
                System.out.println(is.read());
            }
            System.out.println("Stop Reading the File.");

        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }

        //Exercise: Try to comment out the catch part of the code. I mean, imagine that you forget to handle the IOException.


    }
}