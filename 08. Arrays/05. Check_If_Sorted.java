package Arrays;

import java.util.Scanner;

public class Check_If_Sorted {

    public static void checkSorted(int[] arr) {
        if (arr.length <= 1) {
            System.out.println("Sorted");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Not sorted");
                return;
            }
        }
        System.out.println("sorted");
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println("enter 5 elements :");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        checkSorted(arr);

    }
}

// output:

// enter 5 elements :
// 25 1 1 1 11
// Not sorted

// enter 5 elements :
// 2 4 5 7 8
// sorted
