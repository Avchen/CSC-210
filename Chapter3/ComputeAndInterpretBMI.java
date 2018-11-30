package Chapter3; /**
 * Created by averychen on 2/8/17.
 */

import java.util.Scanner;

public class ComputeAndInterpretBMI {

    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter height in feet and inches: ");   // asks user to input a value

        double feet = input.nextDouble();   //first input number
        double inches = input.nextDouble(); //second input number after space
        final int Inch_PER_Feet = 12;   //constant (1 feet = 12 inches)

        System.out.print("Please enter weight in pounds: ");    // asks user to input a value

        double weight = input.nextDouble(); //input

        //compute BMI
        double Feet_In_Inches = feet * Inch_PER_Feet;   //coverts feet to inches
        double Height_In_Inches = Feet_In_Inches + inches;  //total height in inches
        double bmi = (703.0f * weight) / (Height_In_Inches * Height_In_Inches);   //bmi calculation

        System.out.println("BMI = " + bmi); //print the BMI after calculations

        if (bmi < 18.5) {   //executes when BMI is less than 18.5
            System.out.println("You are underweight");
        }
        else if (bmi < 25) {    //executes when BMI is less than 25
            System.out.println("You are not overweight");
        }
        else if (bmi < 30) {    //executes when BMI is less than 30
            System.out.println("You are overweight");
        }
        else {  //executes when BMI is greater than 30
            System.out.println("You are obese");
        }

    }
}

