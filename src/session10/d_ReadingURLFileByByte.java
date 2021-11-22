package session10;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class d_ReadingURLFileByByte {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {

        URL url = new URL("https://raw.githubusercontent.com/andresmasegosa/OOP_F21/main/README.md");

        try (InputStream is = url.openStream()) {
            int length = 0;
            int b;
            while ((b = is.read()) != -1) {
                length++;
            }
            System.out.println("Read " + length + " bytes.");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }
    }
}
