package session10;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class b_DemoInputStream {

    public static void main(String[] args) {
        Path path = Paths.get("./src/session10/giraffe.jpg");
        InputStream is = null;
        try {
            is = Files.newInputStream(path);
            System.out.println("Ready to read the file.");

            System.out.println("Reading the File.");
            for (int i = 0; i < 100; i++) {
                System.out.println(is.read());
            }
            System.out.println("Stop Reading the File.");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    System.out.println("The File could not be closed!! ");
                }
            }
        }

    }
}
