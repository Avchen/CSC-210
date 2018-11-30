package Chapter14;

/**
 * Created by averychen on 5/5/17.
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class WriteToFile {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        String enteredText = scanner.nextLine();

        PrintWriter printWriter = new PrintWriter("my_file_from_java.txt");

        printWriter.println(enteredText);
        printWriter.close();

    }
}
