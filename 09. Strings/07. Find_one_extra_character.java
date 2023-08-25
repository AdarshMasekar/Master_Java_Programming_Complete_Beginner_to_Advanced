package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class Find_one_extra_character {

    // Function to find the extra character in two strings using a HashMap
    static void findExtraCharacterUsingHashMap(String str1, String str2) {
        // Create a HashMap to store characters and their frequencies
        HashMap<Character, Integer> map = new HashMap<>();

        // Calculate the lengths of the input strings
        int l1 = str1.length(), l2 = str2.length();

        // Determine the maximum length between the two strings
        int maxLen = l1 > l2 ? l1 : l2;

        // Iterate through both strings and populate the HashMap
        for (int i = 0; i < maxLen; i++) {
            if (i < l1) {
                // Update the frequency count of characters from string 1
                if (map.containsKey(str1.charAt(i))) {
                    map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
                } else {
                    map.put(str1.charAt(i), 1);
                }
            }
            if (i < l2) {
                // Update the frequency count of characters from string 2
                if (map.containsKey(str2.charAt(i))) {
                    map.put(str2.charAt(i), map.get(str2.charAt(i)) + 1);
                } else {
                    map.put(str2.charAt(i), 1);
                }
            }
        }

        // Iterate through the HashMap to find the character with a frequency of 1
        for (Character key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.print("The different character is: " + key);
            }
        }
    }

    // Function to find the extra character in two strings using bitwise XOR
    static void findExtraCharacter(String str1, String str2) {
        int res = 0;
        int len = str1.length();

        // Perform bitwise XOR on corresponding characters from both strings
        for (int i = 0; i < len; i++) {
            res = res ^ str1.charAt(i) ^ str2.charAt(i);
        }

        // Perform XOR on the last character of the longer string
        res ^= str2.charAt(len);

        // Print the extra character found using XOR
        System.out.println("The different character is: " + (char) res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        // Call the findExtraCharacter function to find and print the extra character
        // using XOR
        findExtraCharacter(str1, str2);

        // Call the findExtraCharacterUsingHashMap function to achieve the same using a
        // HashMap
        findExtraCharacterUsingHashMap(str1, str2);

        // Close the scanner to free up resources
        sc.close();
    }
}

// output:
// hsha
// hisha
// i
