package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_Largest_Element {

    // Function to find the kth largest element in an array
    public static int findKthLargest(int[] nums, int k) {
        // solution one: Sorting the array
        // Arrays.sort(nums);
        // return nums[nums.length - k];

        // solution two: Using a PriorityQueue (Min Heap)
        PriorityQueue<Integer> pq = new PriorityQueue();

        // Add elements to the priority queue
        for (int num : nums) {
            pq.add(num);
            // If the size of the queue exceeds k, remove the smallest element
            if (pq.size() > k) {
                pq.remove();
            }
        }

        // The top of the priority queue will be the kth largest element
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 6 };
        int k = 2;

        // Find and print the kth largest element
        System.out.println("Kth largest element is: " + findKthLargest(arr, k));
    }
}

// output:
// 6
