package Chapter1; /**
 * Created by averychen on 2/3/17.
 */
import java.util.Scanner;

public class Add {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println(sum);

    }
}
