package hw;

/**
 * Created by averychen on 4/8/17.
 */
public class TestPrimeNumberMethod {
    // Programming exercise 6.10
    public static void main(String[] args){
        int numberOfPrimes = 0; // Counts the number of prime numbers

        // Find the number of prime numbers less than 10000
        for(int i = 0; i < 10000; i++) {
            if (PrimeNumberMethod.isPrime(i)) {
                numberOfPrimes++; // Increment
            }
        }

        System.out.println("The number of prime numbers less than 10000 is: " + numberOfPrimes);

    }
}
