package hw;

/**
 * Created by averychen on 4/8/17.
 */
import java.util.Scanner;
public class CompoundValue {
    // Programming exercise 5.30
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount (e.g., 100): ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the amount of months (e.g., 6): ");
        int months = input.nextInt();

        // Compute monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Compute amount in savings account
        double compoundValue = 0; // Accumulates compound value

        for(int i = 1; i <= months; i++){
            compoundValue = (amount + compoundValue) * (1 + monthlyInterestRate);
        }

        //Display result
        System.out.println("The amount in the savings account after " + months + " months is: " + compoundValue);
    }
}
