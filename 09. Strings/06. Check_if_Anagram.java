package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Check_if_Anagram {

    // Function to check if two strings are anagrams using sorting
    static void areAnagramUsingSort(String s1, String s2) {
        // Convert strings to character arrays
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Sort the character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if the sorted arrays are equal
        System.out.println(Arrays.equals(arr1, arr2) ? "Anagram" : "No");
    }

    // Function to check if two strings are anagrams using character count
    static void areAnagram(String s1, String s2) {
        // Check if the lengths of the two strings are different
        if (s1.length() != s2.length()) {
            System.out.printf("both %s and %s are not anagram of each other", s1, s2);
            return;
        }

        // Initialize an array to store the count of each character
        int[] arr = new int[256];

        // Count the occurrences of characters in both strings
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)]++;// Increment count for character in s1
            arr[s2.charAt(i)]--;// Decrement count for character in s2
        }

        // Check if the character count array contains only zeros
        for (int i = 0; i < s1.length(); i++) {
            if (arr[i] != 0) {
                System.out.printf("both %s and %s are not anagram of each other", s1, s2);
                return;
            }
        }

        System.out.printf("both %s and %s are anagram of each other", s1, s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("enter second string: ");
        String s2 = sc.nextLine();

        // Call the anagram checking function
        areAnagram(s1, s2); // TC of this method is O(n)
        areAnagramUsingSort(s1, s2); // TC of this method is O(nlogn)
        sc.close();
    }
}
// output:

// enter first string:
// listen
// enter second string:
// silentn
// both listen and silentn are not anagram of each other

// enter first string:
// silent
// enter second string:
// listen
// both silent and listen are anagram of each other
