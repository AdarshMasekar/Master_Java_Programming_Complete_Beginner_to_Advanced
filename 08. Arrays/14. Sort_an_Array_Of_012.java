package Arrays;

public class Sort_an_Array_Of_012 {

    public static void sort012(int arr[], int n) {

        int start = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, mid, start);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 1, 0, 2, 0 };
        sort012(arr, arr.length);
        System.out.println("completed");

    }
}
