package Strings;

import java.util.*;

public class Reverse_word_order {
    // Function to reverse the word order in a string
    static String reverseWordOrder(String str) {
        String arr[] = str.split(" "); // Split the input string into an array of words
        String result = "";
        int start = 0, end = arr.length - 1;

        // Reverse the order of words using two-pointer technique
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Construct the result string by joining the words
        for (String a : arr) {
            result = result + a + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "I am adarsh masekar from haliyal";

        // Reverse the word order and print the result
        String ans = reverseWordOrder(str);
        System.out.println(ans);
    }
}
