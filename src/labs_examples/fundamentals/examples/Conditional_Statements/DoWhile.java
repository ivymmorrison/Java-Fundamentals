package labs_examples.fundamentals.examples.Conditional_Statements;

public class DoWhile {
    public static void main(String[] args) {
        int count = 0;

        do{
            System.out.println("count is " + count);
            count++;
        } while(count <10);
        System.out.println("All done with do-while loop!");
    }
}
