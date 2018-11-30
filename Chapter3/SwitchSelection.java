package Chapter3; /**
 * Created by averychen on 2/10/17.
 */
import java.util.Scanner;
public class SwitchSelection {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String grade = scanner.nextLine();

        switch (grade) {
            case "A":
                System.out.println("Excellent grade");
                break;
            case "B":
                System.out.println("Good grade");
                break;
            case "C":
                System.out.println("Passing grade");
                break;
            case "D":
            case "F":
                System.out.println("Bad grade");
                break;


        }
    }
}
