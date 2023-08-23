package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Count_Distinct_Elements {

    // Time Complexity: O(n*log(n)) due to the sorting step
    // Space Complexity: O(1) as only a constant amount of extra space is used
    static int countDistinct(int[] arr) {
        int ans = 0;
        Arrays.sort(arr); // Sort the array in ascending order
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                ans += 1; // Count distinct elements by comparing adjacent elements
            }
        }
        return ans + 1; // Add 1 for the first element
    }

    // Time Complexity: O(n) as each element is inserted into the HashMap once
    // Space Complexity: O(n) due to the space used by the HashMap
    static int countDistinctUsingHashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1); // Insert unique elements into the HashMap
                ans++;
            }
        }
        return ans; // Return the count of distinct elements
    }

    // Time Complexity: O(n) as each element is inserted into the HashSet once
    // Space Complexity: O(n) due to the space used by the HashSet
    static int countDistinctUsingHashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]); // Insert unique elements into the HashSet
        }
        return set.size(); // Return the size of the HashSet, which is the count of distinct elements
    }

    // Time Complexity: O(n^2) due to nested loops
    // Space Complexity: O(1) as only a constant amount of extra space is used
    static int doubleLoop(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;
            for (int j = (i - 1); j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    isDistinct = false; // Check if the current element is distinct by comparing with previous elements
                }
            }
            if (isDistinct) {
                ans++;
            }
        }
        return ans; // Return the count of distinct elements
    }

    public static void main(String[] args) {
        int[] a = { 10, 18, 25, 55, 46, 25 };
        System.out.println("normal ans : " + countDistinct(a));
        System.out.println("DoubleLoop ans : " + doubleLoop(a)); // Output using double loop approach
        System.out.println("hashset ans : " + countDistinctUsingHashSet(a)); // Output using HashSet approach best
                                                                             // approach
        System.out.println("hashmap ans : " + countDistinctUsingHashMap(a)); // Output using HashMap approach
    }
}

// output :
// normal ans : 5
// DoubleLoop ans : 5
// hashset ans : 5
// hashmap ans : 5
