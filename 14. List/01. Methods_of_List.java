package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Methods_of_List {
    public static void main(String[] args) {
        // Create a new ArrayList to store integers
        List<Integer> list = new ArrayList<>();

        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Forward traversal
        System.out.println("Forward printing of list elements: ");
        // Create a ListIterator for forward traversal
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            // Print each element in the list
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Backward traversal
        System.out.println("Backward printing of list element: ");
        // Create a ListIterator for backward traversal starting from the end of the
        // list
        ListIterator<Integer> it2 = list.listIterator(list.size());
        while (it2.hasPrevious()) {
            // Print each element in reverse order
            System.out.print(it2.previous() + " ");
        }
        System.out.println();

        // Usage of set method in list to multiply each element by 2
        ListIterator<Integer> it3 = list.listIterator();
        while (it3.hasNext()) {
            // Get the current element, multiply it by 2, and set it back to the list
            int num = (Integer) it3.next();
            it3.set(num * 2);
        }
        System.out.println(list); // [20, 40, 60, 80, 100]

        // Add method to add number 5 after each element in the list
        ListIterator<Integer> it4 = list.listIterator();
        while (it4.hasNext()) {
            // Add 5 after each element and move the iterator to the next position
            it4.add(5);
            it4.next();
        }
        System.out.println(list); // [5, 20, 5, 40, 5, 60, 5, 80, 5, 100]

        // Using nextIndex and previousIndex methods in the list iterator
        ListIterator<Integer> it5 = list.listIterator(3); // Start at index 3
        System.out.println("next index of it5 is: " + it5.nextIndex()); // next index of it5 is: 3
        System.out.println("previous index of it5 is: " + it5.previousIndex()); // previous index of it5 is: 2

        // Using remove method to remove elements greater than 50
        ListIterator<Integer> it6 = list.listIterator();
        while (it6.hasNext()) {
            int num = (Integer) it6.next();
            // If the current element is greater than 50, remove it from the list
            if (num > 50) {
                it6.remove();
            }
        }
        System.out.println(list); // [5, 20, 5, 40, 5, 5, 5]
    }
}
