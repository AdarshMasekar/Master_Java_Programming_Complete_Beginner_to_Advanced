package Generics;

public class Introduction_to_generics {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                T temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        for (T value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        String[] strArr = { "adarsh", "masekar", "akash", "vicky", "manjunath", "raghu" };
        Integer[] intArr = { 9, 7, 5, 8, 6, 1, 2, 4, 3 };

        sort(strArr);
        sort(intArr);
    }
}
