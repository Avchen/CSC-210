package hw;

/**
 * Created by averychen on 4/8/17.
 */
import java.util.Scanner;
public class VowelsAndConsonants {
    // Programming exercise 5.49
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        // Enter a string
        System.out.print("Enter a String: ");
        String string = input.nextLine();

        int vowels;
        int consonants;
        vowels = consonants = 0;

        for (int i = 0; i < string.length(); i++){
            if (Character.isLetter(string.charAt(i))) {
                if (Character.toUpperCase(string.charAt(i)) == 'A' ||
                        Character.toUpperCase(string.charAt(i)) == 'E' ||
                        Character.toUpperCase(string.charAt(i)) == 'I' ||
                        Character.toUpperCase(string.charAt(i)) == 'O' ||
                        Character.toUpperCase(string.charAt(i)) == 'U') {
                    vowels++;
                }
                else
                    consonants++;
            }
        }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
}
