package labs_examples.fundamentals.examples.Conditional_Statements;

public class FlowControlKeywords {
    public static void main(String[] args) {


        //Flow control
        //continue, break, return

        //continue
 //       for (int i = 0; i < 10; i++) {
 //           if (i == 3 || i == 7) {
                //forces an early iteration of the loop
 //               continue;
 //           }
//            System.out.println("i = " + i);
//        }
        //break
//        for (int i = 0; i < 10; i++) {
//            if (i == 3 || i == 7) {
//                //exit the nearest loop
//                break;
//            }
//            System.out.println("i = " + i);
//        }
//        System.out.println("done with loop");
        int i = someMethod(3);
        System.out.println("i = " + i);
    }
    //return exits the current method (will return a value if the method requires)
    public static int someMethod(int val){
        if (val == 0){
            System.out.println("1) will this print");
            //return exits the current method (will return a value if the method requires)
            return 0;
        } else if(val ==1){
            System.out.println("2) will this print");
            //return exits the current method (will return a value if the method requires)
            return 1;
        } else {
            System.out.println("3) will this print");
            //return exits the current method (will return a value if the method requires)
            return -1;
        }
    }

}
