package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 * Ivy Morrison Coding Nomad Student 20/01/2022
 */

public class Exercise_08 {
    public static void main(String[] args) {
// declaring a counter variable to use in our while loop that decreases as we work our way down through the loop!

        int count3 = 1000;

// do-while loop to print out every 3rd number counting down from 1000
        do{
            System.out.println("Count is " +count3);
            count3= count3 - 3;
        }while (count3 > 0);
        System.out.println("All done with Do While loop!");
    }
}

