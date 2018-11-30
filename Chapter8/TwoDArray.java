package Chapter8;

/**
 * Created by averychen on 3/13/17.
 */
public class TwoDArray {

    public static void main (String[] args) {

        int [][] matrix = new int [5][5];

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                matrix [row][col] = 1;

            }
        }

    }
}
