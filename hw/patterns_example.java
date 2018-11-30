package hw;

/**
 * Created by averychen on 4/7/17.
 */
public class patterns_example {
    // Programming exercise 5.18
    public static void main (String[] args){

        //Pattern A
        System.out.println("Pattern A");
        // outer loops to print rows
        for (int rows = 1; rows <= 6; rows++){
            // inner loop to print columns
            for (int cols = 1; cols <= rows; cols++){
                System.out.print(cols + " ");
            }
            System.out.println();
        }

        //Pattern B
        System.out.println("Pattern B");

        for (int rows = 0; rows < 6; rows++){
            for (int cols = 1; cols <= 6 - rows; cols++){
                System.out.print(cols + " ");
            }
            System.out.println();
        }

        //Pattern C
        System.out.println("Pattern C");

        for (int rows = 1; rows <= 6; rows++) {
            for (int cols = 1; cols <= (6-rows); cols++) {
                System.out.print("  ");
            }
            for (int cols = rows; cols >= 1; cols--) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }

        //Pattern D
        System.out.println("Pattern D");

        for (int rows = 0; rows < 6; rows++) {
            for (int cols = 0; cols < rows; cols++) {
                System.out.print("  ");
            }
            for (int cols = 0; cols < 6 - rows; cols++) {
                System.out.print((cols + 1) + " ");
            }
            System.out.println();
        }
    }
}
