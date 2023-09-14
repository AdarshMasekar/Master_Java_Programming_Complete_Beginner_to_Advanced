package Strings; // This code belongs to the "Strings" package.
// leetcode : https://leetcode.com/problems/zigzag-conversion/
public class Zig_Zag_Conversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s; // If there's only one row, return the original string as is.
        }
        StringBuilder result = new StringBuilder(); // Create a StringBuilder to store the zigzag pattern.
        int n = s.length(); // Get the length of the input string.
        int cycleLen = 2 * numRows - 2; // Calculate the length of each zigzag cycle.

        for (int i = 0; i < numRows; i++) { // Loop through each row.
            for (int j = 0; j + i < n; j += cycleLen) { // Loop through characters in each cycle.
                result.append(s.charAt(j + i)); // Append the character at the current position to the result.

                // Check if we are not at the first and last row, and if there's a valid character to append.
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n) {
                    result.append(s.charAt(j + cycleLen - i)); // Append the second character in the cycle.
                }
            }
        }
        return result.toString(); // Convert the StringBuilder to a string and return the zigzag pattern.
    }
}
