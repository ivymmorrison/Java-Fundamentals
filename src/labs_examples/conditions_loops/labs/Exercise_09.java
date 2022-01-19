package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 * Ivy Morrison Coding Nomad Student 20/01/2022
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int x = 5;
        // The break statement is used to break out of a loop. There are two forms.
        // A break with a label and break without a label.
        // The break without a label breaks out of the loop it is
        // inside and continues to execute directly outside of said loop.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 3)
                break;
        }
        one: {
            two:{
                if(x==0) {
                    break one; // breaks to label one, prints message
                }
                System.out.println(" Print in label two " );  // if x !=0, this will print
            }
            System.out.println(" Print in label one " );
        }

    }
}
