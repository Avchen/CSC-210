package Chapter14;

/**
 * Created by averychen on 5/5/17.
 */
import java.util.Scanner;

public class ArithmeticExceptionUseCase {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        int dividend = scanner.nextInt();

        int divisor = scanner.nextInt();

        try{
            int quotient = dividend / divisor;
            System.out.println(quotient);
        }
        catch (Exception e){

            System.out.println(e);

        }

    }
}
