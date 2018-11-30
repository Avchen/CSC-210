package Review;

/**
 * Created by averychen on 5/12/17.
 */
public class LargestAndSmallestNumber {

    public static void main(String[] args) {

        int numbers[] = new int[]{54,73,60,48,53,22,64,89,35};

        int largestNum = numbers[0];
        int smallestNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > largestNum) {
                largestNum = numbers[i];
            }
            else if(numbers[i] < smallestNum) {
                smallestNum = numbers[i];
            }
        }
        
        System.out.println("The largest number is: " + largestNum);
        System.out.println("The smallest number is: " + smallestNum);
    }
}
