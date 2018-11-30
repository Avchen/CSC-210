package Chapter6;

/**
 * Created by averychen on 2/27/17.
 */
public class SumMethod {

    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 is " + sum(1, 10));
        System.out.println("Sum from 20 to 37 is " + sum(20, 37));
    }

    public static int sum ( int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result = result + i;
        }
        return result;
    }
}
