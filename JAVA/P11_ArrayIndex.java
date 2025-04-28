
// WAJP to find the index of an array element.


package Module6;

import java.util.Scanner;

public class P11_ArrayIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array
        int[] numbers = {5, 10, 15, 20, 25, 30};

        // Ask user to enter the element to search
        System.out.print("Enter the element to find its index: ");
        int target = scanner.nextInt();

        int index = -1;

        // Loop to find the index
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        // Print result
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}
