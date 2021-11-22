package session10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentImprovedTest {

    @Test
    void constructorGivenFullCSVEntryStringCreatesStudentImproved() {
        String csvEntry = "Mxthxxs Gxgxs, 26, Roskilde, AAU";
        StudentImproved s = new StudentImproved(csvEntry);

        StudentImproved expected = new StudentImproved("Mxthxxs Gxgxs");
        expected.setAge(26);
        expected.setCity("Roskilde");
        expected.setUniversity("AAU");

        assertEquals(expected.toString(), s.toString());
    }

}
