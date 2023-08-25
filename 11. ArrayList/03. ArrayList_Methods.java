package ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {
        // Demonstrating important methods of ArrayList

        // Create an ArrayList of Integer type
        ArrayList<Integer> al = new ArrayList<>();

        // Adding elements using the add method
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(3);
        al.add(4);
        al.add(5);

        // Adding an element at a specific index
        al.add(0, 0);

        // Accessing an element using the get method
        // Prints the value at index 2 (zero-based indexing)
        System.out.println("Value at index 2: " + al.get(2));

        // Replacing an element at a specific index using the set method
        // Returns the previous value at index 5 and replaces it with 6
        System.out.println("Replaced value: " + al.set(5, 6));

        // Removing an element at a specific index using the remove method
        // Returns the removed value (6 in this case)
        System.out.println("Removed value: " + al.remove(5));

        // Removing an element by its value using the remove method
        // Removes the first occurrence of value 1
        System.out.println("Removed value: " + al.remove(Integer.valueOf(1)));

        // Checking if an element is present using the contains method
        System.out.println("Contains 2? " + al.contains(2));

        // Finding the index of the first occurrence of a value using indexOf method
        // Returns the index of the first occurrence of value 4
        System.out.println("Index of 4: " + al.indexOf(4));

        // Finding the index of the last occurrence of a value using lastIndexOf method
        // Returns the index of the last occurrence of value 4
        System.out.println("Last index of 4: " + al.lastIndexOf(4));

        // Getting the size (number of elements) of the ArrayList using the size method
        System.out.println("Size of ArrayList: " + al.size());

        // Checking if the ArrayList is empty using the isEmpty method
        System.out.println("Is ArrayList empty? " + al.isEmpty());

        // Clearing all elements from the ArrayList using the clear method
        al.clear();
    }
}

// output:
// Value at index 2: 2
// Replaced value: 3
// Removed value: 6
// Removed value: true
// Contains 2? true
// Index of 4: 2
// Last index of 4: 4
// Size of ArrayList: 6
// Is ArrayList empty? false
