package session10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class f_BufferedStreams {

    public static void main(String[] args) {
        Path inputPath = Paths.get("./src/session10/giraffe.jpg");
        Path outputPath = Paths.get("./src/session10/giraffe2.jpg");

        long start = System.currentTimeMillis();

        try (InputStream is = new BufferedInputStream(Files.newInputStream(inputPath));
             OutputStream os = new BufferedOutputStream(Files.newOutputStream(outputPath))) {

            int b;
            while ((b = is.read()) != -1) {
                os.write(b);
            }

        } catch (IOException e) {
            System.out.println("Unable to read/write the file.");
        }

        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " milliseconds");

        // Exercise: Measure the time of doing that without BufferedStreams.


    }

}
