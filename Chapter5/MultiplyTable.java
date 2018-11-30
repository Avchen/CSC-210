package Chapter5;

/**
 * Created by averychen on 2/22/17.
 */
public class MultiplyTable {

    public static void main (String[] args) {

        System.out.println("Tables 2 and 3");

        int x = 2;
        int y = 3;
        int sum = 0;

        for (int i = x; i <= y; i++) {

            for (int j = 1; j <= 12; j++) {
                sum = i * j;
                System.out.println(i + " * " + j + " = " + sum);
            }

            System.out.println("");
        }
    }
}
