package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *  Ivy Morrison Coding nomad student 28/06/2021
 */

public class Exercise_03 {


    public static void main(String[] args) {
        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner(System.in);
        // 2) prompt user
        System.out.print("Enter a number between 1 and 12 for the month of the year. e.g. 1 for January, 2 for February,......  :  ");
        // 3) assign input to variable as int
        int number = scanner.nextInt();

            switch (number) {
                case 1: System.out.println("The month is January"); break;
                case 2: System.out.println("The month is February"); break;
                case 3: System.out.println("The month is March"); break;
                case 4: System.out.println("The month is April"); break;
                case 5: System.out.println("The month is May"); break;
                case 6: System.out.println("The month is June"); break;
                case 7: System.out.println("The month is July"); break;
                case 8: System.out.println("The month is August"); break;
                case 9: System.out.println("The month is September"); break;
                case 10: System.out.println("The month is October"); break;
                case 11: System.out.println("The month is November"); break;
                case 12: System.out.println("The month is December"); break;
                default: System.out.println("Please enter a number between 1 and 12!"); break;
            }
        }


}
