package Sorting_Algos;

public class Insertion_sort {

    public static void insertionSort(int[] arr){
        for(int i=1;i<n;i++) {
            int temp = A[i];
            int position = i;
            while(position>0 && A[position-1] > temp) {
                A[position] = A[position-1];
                position = position - 1;
            }
            A[position] = temp;
        }
    }
    

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        System.out.println("\nSorted Array (Insertion Sort):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
