package labs_examples.fundamentals.examples.Conditional_Statements;

public class Blackjack {
    public static void main (String[] args) {
        /* hitOrStand */
       int cardValue = 10;
        //Place your code below
        if (cardValue == 0) {
            System.out.println("Stay");
        } else if (cardValue >=16) {
            System.out.println("Hit");
        } else{
            System.out.println("Stand");
        }
    }
}
