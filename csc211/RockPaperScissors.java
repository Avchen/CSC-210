package csc211;

/**
 * Created by averychen on 2/17/17.
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        int run = 0;
        int count = 1;
        while (run == 0) {
            System.out.println("Trial " + count);
            System.out.println("Enter 0 for rock, 1 for paper, 2 for scissors.");

            int playerMove = scan.nextInt();
            int computerMove = generator.nextInt(3);


            switch (playerMove) {
                case 0:
                    if (computerMove == 0) {
                        System.out.println("Tie");
                        System.out.println("Computer chose rock");
                    } else if (computerMove == 1) {
                        System.out.println("You lose");
                        System.out.println("Computer chose paper");
                    } else if (computerMove == 2) {
                        System.out.println("You win");
                        System.out.println("Computer chose scissors");
                    }
                    System.out.println("You chose rock");
                    count++;
                    break;
                case 1:
                    if (computerMove == 0) {
                        System.out.println("You win");
                        System.out.println("Computer chose rock");
                    } else if (computerMove == 1) {
                        System.out.println("Tie");
                        System.out.println("Computer chose paper");
                    } else if (computerMove == 2) {
                        System.out.println("You lose");
                        System.out.println("Computer chose scissors");
                    }
                    System.out.println("You chose paper");
                    count++;
                    break;
                case 2:
                    if (computerMove == 0) {
                        System.out.println("You lose");
                        System.out.println("Computer chose rock");
                    } else if (computerMove == 1) {
                        System.out.println("You win");
                        System.out.println("Computer chose paper");
                    } else if (computerMove == 2) {
                        System.out.println("Tie");
                        System.out.println("Computer chose scissors");
                    }
                    System.out.println("You chose scissors");
                    count++;
                    break;
            }

            if (playerMove > 2) {
                run++;
                System.out.println("Error");
            }
        }
    }

}
