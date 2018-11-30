package Chapter9;

/**
 * Created by averychen on 4/14/17.
 */
import java.util.Scanner;
public class StringsLibraries {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        String name1 = input.nextLine();
        String name2 = input.nextLine();

        // String value comparison
        System.out.println("equals method test " + name1.equals(name2));

        // Compare two strings while ignoring case sensitivity
        System.out.println("equals ignore case " + name1.equalsIgnoreCase(name2));

        // Checks if it ends with
        System.out.println("ends with " + name1.endsWith("an"));

        // Checks if it starts with
        System.out.println("Starts with " + name1.startsWith("an"));

        // Joins two strings
        System.out.println(name1.concat(" Join: " + name2));

        // Joins in a row
        System.out.println("Join: " + name1 + name2);

    }
}
