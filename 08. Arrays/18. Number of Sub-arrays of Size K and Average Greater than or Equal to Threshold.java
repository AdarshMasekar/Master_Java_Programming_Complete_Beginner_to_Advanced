package Arrays;

public class Sub_Array {

    // This method calculates the number of subarrays in the given array 'arr' of length 'k' 
    // such that the average of the subarray is greater than or equal to 'threshold'.
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0; // Initialize a counter to keep track of the valid subarrays.
        
        // Iterate through the 'arr' array.
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0; // Initialize a variable to store the sum of elements in the current subarray.
            
            // Calculate the sum of elements in the current subarray of length 'k'.
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            
            // Check if the average of the subarray is greater than or equal to 'threshold'.
            if ((sum / k) >= threshold) {
                ans++; // If the condition is met, increment the counter.
            }
        }
        
        return ans; // Return the count of valid subarrays.
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2, 5, 5, 5, 8 };
        int k = 3, threshold = 4;
        
        // Call the 'numOfSubarrays' method with the provided input and print the result.
        System.out.println(numOfSubarrays(arr, k, threshold));
    }
}
