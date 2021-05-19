package labs_examples.fundamentals.examples.Conditional_Statements;

import java.awt.*;

/**
 * written by Ivy Morrison student at Coding Nomads
 */
public class IfElse {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        boolean bool1 = true;
        boolean bool2 = false;

        if (a < b && a > +0) {
            //if statement code block
            System.out.println("a is less than b");
        }
        if (b > 15) {
            if (b > 18) {
                if (b > 19) {
                    if (b == 20) {
                        System.out.println("b is 20");
                    }
                } else if (b == 19) {
                    System.out.println("b is 19");
                }
            } else {
                System.out.println("a is greater than 15 and less than 19");
            }
        }
         if (b > 30) {
            System.out.println("a is not less than b");
        } else {
            System.out.println("b is not greater than 30");
        }

    }
}
