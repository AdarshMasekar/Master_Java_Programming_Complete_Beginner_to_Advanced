package Streams_and_Lambda;

import java.util.Arrays;

class Average_of_the_Array {
    public static void main(String[] args) {
        int arr[] = { 8, 100, 20, 40, 3, 7 };
        double average = Arrays.stream(arr)
                .average()
                .getAsDouble();
        System.out.println("Average of this arr is : " + average);
    }
}