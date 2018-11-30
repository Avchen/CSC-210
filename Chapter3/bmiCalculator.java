package Chapter3;

/**
 * Created by averychen on 2/27/17.
 */

/*****

 File: bmiCalculator
 By: Avery Chen
 Date: 3/1/17

 Compile: javac bmiCalculator.java
 Usage: java bmiCalculator
 System: Mac OS X

 Description: This program calculates a person's BMI by having the user enter in their height in feet and inches
 and their weight in pounds. It will then print out their BMI and tell the person if they are overweight or not.

*****/

import java.util.Scanner;

public class bmiCalculator {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in); // create scanner object

        System.out.print("Please enter height in feet and inches: ");  // asks user to input a value

        double feet = input.nextDouble();  // first input number
        double inches = input.nextDouble();  // second input number after a space
        final int Inch_Per_Feet = 12;  // constant (1 feet = 12 inches)

        System.out.print("Please enter weight in pounds: ");  // asks user to input a value

        double weight = input.nextDouble(); // input

        // compute BMI
        double Feet_In_Inches = feet * Inch_Per_Feet;   // coverts feet to inches
        double Height_In_Inches = Feet_In_Inches + inches;  // total height in inches
        double bmi = (703.0f * weight) / (Height_In_Inches * Height_In_Inches);  // bmi calculation

        System.out.println("BMI = " + (float) bmi);  // print the BMI after calculations as a float

        if (bmi < 18.5) {   // executes when BMI is less than 18.5
                System.out.println("You are underweight.");
        }
        else if (bmi < 25) {    // executes when BMI is less than 25
            System.out.println("You are not overweight.");
        }
        else if (bmi < 30) {  // executes when BMI is less than 30
            System.out.println("You are overweight.");
        }
        else {  // executes when BMI is greater than 30
            System.out.println("You are obese.");
        }

    }
}
