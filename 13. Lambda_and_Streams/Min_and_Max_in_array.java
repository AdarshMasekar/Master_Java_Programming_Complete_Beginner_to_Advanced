package Streams_and_Lambda;

import java.util.Arrays;

public class Min_and_Max_in_array {
    public static void main(String[] args) {
        int arr[] = { 8, 100, 20, 40, 3, 7 };
        if (arr.length > 0) {

            int max = Arrays.stream(arr)
                    .max()
                    .getAsInt();
            System.out.println("maximum element of this array is : " + max);

            int min = Arrays.stream(arr)
                    .min()
                    .getAsInt();
            System.out.println("minimum element of this array is : " + min);
        }
    }
}
