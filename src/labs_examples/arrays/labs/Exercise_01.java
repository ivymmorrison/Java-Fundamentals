package labs_examples.arrays.labs;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *  Ivy Morrison Coding Nomads student 07/02/2022
 */
import java.util.Scanner;
public class Exercise_01 {


    public static void main(String[] args) {
        int[] SumArray = new int[10];
        Scanner keyboard = new Scanner(System.in);

        int sum = 0;
        int avg;
        for(int i = 0; i < SumArray.length; i++) {
            System.out.printf("Enter a number %d: ", i + 1);
            SumArray[i] = keyboard.nextInt();
            sum += i;
            }

        avg = SumArray.length % sum;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);
    }
}