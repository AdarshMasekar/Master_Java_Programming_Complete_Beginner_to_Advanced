package Strings;

import java.util.Scanner;

public class Reverse_String {
    // Function to reverse a given string and print the reversed string
    static void reverse(String str) {
        System.out.print("Reversed string is: ");

        // Iterate through the characters of the input string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            // Print the character at index i, starting from the end of the string
            System.out.print(str.charAt(i));
        }

        // No need to store the reversed string if we're just printing it
    }

    // Function to reverse a string using the StringBuilder class
    static void reverseUsingStringBuilder(String str) {
        // Create a StringBuilder instance with the input string
        StringBuilder sb = new StringBuilder(str);

        // Use the reverse() method of StringBuilder to reverse the content
        sb.reverse();

        // Print the reversed string obtained from the StringBuilder
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to be reversed: ");
        String str = sc.nextLine();

        // Call the reverse function to reverse and print the input string
        reverse(str);

        // Call the reverseUsingStringBuilder function to achieve the same using
        // StringBuilder
        reverseUsingStringBuilder(str);

        // Close the scanner to free up resources
        sc.close();
    }
}

// Output:
// Enter the string to be reversed
// geeks for geeks
// Reversed string is: skeeg rof skeeg
