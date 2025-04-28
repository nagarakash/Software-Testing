
// WAJP to calculate the average value of array elements

package Module6;

public class P10_AverageArrayValue {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        // Calculate sum of the elements
        for (int num : numbers) {
            sum += num;
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        System.out.println("Average value of array elements is: " + average);
    }
}
