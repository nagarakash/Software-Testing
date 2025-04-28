
// WAJP to find the maximum and minimum value of an array

package Module6;

public class P12_Max_MinArray {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {45, 22, 89, 16, 78, 34};

        // Initialize max and min to the first element
        int max = numbers[0];
        int min = numbers[0];

        // Loop to find max and min
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum value in array: " + max);
        System.out.println("Minimum value in array: " + min);
    }
}
