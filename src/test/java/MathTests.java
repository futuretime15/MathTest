/*  MathTest by MF, JRE 11
    A Maven model project imported via pox.xml
    For run configuration, for Application with Main class as Main
    For run configuration, for unit testing, Run Test within MathTests as Run 'MathTests'
    SOLID principles of object-oriented programming
    Part-based on 'Introduction to Unit Testing with Java' by Christian Vasquez
*/

import org.junit.*;

public final class MathTests {
    private Maths myMaths;

    @Before
    public void setUp() {
        myMaths = new Maths();
    }

    @Test
    public void TestNG() {
        String str1 = "TestNG is OK";
        Assert.assertEquals("TestNG is OK", str1);
    }

    @Test
    public void parse_IntegerIncInteger() {
        Assert.assertEquals(myMaths.mathsParseNum("1.0", false), 1.0, 0);
    }

    @Test
    public void parse_FloatIncInteger() {
        Assert.assertEquals(myMaths.mathsParseNum("1.0", true), 1.0, 0);
    }

    @Test
    public void parse_FloatIncFloat() {
        Assert.assertEquals(myMaths.mathsParseNum("1.1", true), 1.1, 0);
    }

    @Test
    public void parse_FloatExcInteger() {
        Assert.assertNull(myMaths.mathsParseNum("1.1", false));
    }

    @Test
    public void parse_IntegerExcString() {
        Assert.assertNull(myMaths.mathsParseNum("X", false));
    }

    @Test
    public void parse_FloatExcString() {
        Assert.assertNull(myMaths.mathsParseNum("X", true));
    }

    @Test
    public void parse_IntegerExcNull() {
        Assert.assertNull(myMaths.mathsParseNum(null, false));
    }

    @Test
    public void parse_FloatExcNull() {
        Assert.assertNull(myMaths.mathsParseNum(null, true));
    }

    @Test
    public void six_Add() { Assert.assertEquals(myMaths.mathsAdd(6.0, 2.0), 8.0, 0); }

    @Test
    public void six_Subtract() { Assert.assertEquals(myMaths.mathsSubtract(6.0, 2.0), 4.0, 0); }

    @Test
    public void six_Multiply() { Assert.assertEquals(myMaths.mathsMultiply(6.0, 2.0), 12,0); }

    @Test
    public void six_Divide() { Assert.assertEquals(myMaths.mathsDivide(6.0, 2.0), 3.0, 0); }

    @Test
    public void DivideByZero() { Assert.assertNull(myMaths.mathsDivide(6.0, 0.0)); }

    @After
    public void tearDown() {
        myMaths = null;
    }
}
