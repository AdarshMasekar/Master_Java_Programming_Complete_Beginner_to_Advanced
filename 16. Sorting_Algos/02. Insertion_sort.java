package Sorting_Algos;

public class Insertion_sort {

    // Function to perform insertion sort on an array
    public static void insertionSort(int A[]) {
        int n = A.length;

        // Start iterating from the second element (index 1)
        for (int i = 1; i < n; i++) {
            // Store the current element in a temporary variable
            int temp = A[i];
            // Initialize a variable to keep track of the position where 'temp' should be inserted
            int position = i;

            // Move elements greater than 'temp' to the right to make space for 'temp'
            while (position > 0 && A[position - 1] > temp) {
                A[position] = A[position - 1]; // Shift the element to the right
                position = position - 1; // Move to the left
            }

            // Place 'temp' in its correct position
            A[position] = temp;
        }
    }

    public static void main(String[] args) {
        // Sample array to be sorted
        int[] arr = { 64, 25, 12, 22, 11 };

        // Display the original array
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Call the insertionSort function to sort the array
        insertionSort(arr);

        // Display the sorted array using insertion sort
        System.out.println("\nSorted Array (Insertion Sort):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
