
// WAJP to reverse an array of integer values.

package Module6;

public class P23_ReverseArray {
    public static void main(String[] args) {
        // Original array
        int[] numbers = {10, 20, 30, 40, 50};

        // Display original array
        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Reverse the array in-place
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            // Swap elements
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        // Display reversed array
        System.out.println("\nReversed Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

