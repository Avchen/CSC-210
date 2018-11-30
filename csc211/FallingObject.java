package csc211;

/**
 * Created by averychen on 2/10/17.
 */
import java.util.Scanner;
public class FallingObject {
    public static void main(String[] args) {

        /*
        We are trying to compute the distance of a falling object under Earth's gravity. The object falls for 15 seconds
        and the starting position and velocity is 0. To compute this through code, we have to convert our variables into
        their appropriate data types. Since acceleration is 9.81 m/s, we use a double because it's in decimal form. Our
        other variables are whole numbers so we can use a int. Once we put the values into the given equation, our output
        is a double because one of our values was a double.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter time in seconds: ");

        double acceleration = -9.81;    //meters per second
        int time = scanner.nextInt();   //seconds
        int Vi = 0;                     //initial velocity
        int Xi = 0;                     //initial position

        double travel = (0.5 * acceleration * time * time) + (Vi * time) + Xi;
        System.out.println("Distance traveled: " + (-1 * travel) + " meters");

    }
}
