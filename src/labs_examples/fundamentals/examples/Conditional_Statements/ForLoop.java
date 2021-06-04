package labs_examples.fundamentals.examples.Conditional_Statements;

public class ForLoop {
    public static void main(String[] args) {
        //for(initialisation; (boolean) condition; iterator)
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            for (int x = 0; x < 10; x++) {
                System.out.println("-- x = " + x);
            }
        }
        //For Loop Quiz

        // 1. Initialize a variable named i with a value of 100
        int i = 100;
        // 2. Initialize a second variable name j with a value of 0
        int j = 0;
        // 3. Create a for loop that uses 'i' as it's counter, counting backwards from 100 to 1
        for(; i >= 0; i = i -= 1) {
            // 4. Within the for loop add the value of i to the current value of j
            j = i + j;
        }
        // 5. Print out the value of j
        System.out.println("Value of j is: " + j);
    }
}
