package labs_examples.arrays.labs;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *  Ivy Morrison Coding Nomads student 17/02/2022
 */
import java.util.Scanner;
public class Exercise_02 {


        // Linear-search function to find the index of an element
        public static int findIndex(int arr[], int t)
        {

            // if array is Null
            if (arr == null) {
                return -1;
            }

            // find length of array
            int len = arr.length;
            int i = 0;

            // traverse in the array
            while (i < len) {

                // if the i-th element is t
                // then return the index
                if (arr[i] == t) {
                    return i;
                }
                else {
                    i = i + 1;
                }
            }
            return -1;
        }

        // Driver Code
        public static void main(String[] args)
        {
            int[] my_array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int num;
            int idx;
            for(int i = 0; i <1; i++) {
                System.out.println("Enter a number from 1-10: ");
                Scanner keyboard = new Scanner(System.in);
                num = keyboard.nextInt();
                idx = my_array.indexOf(num);
            }

            // find the index of number entered
            System.out.println("Index of element " +num +" is: " + idx);

        }
    }
