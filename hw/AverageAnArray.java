package hw;

/**
 * Created by averychen on 4/8/17.
 */
import java.util.Scanner;
public class AverageAnArray {
    // Programming exercise 7.8
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] values = new double[10]; // Array of length 10

        // Prompt the user to enter ten double values into the array
        System.out.print("Enter ten values of double type: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }

        //Display the average value
        System.out.println("The average value: " + average(values));
    }

    public static int average(int[] array) {
        int average = 0;
        for (int i : array) {
            average += i;
        }
        return average / array.length;

    }


    public static double average(double[] array) {
        double average = 0;
        for (double i : array) {
            average += i;
        }
        return average / array.length;

    }

}
