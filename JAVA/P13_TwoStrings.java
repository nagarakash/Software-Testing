
// WAJP to Compare Two String


package Module6;

import java.util.Scanner;

public class P13_TwoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Comparing strings using equals()
        if (str1.equals(str2)) {
            System.out.println("The strings are equal using equals().");
        } else {
            System.out.println("The strings are NOT equal using equals().");
        }

        // Comparing strings using compareTo()
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("The strings are equal using compareTo().");
        } else if (result < 0) {
            System.out.println("First string is lexicographically smaller than the second.");
        } else {
            System.out.println("First string is lexicographically greater than the second.");
        }

        scanner.close();
    }
}
