package Chapter6;

/**
 * Created by averychen on 3/1/17.
 */
import java.util.Scanner;
public class PrintName {

    public static void main(String[] args) {

        System.out.println("Hi, what's your name?");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        String ack = getName(name);
        System.out.println("Hello " + ack + "!");;

    }

    public static String getName (String name) {

        return name;
    }
}
