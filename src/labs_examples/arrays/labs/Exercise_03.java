package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *   Ivy Morrison 24/02/2022
 */

public class Exercise_03 {
    public static void main(String[] args) {

        // please demonstrate how to declare a Two-Dimensional Array
        // with a height of 5 and a width of 5 below
        int [] [] twoD = new int [5] [5];
        // using a nested for loop to populate every index in the 2-D Array
        for (int i = 1; i < twoD.length; i++){
            for (int j = 1; j < twoD[i].length; j++){
                twoD[i] [j] = (i*3)*j;
                System.out.print(twoD[i][j] + "  ");
            }
            // once populated, use a nested for loop to print each element in the 2-D array
            System.out.println();
        }

    }
}
