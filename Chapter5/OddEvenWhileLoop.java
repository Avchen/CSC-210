package Chapter5;

/**
 * Created by averychen on 2/13/17.
 */
public class OddEvenWhileLoop {

    public static void main (String[] args) {

        int a = 1;
        while (a < 10) {
            if (a % 2 == 0){
                System.out.println(a + " is even");
            }
            else {
                System.out.println(a + " is odd");
            }
            a++;
        }
    }
}
