
// WAP to demonstrate multiple catch blocks

package Module6;

public class P16_Multiplecatchblocks {
    public static void main(String[] args) {
        try {
            // Array operation that may throw exceptions
            int[] numbers = {10, 20, 30};
            int result = numbers[3] / 0; // This will throw ArrayIndexOutOfBoundsException first

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds.");
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }

        System.out.println("Program continues after multiple catch blocks.");
    }
}
