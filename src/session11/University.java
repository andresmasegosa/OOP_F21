package session11;

/**
 *  The {@code University} enum stores the different universities any student is attending to. This information
 *  is stored in a {@link session11.Student Student}'s object.
 *
 *  These are the possible values:
 *
 *  <p>
 *  - {@link #AAU} refers to Aalborg University (@see <a href="http://google.com">http://google.com</a>).
 *  <p>
 *  - {@link #CPH} refers to University of Copenhagen (@see <a href="http://www.ku.dk">http://www.ku.dk</a>).
 *  <p>
 *  - {@link #DTU} refers to Technical University of Denmark (@see <a href="http://www.dtu.dk">http://www.dtu.dk</a>).
 *  <p>
 *  - {@link #ITU} refers to IT University of Copenhagen (@see <a href="http://www.itu.dk">http://www.itu.dk</a>).
 *  <p>
 *
 *  This is  example of how we can set the university of an already existing {@link session11.Student Student}'s object:
 *
 * <blockquote><pre>
 *     Student student = new Student("Andres");
 *     student.setUniversity(University.AAU);
 * </pre></blockquote>
 *
 *
 *  @author Andres Masegosa
 *  @see session11.Student
 *  @since 0.1
 */
public enum University {
    /** Aalborg University (@see <a href="http://google.com">http://google.com</a>). */
    AAU,
    /** University of Copenhagen (@see <a href="http://www.ku.dk">http://www.ku.dk</a>). */
    CPH,
    /** Technical University of Denmark (@see <a href="http://www.dtu.dk">http://www.dtu.dk</a>). */
    DTU,
    /** IT University of Copenhagen  (@see <a href="http://www.itu.dk">http://www.itu.dk</a>). */
    ITU
}
