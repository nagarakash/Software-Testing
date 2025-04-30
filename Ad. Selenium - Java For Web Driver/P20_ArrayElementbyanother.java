
// WAJP to update specific array element by given element.

package Module6;

import java.util.Scanner;

public class P20_ArrayElementbyanother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample array
        int[] numbers = {10, 20, 30, 40, 50};

        // Display original array
        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Get index and new value from user
        System.out.print("\n\nEnter the index of the element you want to update (0 to " + (numbers.length - 1) + "): ");
        int index = scanner.nextInt();

        if (index < 0 || index >= numbers.length) {
            System.out.println("Invalid index.");
        } else {
            System.out.print("Enter the new value: ");
            int newValue = scanner.nextInt();

            // Update the element
            numbers[index] = newValue;

            // Display updated array
            System.out.println("\nUpdated Array:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
