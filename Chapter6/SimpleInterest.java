package Chapter6;

/**
 * Created by averychen on 3/1/17.
 */
import java.util.Scanner;
public class SimpleInterest {

    public static void main(String[] args) {
        // to read from console
        Scanner scan = new Scanner(System.in);
        // reads p from console and assigns to 'p' variable
        double p = scan.nextInt();
        int t = scan.nextInt();
        double r = scan.nextInt();

        // calling SimpleInterest method
        double si = computeSimpleInterest( p, t, r);
        System.out.println("Simple Interest: " + si);

    }
    // computeSimpleInterest definition
    public static double computeSimpleInterest(double p, int t, double r){
        double si = (p*t*r)/100;
        return si;
    }
}
