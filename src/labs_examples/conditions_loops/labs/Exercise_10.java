package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 * Ivy Morrison Coding Nomad Student 20/01/2022
 */

public class Exercise_10 {
    //To force an early iteration of a loop use continue. This does not exit the loop like the break,
    // but skips the remaining code and iterates to the next iteration.
    public static void main(String[] args) {

        // print even number between 0 and 80
        for(int i = 0; i<=80; i++) {
            if((i%2) != 0) {
                continue; // iterate
            }
            System.out.println(i);
        }

    }
}
