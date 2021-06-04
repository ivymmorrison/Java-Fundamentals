package labs_examples.fundamentals.examples.Conditional_Statements;

public class SwitchStatement {
    public static void main(String[] args) {

        int i = 7;
        switch (i) {
            case 0:
                System.out.println("It is 0");
                break;
            case 1:
                System.out.println("It is 1");
                break;
            case 2:
                System.out.println("It is 2");
                break;
            case 3:
                System.out.println("It is 3");
                break;
            case 4:
                System.out.println("It is 4");
                break;
            case 5:
                System.out.println("It is 5");
                break;
            default:
                System.out.println("default was hit");
        }
        String str = "bronze";
        // Example of no break statements
        switch (str) {
            case "gold":
                System.out.println("gold level");
            case "silver":
                System.out.println("silver level");
            case "bronze":
                System.out.println("bronze level");
                System.out.println("done with switch statement");
        }
    }
}
