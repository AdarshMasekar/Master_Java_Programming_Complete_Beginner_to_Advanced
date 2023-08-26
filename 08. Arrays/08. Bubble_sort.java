package Arrays;

public class Bubble_sort {

    // Function to perform bubble sort on the given array
    static void bubbleSort(int[] arr) {
        // Outer loop to iterate through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // Inner loop to compare and swap adjacent elements
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Compare adjacent elements, swap if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 54, 112, 44, 6, 7, 21, 582, 84, 32 };

        // Print the initial array
        System.out.println("Initial array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call the bubbleSort function to sort the array
        bubbleSort(arr);
    }
}

// output:
// Initial array:
// 10 54 112 44 6 7 21 582 84 32
// Sorted array: 6 7 10 21 32 44 54 84 112 582
