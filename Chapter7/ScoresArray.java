package Chapter7;

/**
 * Created by averychen on 3/8/17.
 */
import java.util.Scanner;
public class ScoresArray {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] students = new int[5];

        System.out.print("Enter " + students.length + " values: ");

        //assign values to array from console/scanner
        for(int i = 0; i < students.length; i++){
            students[i] = scan.nextInt();
        }
        //read values from array
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
        //calling sumArrayValue method
        int sum = sumArrayValues(students);

        System.out.println("sum: " + sum);
    }
    //method sum the values of array
    public static int sumArrayValues(int[] students) {
        int sum = 0;
        for (int i = 0; i < students.length; i++){
            sum = sum + students[i];
        }
        return sum;
    }
}
