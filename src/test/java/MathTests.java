/*  MathTest by MF, JRE 11
    A Maven model project imported via pox.xml
    For run configuration, for Application with Main class as Main
    For run configuration, for unit testing, Run Test within MathTests as Run 'MathTests'
    SOLID principles of object-oriented programming
    Part-based on 'Introduction to Unit Testing with Java' by Christian Vasquez
*/

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public final class MathTests {
    private Maths myMaths;

    @BeforeTest
    public void Setup() {
        myMaths = new Maths();
    }

    @Test
    public void TestNG() {
        String str = "TestNG is OK";
        assertEquals("TestNG is OK", str);
    }

    @Test
    public void parse_IntegerIncInteger() {
        assertEquals(myMaths.mathsParseNum("1.0", true), 1.0);
    }

    @Test
    public void parse_FloatIncInteger() {
        assertEquals(myMaths.mathsParseNum("1.0", false), 1.0);
    }

    @Test
    public void parse_FloatIncFloat() {
        assertEquals(myMaths.mathsParseNum("1.1", false), 1.1);
    }

    @Test
    public void parse_FloatExcInteger() {
        assertEquals(myMaths.mathsParseNum("1.1", true), null);
    }

    @Test
    public void parse_IntegerExcString() {
        assertEquals(myMaths.mathsParseNum("X", true), null);
    }

    @Test
    public void parse_FloatExcString() {
        assertEquals(myMaths.mathsParseNum("X", false), null);
    }

    @Test
    public void parse_IntegerExcNull() {
        assertEquals(myMaths.mathsParseNum(null, true), null);
    }

    @Test
    public void parse_FloatExcNull() {
        assertEquals(myMaths.mathsParseNum(null, false), null);
    }

    @Test
    public void six_Add() { assertEquals(myMaths.mathsAdd(6.0, 2.0), 8.0); }

    @Test
    public void six_Subtract() { assertEquals(myMaths.mathsSubtract(6.0, 2.0), 4.0); }

    @Test
    public void six_Multiply() { assertEquals(myMaths.mathsMultiply(6.0, 2.0), 12,0); }

    @Test
    public void six_Divide() { assertEquals(myMaths.mathsDivide(6.0, 2.0), 3.0); }

    @Test
    public void DivideByZero() { assertEquals(myMaths.mathsDivide(6.0, 0.0), null); }

    @AfterTest
    public void tearDown() {
        myMaths = null;
    }
}
