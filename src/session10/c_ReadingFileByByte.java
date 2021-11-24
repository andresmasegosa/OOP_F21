package session10;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class c_ReadingFileByByte {
    public static void main(String[] args) {
        Path path = Paths.get("./src/session10/giraffe.jpg");

        long start = System.currentTimeMillis();

        try (InputStream is = Files.newInputStream(path)) {
            int length = 0;
            int b;
            while ((b = is.read()) != -1) {
                length++;
            }
            System.out.println("Read " + length + " bytes.");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }

        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " milliseconds");

        // Exercise: Read the file in chunks of 10000 bytes, using the method
        // "int read(byte[] bytes)" of InputStream and measure the time.


        byte[] array = new byte[10000];

        start = System.currentTimeMillis();

        try (InputStream is = Files.newInputStream(path)) {
            int length = 0;
            int b;
            while ((b = is.read(array)) != -1) {
                length+=b;
            }
            System.out.println("Read " + length + " bytes.");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }

        finish = System.currentTimeMillis();
        System.out.println(finish - start + " milliseconds");

    }
}