package Sorting_Algos;

public class Bubble_sort {

    public static void bubbleSort(int[] arr, int n) {
        for (int pass = n - 1; pass >= 0; pass--) {
            for (int i = 0; i < pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr, arr.length);

        System.out.println("\nSorted Array (Bubble Sort):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
