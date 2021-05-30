package labs_examples.fundamentals.examples.Conditional_Statements;

public class WhileQuiz {
    public static void main(String[] args) {
    //public int whileExample() {

        int count = 0;
        int val = 0;

        // write a while loop below that will loop until "count" is no longer less than 10
        // within the while loop, add the value of "count" to the current value of "val"
        // then, increment your counter variable
        while (count < 10){
            val = val + count;
            count++;
        }
        System.out.println("Count is " + count);
        System.out.println("Val is " + val);


        // write a do-while loop below that will loop until "count" is no longer less than 10

        // within the do-while loop, add the value of "count" to the current value of "val"
        // then within the do-while loop, increment your counter
        do{
            System.out.println("count is " + count);
            val = val + count;
            count++;
        } while(count <10);
        System.out.println("All done with do-while loop!");

        //return val;

    }
}
