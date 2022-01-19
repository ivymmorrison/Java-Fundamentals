package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 * Ivy Morrison Coding Nomad Student 20/01/2022
 */
import java.util.Scanner;
public class Exercise_07 {



        // Function to check if a character is vowel
        static boolean isVowel(char c)
        {
            c = Character.toLowerCase(c) ;
            if (c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u')
                return true;
            return false;
        }

        // Function to return first X vowels
        static String firstXvowels(String s, int x)
        {
            // String to store first X vowels
            String result = "";
            for (int i = 0; i < s.length(); i++) {

                // If s[i] is a vowel then
                // append it to the result
                if (isVowel(s.charAt(i)))
                    result += s.charAt(i);

                // If the desired length is reached
                if (result.length() == x) {
                    return result;
                }
            }

            // If total vowels are < X
            return "-1";
        }

        // Driver code
        public static void main(String []args) {
            // 1) create scanner (don't forget to import Scanner!)
            Scanner user_input = new Scanner(System.in);
            // 2) prompt user for high
            System.out.print("Enter a word :  ");
            String str;
            str = user_input.next();
            int x = 1;
            int counter = 0;
                while (counter == 0) {
                    System.out.print(firstXvowels(str, x) + " is the first vowel from the word " + "'"
                            + str + "'");
                    counter = counter +1;
                }
        }

}



