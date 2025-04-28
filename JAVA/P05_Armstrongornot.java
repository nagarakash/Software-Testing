
// W.A.J.P to check given number is Armstrong or not?

package Module6;

import java.util.Scanner;

public class P05_Armstrongornot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = scanner.nextInt();
        int originalNum = num;

        int sum = 0;
        int digits = 0;
        int temp = num;

        // Count number of digits
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = num;

        // Calculate the sum of digits raised to the power of 'digits'
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Output result
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        scanner.close();
    }
}




