package Chapter2; /**
 * Created by averychen on 2/3/17.
 */
import java.util.Scanner;
public class AreaofCircle{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");

        int radius = scanner.nextInt();

        if (radius<0) {
            System.err.print("incorrect input");
        }

        else {
            double area = radius * radius * Math.PI;
            System.out.println("Your area is " + area);
        }

    }
}
