package Module6;

import java.util.Scanner;

public class P01_GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking three numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Finding the greatest number
        int greatest;
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        // Displaying the result
        System.out.println("The greatest number is: " + greatest);
        
        scanner.close();
    }
}
