package Strings;

import java.util.LinkedHashSet;

public class Remove_duplicate_chars {

    // Function to remove duplicate characters using LinkedHashSet
    public static void removeDuplicateChars(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Iterate through the input string and add characters to the set
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        // Construct the final string using StringBuilder
        StringBuilder name = new StringBuilder();
        for (char i : set) {
            name.append(i);
        }

        // Print the result without duplicates
        System.out.println(name);
    }

    // Function to remove duplicate characters using nested loops
    public static void removeDuplicateCharsUsing(String str) {
        StringBuilder strbd = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            boolean repeated = false;

            // Compare with subsequent characters to find duplicates
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    repeated = true;
                }
            }

            // If not repeated, add to the result StringBuilder
            if (!repeated) {
                strbd.append(str.charAt(i));
            }
        }

        // Print the result without duplicates
        System.out.println(strbd.toString());
    }

    public static void main(String[] args) {
        // Input string
        String name = "aabccbd";

        // Remove duplicates using the first method
        removeDuplicateChars(name);

        // Remove duplicates using the second method
        removeDuplicateCharsUsing(name);
    }
}

// output;
// abcd
