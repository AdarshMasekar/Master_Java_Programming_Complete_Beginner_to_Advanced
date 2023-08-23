package Strings;

import java.util.*;

// The class to demonstrate various string operations
public class String_Operations {
    public static void main(String[] args) {
        // Two example strings for comparison and manipulation
        String str1 = "Adarsh Masekar";
        String str2 = "adarsh masekar";

        // Check if the two strings are equal, ignoring case
        System.out.println(str1.equalsIgnoreCase(str2)); // Outputs: true

        // Convert the first string to lowercase
        System.out.println(str1.toLowerCase()); // Outputs: adarsh masekar

        // Convert the second string to lowercase
        System.out.println(str2.toLowerCase()); // Outputs: adarsh masekar

        // Concatenate the two strings with a space in between
        System.out.println(str1.concat(" " + str2)); // Outputs: Adarsh Masekar adarsh masekar
    }
}

// output:
// true
// adarsh masekar
// adarsh masekar
// Adarsh Masekar adarsh masekar
