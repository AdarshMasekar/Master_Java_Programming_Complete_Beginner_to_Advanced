package Generics;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class To_Array_Methods {

    public static void main(String[] args) {
        // Create a Set of integers called "list" using a TreeSet with reverse ordering
        // comparator.
        Set<Integer> list = new TreeSet<>(Comparator.reverseOrder());

        // Add three integers to the set.
        list.add(20);
        list.add(10);
        list.add(30);

        // method one: Convert the Set to an Object array and print its elements.
        Object[] arr1 = list.toArray();
        for (Object x : arr1) {
            System.out.print(x + " ");
        }

        // Create an Integer array with the same size as the Set and populate it with
        // Set elements.
        Integer[] arr2 = new Integer[list.size()];
        arr2 = list.toArray(arr2);

        // Print the elements of the Integer array.
        for (Integer x : arr2) {
            System.out.print(x + " ");
        }
    }
}
