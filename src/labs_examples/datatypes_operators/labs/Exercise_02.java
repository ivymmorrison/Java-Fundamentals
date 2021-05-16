package labs_examples.datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 2: Type conversion and labs_examples.fundamentals.examples.casting
 *
 *      Write the necessary code to demonstrate type conversion:
 *
 *      Widening:
 *      1. Declare and initialize an int with the value 10
 *      2. Declare a double and set it equal to the int
 *      3. Print out the double
 *
 *      Narrowing (with labs_examples.fundamentals.examples.casting):
 *      1. Declare and initialize a new double with the value 10.5
 *      2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
 *      3. Print out the int
 *
 *      Notice how each type is converted. In which direction is information lost?
 *
 *      Created by ivy morrison student at Coding Nomads
 **/

public class Exercise_02 {

    public static void main(String[] args) {

        // write code here
        // widening
        int a = 10;
        double d = a;
        System.out.println("Double is : " + d);

        //Narrowing
        double dd = 10.5;
        int b = (int)dd;
        System.out.println("double cast to an int is:" + b);
    }
}
