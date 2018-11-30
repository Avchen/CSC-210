package Chapter5;

/**
 * Created by averychen on 2/13/17.
 */
public class WhileLoopExample {

    public static void main (String[] args) {

        int count = 0;
        while (count < 10) {
            System.out.println("Welcome to Java!");
            count++;
        }
        System.out.println("You have printed this message " + count + " times.");

//        int sum = 0, i = 1;
//
//        while (i < 10) {
//            System.out.println("sum: " + sum);
//            System.out.println("i:" + i);
//            sum = sum + i;
//            i++;
//        }
//
//        System.out.println("sum is " + sum);

    }

}
