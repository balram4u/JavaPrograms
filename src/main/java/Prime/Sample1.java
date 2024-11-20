package Prime;
//Prime number is a number which is divisible by 1 or itself.
//eg : 3,5,7,11
// 0 and 1 are not prime numbers
import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) {
        int num ;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Type a number:");
        num = myObj.nextInt(); // Read user input
        boolean flag = false;

        // 0 and 1 are not prime numbers
        if (num == 0 || num == 1) {
            flag = true;
        }

        for (int i = 2; i <= num / 2; ++i) {

            // condition for non prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

