package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 1: Even or Odd
 *
 *      Write a program that gets a number between 1 and 1,000,000
 *      from the user and determines whether it is odd
 *      or even using an if statement. Print the result.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 *      Ivy Morrison - Codecademy Student - 22/06/2021
 */

public class Exercise_01 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 1,000,000,000 to determine whether it is odd or even: ");
        // assign input to variable as int
        int number = scanner.nextInt();

        // write completed code here
            if (number < 0) {
                System.out.println("Please enter a larger number ");
            }
            else if (number > 1000000000) {
                System.out.println("Please enter a smaller number ");
            }
            else  if ((number % 2) != 0) { // is it an odd number
                System.out.println("Odd number : " + number);
            }
            else {
                System.out.println("Even number : " + number);
            }

        }
    }

