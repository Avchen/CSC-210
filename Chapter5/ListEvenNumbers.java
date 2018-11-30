package Chapter5;

/**
 * Created by averychen on 2/20/17.
 */
public class ListEvenNumbers {

    public static void main (String[] args) {

        //define limit
        int limit = 50;

        System.out.println("Printing even numbers between 1 and " + limit);

        for (int i = 0; i <= limit; i++) {

            //if the number is divisible by 2 then it is even
            if ( i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }


}
