package Chapter6;

/**
 * Created by averychen on 3/3/17.
 */
import java.util.Scanner;
public class AreaMethod {

public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 0 for computeAreaOfCircle or 1 for computeAreaOfSquare");
        int option = scan.nextInt();
        System.out.println("Enter the value");
        int value = scan.nextInt();
        double area = computeArea(option, value);
        System.out.println(area);
    }

    private static double computeArea(int option, int value){

        double area = 0.0;
        switch(option) {

            case 0: area = computeAreaOfCircle(value);
            break;
            case 1: area = computeAreaOfSquare(value);
            break;
            default: area = 0.0;
            break;
        }
        return area;
    }

    private static double computeAreaOfCircle(int value){
        return Math.PI * value * value;
    }
    private static double computeAreaOfSquare(int value){
        return value * value;
    }
}
