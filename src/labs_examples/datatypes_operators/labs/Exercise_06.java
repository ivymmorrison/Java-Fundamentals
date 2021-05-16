package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        // Right cylinder surface area A=2πrh+2πr2
        // Right cylinder volume V=πr2h
        int h = 5;
        double r = 3.14;
        double p = 3.14;
        double sa = (2*p*r*h) + (2*p*r*2);
        System.out.println("Surface Area = " + sa);
        double v = (p*r)*(2*h);
        System.out.println("Volume = " + v);
    }
}