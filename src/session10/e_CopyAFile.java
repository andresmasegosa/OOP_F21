package session10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class e_CopyAFile {

    public static void main(String[] args) {
        Path inputPath = Paths.get("./src/session10/giraffe.jpg");
        Path outputPath = Paths.get("./src/session10/giraffe2.jpg");

        long start = System.currentTimeMillis();

        try (InputStream is = Files.newInputStream(inputPath);
             OutputStream os = Files.newOutputStream(outputPath)) {

            int b;
            while ((b = is.read()) != -1) {
                os.write(b);
            }

        } catch (IOException e) {
            System.out.println("Unable to read/write the file.");
        }

        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " milliseconds");

        // Exercise: Read and write the files in chunks of 10000 bytes,
        // using the appropriate methods of InputStream and OutputStream.

        start = System.currentTimeMillis();

        try (InputStream is = Files.newInputStream(inputPath);
             OutputStream os = Files.newOutputStream(outputPath)) {

            byte[] bytes = new byte[10000];
            int b;
            while ((b = is.read(bytes)) != -1) {
                os.write(bytes,0,b);
            }

        } catch (IOException e) {
            System.out.println("Unable to read/write the file.");
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " milliseconds");



    }
}
