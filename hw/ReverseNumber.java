package hw;

/**
 * Created by averychen on 4/8/17.
 */
import java.util.Scanner;
public class ReverseNumber {
    // Programming exercise 6.4
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        reverse(number);

    }

    public static void reverse(int number){
        while (number > 0){
            System.out.print((number % 10));
            number /= 10;
        }
        System.out.println();
    }
}

