package labs_examples.arrays.labs;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *  Ivy Morrison Coding Nomads student 17/02/2022
 */
import java.util.Scanner;
import java.util.Arrays;
public class Exercise_02 {


    public static void main(String[] args) {
        int[] IndexNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number between 1-10:");

        for(int i=0; i< IndexNum.length;i++){
            if (IndexNum[i]==input.nextInt()) {
                index = i;
                }

            }
        System.out.println("The index is: " +index);
            
    }
}
