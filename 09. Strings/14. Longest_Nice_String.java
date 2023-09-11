package Strings;

// leetcode link : https://leetcode.com/problems/longest-nice-substring/description/
import java.util.HashSet;
import java.util.Set;

public class Longest_Nice_String {

    // Helper method to check if a string is nice
    public static boolean isNiceString(String s) {
        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();

        // Iterate through the characters in the string
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    lower.add(c);
                } else {
                    upper.add(Character.toLowerCase(c)); // Store lowercase version of uppercase letters
                }
            }
        }

        // Check if the sets of lowercase and lowercase-converted uppercase letters are
        // equal
        return lower.equals(upper);
    }

    // Main method to find the longest nice substring
    public static String longestNiceSubstring(String s) {
        String ans = "";
        int maxLength = 0;

        // Iterate through all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                // Check if the substring is nice and has a greater length than the current
                // maximum
                if (isNiceString(temp) && temp.length() > maxLength) {
                    ans = temp; // Update the result
                    maxLength = ans.length(); // Update the maximum length
                }
            }
        }

        return ans; // Return the longest nice substring found
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(longestNiceSubstring("YazaAay"));
        System.out.println(longestNiceSubstring("Bb"));
        System.out.println(longestNiceSubstring("c"));
    }
}
