package Strings;

import java.util.Scanner;

public class Check_if_Palindrome {

    // Function to check if a given string is a palindrome
    static void isPalindrome(String str) {
        int start = 0, end = str.length() - 1;

        // Iterate over the first half of the string
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println("Given string " + str + " is not Palindrome");
                return;
            }
            start++;
            end--;
        }

        // If the loop completes without returning, the string is a palindrome
        System.out.println("Given string " + str + " is Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Call the isPalindrome function to check if the input string is a palindrome
        isPalindrome(str);

        sc.close();
    }
}

// Enter a string:
// aslalsa
// given string aslalsa is Palindrome

// Enter a string:
// ahuuh
// given string ahuuh is not Palindrome
