package Chapter6;

/**
 * Created by averychen on 2/27/17.
 */
import java.util.Scanner;
public class MaxWithMethod {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 number to compare");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("max of a and b: " + max(a, b));
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
