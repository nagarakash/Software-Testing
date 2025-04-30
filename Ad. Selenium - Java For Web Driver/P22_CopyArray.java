
// WAJP to Copy one array into another

package Module6;

public class P22_CopyArray {
    public static void main(String[] args) {
        // Original array
        int[] original = {10, 20, 30, 40, 50};

        // Create another array of the same length
        int[] copy = new int[original.length];

        // Copy elements manually using a loop
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        // Display the copied array
        System.out.println("Original Array:");
        for (int num : original) {
            System.out.print(num + " ");
        }

        System.out.println("\nCopied Array:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}

