package Streams_and_Lambda;

import java.util.Arrays;

public class Print_String {
    public static void main(String[] args) {
        String arr[] = { "abc", "cde", "acd", "aec", "xyz" };

        // print the strings which starts with a and ends with the letter c
        Arrays.stream(arr)
                .filter(string -> string.startsWith("a"))
                .filter(string -> string.endsWith("c"))
                .forEach(string -> System.out.println(string));

    }
}
