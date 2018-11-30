package hw;

/**
 * Created by averychen on 4/9/17.
 */
import java.util.Scanner;
public class SmallestElement {
    // Programming exercise 7.9
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double [] numbers = new double[10]; // Create an array size 10

        // Prompt the use to enter ten numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = input.nextDouble();
        }

        // Display the minimum value
        System.out.println("The minimum number is: " + min(numbers));
    }

    public static double min(double[] array) {
        double min = array [0]; // The minimum value
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        return min;
    }
}
