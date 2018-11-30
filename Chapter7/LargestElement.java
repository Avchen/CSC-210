package Chapter7;

/**
 * Created by averychen on 3/10/17.
 */
public class LargestElement {

    public static void main(String[] args) {
        //declaring and creating array of size 5
        int[] list = {20, 40, 60, 80, 90};
        //calling method to obtain maximum number
        int largeNumber = largestNumber(list);
        //printing maximum number
        System.out.println("Largest number is: " + largeNumber);
    }
    //method definition to find maximum number
    public static int largestNumber (int[] list) {
        //place holder for the position in array
        int max = list[0];
        //goes into loop to search for max number
        for (int i = 0; i < list.length; i++) {
            //swaps numbers in max if bigger than the last number
            if (list[i] > max) {
                max = list[i];
            }
        }
        //giving the final max number
        return max;

    }
}
