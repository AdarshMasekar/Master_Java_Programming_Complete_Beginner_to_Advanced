package Strings;

public class Introduction_To_Strings {
    public static void main(String[] args) {

        // Creating Strings using different methods

        // Creating a String using a character array
        char[] str1 = new char[6];
        str1[0] = 'a';
        str1[1] = 'd';
        str1[2] = 'a';
        str1[3] = 'r';
        str1[4] = 's';
        str1[5] = 'h';

        // Creating a String using the String constructor
        String str2 = new String("adarsh");

        // Creating a String using StringBuilder (mutable)
        StringBuilder str3 = new StringBuilder("adarsh");

        // Creating a String using StringBuffer (thread-safe)
        StringBuffer str4 = new StringBuffer("adarsh");

        // Printing the created strings
        System.out.println(str1); // char array is converted to String automatically
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        // Using some String methods

        // Getting the length of a String
        System.out.println("Length of str2: " + str2.length());

        // Accessing a character at a specific index
        System.out.println("Character at index 2 of str3: " + str3.charAt(2));

        // Extracting a substring from a String
        System.out.println("Substring starting from index 2 of str3: " + str3.substring(2));

        // Checking if a String contains a specific sequence
        System.out.println("Does str2 contain 'ada'? " + str2.contains("ada"));

        // Checking if two Strings are equal
        System.out.println("Are str2 and str3 equal? " + str2.equals(str3.toString()));

        // Comparing two Strings lexicographically
        System.out.println("Comparison result between str2 and 'adarsj': " + str2.compareTo("adarsj"));

        // Checking if a String starts with a specific prefix
        System.out.println("Does str2 start with 'a'? " + str2.startsWith("a"));
    }
}

// output
// adarsh
// Length of str2: 6
// Character at index 2 of str3: a
// Substring starting from index 2 of str3: arsh
// Does str2 contain 'ada'? true
// Are str2 and str3 equal? true
// Comparison result between str2 and 'adarsj': -2
// Does str2 start with 'a'? true
