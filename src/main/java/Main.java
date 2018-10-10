/*  MathTest by MF, JRE 11
    A Maven model project imported via pox.xml
    For run configuration, for Application with Main class as Main
    For run configuration, for unit testing, Run Test within MathTests as Run 'MathTests'
    SOLID principles of object-oriented programming
    Part-based on 'Introduction to Unit Testing with Java' by Christian Vasquez
*/

import java.util.Scanner; // needed for Scanner

public class Main {
    public static void main(String[] args)
    {
        boolean myIsQuit;
        Double myUserChoice;
        do {
            myUserChoice = mainGetNum("1 Add, 2 Subtract, 3 Multiply, 4 Divide, 9 Exit. Which?", false);
            myIsQuit = (myUserChoice == 9);
            if (!myIsQuit)
                mainCalc(myUserChoice);
        } while(!myIsQuit);
        System.out.println("Bye");
    }

    public static void mainCalc(Double dblChoice) {
        Maths myMaths = new Maths();
        Double myCalc;
        switch (dblChoice.intValue()) {
            case 1:
                myCalc = myMaths.mathsAdd(mainGetNum("1st?", true), mainGetNum("2nd?", true));
                break;
            case 2:
                myCalc = myMaths.mathsSubtract(mainGetNum("1st?", true), mainGetNum("2nd?", true));
                break;
            case 3:
                myCalc = myMaths.mathsMultiply(mainGetNum("1st?", true), mainGetNum("2nd?", true));
                break;
            case 4:
                myCalc = myMaths.mathsDivide(mainGetNum("1st?", true), mainGetNum("2nd?", true));
                break;
            default:
                System.out.println("That's not a valid option.");
                return;
        }
        if (myCalc != null)
            System.out.println("= " + myCalc);
    }

    public static Double mainGetNum(String s, boolean blnFloat) {
        Maths myMaths = new Maths();
        Scanner in = new Scanner(System.in);
        Double myNum;
        String myInput;
        while(true) {
            System.out.print(s + " ");
            myInput = in.nextLine();
            myNum = myMaths.mathsParseNum(myInput, blnFloat);
            if(myNum == null)
                System.out.println("That's not a valid number.");
            else
                return myNum;
        }
    }
}