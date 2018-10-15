// Added for Steve's Thursday AM
import static org.junit.Assert.*;
import org.junit.*;
import junit.runner.Version;

public class TestsTDD {
    private MethodsTDD myMethodsTDD;

    @Before
    public void setup() { myMethodsTDD = new MethodsTDD(); }

    @Test
    public void positivesAddTDD() { assertEquals(myMethodsTDD.tddNewADD(1.0, 2.0), 3.0, 0); }

    @Test
    public void negativesAddTDD() { assertEquals(myMethodsTDD.tddNewADD(-1.0, -2.0), -3.0, 0); }

    @Test
    public void val2NullAddTDD() { assertNull(myMethodsTDD.tddNewADD(1.0, null)); }

    @Test
    public void val1NullAddTDD() { assertNull(myMethodsTDD.tddNewADD(null, 1.0)); }

    @Test
    public void bothNullAddTDD() { assertNull(myMethodsTDD.tddNewADD(null, null)); }
}
