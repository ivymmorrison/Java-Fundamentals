package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 * Ivy Morrison Coding Nomad Student 06/2021
 */

public class Exercise_04 {
    public static void main(String[] args){
        // "count = count + 2" can also be written as "count++"
        for(int count = 2; count < 101; count = count + 2){
            System.out.println("This is count: " + count);
        }
    }

}
