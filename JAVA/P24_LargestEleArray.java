
// WAJP to find the second largest element in an array.

package Module6;

public class P24_LargestEleArray {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {45, 12, 78, 34, 89, 66};

        // Check if array has at least two elements
        if (numbers.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop to find the largest and second largest
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}

