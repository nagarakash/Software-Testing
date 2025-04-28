
// WAJP to iterate through all elements in an array list.


package Module6;

import java.util.ArrayList;

public class P19_Iterate {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating using for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("\nIterating using iterator:");
        java.util.Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
