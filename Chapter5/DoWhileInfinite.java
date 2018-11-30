package Chapter5;

/**
 * Created by averychen on 2/15/17.
 */
public class DoWhileInfinite {

    public static void main (String[] args) {

//        do {
//
//            System.out.println("infinitive do while loop");
//        }
//        while(true);

        int number = 0;

        while (number == 0) {
            System.out.println("infinitive while loop"); // logical error
        }
    }
}
