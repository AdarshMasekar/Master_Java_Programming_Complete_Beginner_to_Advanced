package Arrays;

import java.util.HashMap;

public class Two_Sum {

    // Function to find two numbers in the array that add up to the target
    public static int[] twoSum(int[] nums, int target) {
        // Create a hash map to store values and their corresponding indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i]; // Calculate the value needed to reach the target

            // Check if the needed value is already in the map
            if (map.containsKey(need)) {
                int[] ans = new int[2];
                ans[0] = map.get(need); // Index of the first number
                ans[1] = i; // Current index (second number)
                return ans; // Return the indices of the two numbers
            } else {
                map.put(nums[i], i); // If needed value not found, store current value and its index
            }
        }

        // If no solution found, return default values
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        // Sample array and target sum
        int[] arr = { 2, 7, 11, 15 };
        int sum = 13;

        // Find the indices of the two numbers that add up to the target sum
        int[] ans = twoSum(arr, sum);

        // Print the result
        System.out.print("To find the target indexes ");
        for (int i : ans) {
            System.out.print(i + " & ");
        }
        System.out.print(" Should be added.");
    }
}

// Output:
// To find the target indexes 0 & 2 & Should be added.
