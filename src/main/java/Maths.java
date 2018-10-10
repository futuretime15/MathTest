/*  MathTest by MF, JRE 11
    A Maven model project imported via pox.xml
    For run configuration, for Application with Main class as Main
    For run configuration, for unit testing, Run Test within MathTests as Run 'MathTests'
    SOLID principles of object-oriented programming
    Part-based on 'Introduction to Unit Testing with Java' by Christian Vasquez
*/

public final class Maths {

    public static Double mathsParseNum(String s, boolean blnInteger) {
        // Returns: Object as boxed Numeric, or == null if invalid
        Double myNum;
        if (s == null)
            return null;
        else
        {
            try {
                myNum = Double.parseDouble(s);
            } catch (NumberFormatException ne) {
                return null;
            }
            if (blnInteger == true && (myNum - Math.floor(myNum)) != 0)
                return null;
            else
                return myNum;
        }
    }

    public static Double mathsAdd(Double Value1, Double Value2) {
        return Value1 + Value2;
    }

    public static Double mathsSubtract(Double Value1, Double Value2) {
        return Value1 - Value2;
    }

    public static Double mathsMultiply(Double Value1, Double Value2) {
        return Value1 * Value2;
    }

    public static Double mathsDivide(Double Value1, Double Value2) {
        if (Value2 == 0.0) {
            System.out.println("Cannot divide by zero (0).");
            return null;
        }
        else
            return Value1 / Value2;
    }
}