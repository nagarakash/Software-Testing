
// WAJP to concatenate a given string to the end of another string


package Module6;

import java.util.Scanner;

public class P14_AnotherString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string to concatenate: ");
        String str2 = scanner.nextLine();

        // Concatenating the strings
        String result = str1 + str2;

        // You can also use: String result = str1.concat(str2);

        System.out.println("Concatenated string: " + result);

        scanner.close();
    }
}

