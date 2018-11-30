package Review;

/**
 * Created by averychen on 5/12/17.
 */
import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // original number
        int number = input.nextInt();
        // new number
        int reversedNumber = 0;
        // place holder
        int temp = 0;

        while (number > 0) {

            // gets the last/right most digit
            temp = number%10;
            // keeps adding temp to a place holder
            reversedNumber = reversedNumber * 10 + temp;
            // cuts off the last/right most digit
            number = number/10;
        }

        System.out.println(reversedNumber);
    }
}
