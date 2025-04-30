package Module6;

import java.util.Scanner;

public class P04_PrimeorNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number to check if it's prime: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        // Prime check logic
        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }

        scanner.close();
    }
}

