package Sorting_Algos;

public class Shell_sort {

    // Shell Sort implementation
    public static void shellSort(int arr[], int n) {
        int gap = n / 2, i;
        while (gap > 0) {
            i = 0;
            while (i + gap < n) {
                // Compare and swap elements if necessary
                if (arr[i] > arr[i + gap]) {
                    swap(arr, i, i + gap);
                    // Check elements that are 'gap' positions behind
                    if (i - gap >= 0) {
                        if (arr[i] < arr[i - gap]) {
                            swap(arr, i, i - gap);
                        }
                    }
                }
                i++;
            }
            gap = gap / 2; // Reduce the gap
        }
    }

    // Utility function to swap two elements in an array
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11, 75, 45 };

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Perform Shell Sort on the array
        shellSort(arr, arr.length);

        System.out.println("\nSorted Array (Shell Sort):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
