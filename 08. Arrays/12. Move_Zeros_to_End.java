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

    static void moveZeros2(int[] arr, int n) {
        int[] res = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                res[j] = arr[i];
                j++;
            }
        }

        for (int k = j; k < n; k++) {
            res[k] = 0;
        }

        System.out.println();

        for (int k = 0; k < n; k++) {
            System.out.print(res[k] + " ");
        }
    }

    static void moveZeros3(int[] arr, int n) {
        int start = 0, end = n - 1;
        while (start < end) {
            if (arr[start] == 0 && arr[end] != 0) {
                arr[start] = arr[end];
                arr[end] = 0;
            } else if (arr[start] == 0 && arr[end] == 0) {
                end--;
            } else if (arr[start] != 0 && arr[end] != 0) {
                start++;
            } else { // arr[start] != 0 && arr[end] == 0
                start++;
                end--;
            }
        }

        System.out.println();
        for (int a : arr) {
            System.out.print(a + "  ");
        }
    }

    public static void main(String[] args) {
        // Example arrays
        int arr[] = { 1, 2, 0, 0, 2, 3 };
        int arr2[] = { 0, 0, 0, 1, 5, 0, 2 };

        // Call the method to move zeros in the second example array.

        // Method 1: moveZeros
        moveZeros(arr2, arr2.length); // Time complexity: O(n^2), Space complexity: O(1)

        // Method 2: moveZeros2
        moveZeros2(arr, arr.length); // Time complexity: O(n), Space complexity: O(1) most efficient approach

        // Method 3: moveZeros3
        moveZeros3(arr2, arr2.length); // Time complexity: O(n), Space complexity: O(1)
    }
}
