package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *      Upper sum bounded by f(x) = x^2  x = 0 and x = 2
 *      base and height
 *      base = ^x = 2-0/n = 2/n
 *      height = f(rep)=f(2/h*i)
 *      The sum is: 5050
 *      The average is: 50.5
 * Ivy Morrison Coding Nomad Student 01/2022
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner(System.in);
        // 2) prompt user for high
        System.out.print("Enter a high number :  ");
        // 3) assign input to variable as int
        int high = scanner.nextInt();
        // 2) prompt user for low
        System.out.print("Enter a low number :  ");
        // 3) assign input to variable as int
        int low = scanner.nextInt();
        int sum = 0;
        int count = 0;
        int i = low;
        double average = Double.NaN;
         {
            // 4. Within the for loop add the value of high and low to get the sum
             for(count = low;count <= high; count++);
            // Found direct formula sum=(high\2)*(1+high)
             sum = high*(1+high)/2;
            // 5. Print out the value of j
            System.out.println("The sum is: " + sum);
            average = sum / count;
            System.out.println("The Average is: " + average);
        }



    }
}
