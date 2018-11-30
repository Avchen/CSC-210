package Review;

/**
 * Created by averychen on 5/12/17.
 */
import java.util.Scanner;
public class FactorialNumber {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int factorial = num;

        for(int i = (num -1); i > 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(num + "! = " + factorial);
    }
}
