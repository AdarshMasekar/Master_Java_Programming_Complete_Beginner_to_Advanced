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

    public static int findKthLargestInBigOfN(int[] nums, int k) {
        int n = nums.length, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }

            int arr[] = new int[max - min + 1];

            for (int a = 0; a < n; a++) {
                arr[a - min]++;
            }

            for (int j = arr.length - 1; j >= 0; j--) {
                k -= arr[j];
                if (k <= 0) {
                    return j;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 6 };
        int k = 2;

        // Find and print the kth largest element
        System.out.println("Kth largest element is: " + findKthLargest(arr, k));
        System.out.println("Kth largest element is: " + findKthLargestInBigOfN(arr, k));

    }
}

// output:
// 6
