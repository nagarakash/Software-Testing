
// WAJP to remove the third element from a array list

package Module6;

import java.util.ArrayList;

public class P21_ThirdEleArray {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display original list
        System.out.println("Original ArrayList: " + colors);

        // Remove the third element (index 2)
        if (colors.size() >= 3) {
            colors.remove(2);
            System.out.println("ArrayList after removing the third element: " + colors);
        } else {
            System.out.println("ArrayList doesn't have a third element to remove.");
        }
    }
}

