package Chapter3;

/**
 * Created by averychen on 2/10/17.
 */
import java.util.Scanner;
public class HiFive {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int remainder = number % 5;
        System.out.println(remainder);

        if (remainder != 0) {
            System.out.println("not divisible by 5");
        }
        else {
            System.out.println("Hi Five");
        }
    }
}
