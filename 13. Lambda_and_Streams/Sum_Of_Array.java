package Streams_and_Lambda;

import java.util.Arrays;

public class Sum_Of_Array {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int sum = Arrays.stream(arr)
                .sum();
        System.out.println("Sum of all arr elements is = " + sum);
    }
}
