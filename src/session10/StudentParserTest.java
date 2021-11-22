package session10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentParserTest {

    @Test
    void parse() {
        String line = "Frxdxrxk Bxdx Thxrbxnsxn, 46, Copenhagen, AAU";
        StudentImproved studentImproved = StudentParser.parse(line);
        assertEquals(46,studentImproved.getAge());
    }
}