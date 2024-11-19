package ListPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrimeNumber {

        // Method to check if a number is prime
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false; // Numbers less than or equal to 1 are not prime
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false; // Number is divisible by another number, so not prime
                }
            }
            return true; // Number is prime
        }

        public static void main(String[] args) {
            // Sample list of numbers
            List<Integer> numbers = Arrays.asList(10, 15, 3, 7, 19, 22, 29, 30);
            // List to store prime numbers
            List<Integer> primes = new ArrayList<>();

            // Check each number in the list
            for (int number : numbers) {
                if (isPrime(number)) {
                    primes.add(number); // Add to the primes list if it's prime
                }
            }

            // Print the prime numbers
            System.out.println("Prime numbers in the list: " + primes);
        }
    }

