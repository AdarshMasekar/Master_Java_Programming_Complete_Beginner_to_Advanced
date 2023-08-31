package Arrays;

public class Move_Zeros_to_End {
    // This method moves all zeros to the end of the array while maintaining the
    // order of non-zero elements.
    static void moveZeros(int[] arr, int n) {
        // Iterate through the array.
        for (int i = 0; i < n - 1; i++) {
            // Check for a zero at the current position.
            for (int j = i + 1; j < n; j++) {
                // If a zero is found at the current position and a non-zero is found later in
                // the array.
                if (arr[i] == 0 && arr[j] != 0) {
                    // Swap the zero with the non-zero element.
                    arr[i] = arr[j];
                    arr[j] = 0;
                    // Break the loop to avoid unnecessary swaps.
                    break;
                }
            }
        }
        // Print the modified array.
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        // Example arrays
        int arr[] = { 1, 2, 0, 0, 2, 3 };
        int arr2[] = { 0, 0, 0, 1 };
        int n = arr2.length;

        // Call the method to move zeros in the second example array.
        moveZeros(arr2, n);
    }
}


// output:
// 1 0 0 0
