package Arrays;

import java.util.Iterator;
import java.util.TreeSet;

public class Kth_Smallest_element {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int a : arr) {
            set.add(a);
        }
        for (Integer a : set) {
            System.out.print(a + " ");
        }
        System.out.println();
        int ans = 0;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (k == 0) {
                break;
            }
            ans = it.next();
            k--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        System.out.println(kthSmallest(arr, 3));

    }
}
