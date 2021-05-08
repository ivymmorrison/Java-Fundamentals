package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        byte myNum = 100;
        System.out.println("byte myNum is: " + myNum);
        long myLNum = 15000000000L;
        System.out.println("long myLNum is: " +myLNum);
        float myFloatNum = 5.99f;    // Floating point number
        System.out.println("float myFloatNum is: " + myFloatNum);
        char myLetter = 'D';         // Character
        System.out.println("char myLetter is: " + myLetter);
        boolean myBool = true;       // Boolean
        System.out.println("boolean myBool is: " + myBool);
        String myText = "Hello";     // String
        System.out.println("String myText is: " + myText);
        double myDNum = 19.99d;
        System.out.println("double myDNum is: " +myDNum);
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println("Scientific float is: " + f1);
        System.out.println("Scientific double is: " + d1);

    }

}
