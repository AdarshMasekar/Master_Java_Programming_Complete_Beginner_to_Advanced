package Arrays;

public class Rotate_Array {

    // Function to reverse a subarray within the given array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array to the right by 'k' positions using an extra
    // loop
    public static void rotateArray(int[] arr, int k) {
        int size = arr.length;
        k = k % size; // To handle cases where k is larger than the array size

        while (k > 0) {
            int last = arr[size - 1];
            for (int i = size - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
            k--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to rotate the array to the right by 'k' positions using array
    // reversal
    public static void rotateArrayUsingReverse(int[] arr, int k) {
        int size = arr.length;
        k = k % size; // To handle cases where k is larger than the array size

        // Reverse the entire array
        reverse(arr, 0, size - 1);
        // Reverse the first 'k' elements
        reverse(arr, 0, k - 1);
        // Reverse the remaining elements after 'k'
        reverse(arr, k, size - 1);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 3, 7 };
        int k = 3;

        // Rotate the array using the reverse method
        rotateArrayUsingReverse(arr, k);
    }
}
