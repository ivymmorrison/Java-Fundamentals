package labs_examples.arrays.labs;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *  Ivy Morrison Coding Nomads student 17/02/2022
 */
import java.util.Arrays;
import java.util.Scanner;
public class Exercise_02 {


    public static boolean verify;
    public static int findElementIndex (int value, int [] a)
    {
        //the index we return
        int index = 0;
        //check whether the value exists in the array
        for (int i = 0; i< a.length; i++)
        {
            if (a[i] == value)
            {
                //if value exists, assign i to the variable index
                index = i;
                //set verify to true
                verify = true;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        //get the array's length as an input from user
        //Scanner s = new Scanner (System.in);
        //System.out.println("enter the array's length");
        //int array_length = s.nextInt();

        //create the array
        int [] array = new int [10];

        // populate array
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        //set the array elements

        //System.out.println("Set the array element");
        //for (int i = 0; i<array_length; i++)
        //{
        //    array[i] = s.nextInt();
        //}
        System.out.println("The array elements are: " + Arrays.toString(array));

        //set the value you would like to check the index of
        //get the array's length as an input from user
        Scanner s = new Scanner (System.in);
        System.out.println("What element do you want to check the index of?");
        int element = s.nextInt();

        //send element and array to findElementIndex
        int index = findElementIndex(element, array);

        //check whether or not the sent value corresponds to any of the
        //array elements
        if (verify)
        {
            System.out.println("the index of " +element + " is " + index);
        }
        else
        {
            System.out.println("Sorry, this value doesn't exist!");
        }
    }
}
