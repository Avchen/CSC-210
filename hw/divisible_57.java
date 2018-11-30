package hw;

/**
 * Created by averychen on 4/7/17.
 */
public class divisible_57 {
    // Programming exercise 5.10
    public static void main (String[] args){
        final int NUMBERS_PER_LINE = 10; // Display 10 numbers per line
        int count = 0; // Count the number of numbers divisible by 5 and 6

        //Test if number is divisible by 5 and 6
        for (int i = 100; i <= 1000; i++){
            // Test if number is divisible by 5 and 6
            if (i % 5 == 0 && i % 6 == 0){
                System.out.print(i + " ");
                count++;// increment count
                //Test if numbers per line is 10
                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println();
                else
                    System.out.print("");
            }
        }
    }
}
