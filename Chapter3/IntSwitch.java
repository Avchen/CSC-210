package Chapter3; /**
 * Created by averychen on 2/10/17.
 */
import java.util.Scanner;
public class IntSwitch {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        int numberOfPlayers = scanner.nextInt();
        String sport = null;

        switch (numberOfPlayers) {
            case 1:
                sport = "tennis";
                break;
            case 6:
                sport = "volleyball";
                break;
            case 9:
                sport = "basketball";
                break;
            default:
                sport = "redrover";
                break;

        }
        System.out.println("you're playing " + sport);

    }
}
