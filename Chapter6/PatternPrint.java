package Chapter6;

/**
 * Created by averychen on 3/1/17.
 */
import java.util.Scanner;
public class PatternPrint {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = scan.nextInt();
        System.out.println("Enter number of columns");
        int cols = scan.nextInt();
        printPattern(rows, cols);
    }

    /**
     * Print pattern, nothing to return, so its 'void'
     * @param rows
     * @param cols
     */

    public static void printPattern(int rows, int cols) {
        // outer loop for rows
        for (int i = 0; i < rows; i++) {
            // inner loop for columns
            for (int j = 0; j < cols; j++) {
                System.out.print("x");
            }
            // prints a new line
            System.out.println();
        }
    }
}
