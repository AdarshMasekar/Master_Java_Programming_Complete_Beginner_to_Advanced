package Strings;

import java.util.Scanner;

public class Reverse_String {
    // Function to reverse a given string and print the reversed string
    static void reverse(String str) {
        System.out.print("Reversed string is: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            // Print the character at index i, starting from the end of the string
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be reversed: ");
        String str = sc.nextLine();

        // Call the reverse function to reverse and print the input string
        reverse(str);

        // Close the scanner to free up resources
        sc.close();
    }
}

// Output:
// Enter the string to be reversed
// geeks for geeks
// Reversed string is: skeeg rof skeeg
