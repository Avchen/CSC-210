package Chapter6;

/**
 * Created by averychen on 3/3/17.
 */
import java.util.Scanner;
public class IncrementMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int increase = increase(number);
        System.out.println("+ 1 = ");
        System.out.println(increase);
    }

        public static int increase (int number) {

            number = number + 1;
            return number;
        }
}
