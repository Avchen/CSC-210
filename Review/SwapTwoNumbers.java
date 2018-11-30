package Review;

/**
 * Created by averychen on 5/12/17.
 */
public class SwapTwoNumbers {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        System.out.println(num1 + " " + num2);
        swap(num1, num2);

    }

    private static void swap(int num1, int num2) {

        int temp = 0;
        num1 = num2;
        num2 = temp;

        System.out.println(num1 + " " + num2);

    }
}
