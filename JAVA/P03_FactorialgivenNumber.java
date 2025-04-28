
//W.A.J.P to find factorial for Given Number.

package Module6;

import java.util.Scanner;

public class P03_FactorialgivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();

        long factorial = 1;

        // Checking for negative input
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        scanner.close();
    }
}
