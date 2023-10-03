package List.ArrayList;
import java.util.ArrayList;

public class Methods_in_ArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);        // Add element 10 at the end
        numbers.add(20);        // Add element 20 at the end
        numbers.add(30);        // Add element 30 at the end

        // Accessing elements by index
        int firstElement = numbers.get(0); // Access the first element (10)
        System.out.println("First Element: " + firstElement);

        // Updating elements by index
        numbers.set(1, 25);     // Update the element at index 1 to 25
        System.out.println("Updated ArrayList: " + numbers);

        // Removing elements by value
        boolean removed = numbers.remove(Integer.valueOf(30)); // Remove element 30
        System.out.println("Element 30 removed: " + removed);
        System.out.println("Updated ArrayList: " + numbers);

        // Removing elements by index
        int removedElement = numbers.remove(0); // Remove the first element (10)
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Updated ArrayList: " + numbers);

        // Checking if an element exists
        boolean contains = numbers.contains(25); // Check if the ArrayList contains 25
        System.out.println("ArrayList contains 25: " + contains);

        // Getting the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        // Checking if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is ArrayList empty: " + isEmpty);

        // Clearing the ArrayList
        numbers.clear();
        System.out.println("Cleared ArrayList: " + numbers);
    }
}
