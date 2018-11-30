package Chapter5;

/**
 * Created by averychen on 2/20/17.
 */
import java.util.Scanner;
public class ForLoopExample {

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);

        int number;
        int sum = 0;
        int count;

        System.out.println("Enter 5 numbers.");

        for (count = 0; count < 5; count++) {

            number = input.nextInt();
            sum = sum + number;

        }

        System.out.println("Sum is " + sum);
        System.out.println("Count is " + count);
    }

//        public static void main (String[] args) {
//
//            for (int i =10; i > 1; i--) {
//                System.out.println("The value of i is: " + i);
//            }
//
//    }


}
