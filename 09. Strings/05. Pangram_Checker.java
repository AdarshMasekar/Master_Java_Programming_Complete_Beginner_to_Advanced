package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Pangram_Checker {

    // Checks if a character is within the range of lowercase letters ('a' to 'z')
    static boolean isCharacter(char in) {
        char start = 'a', end = 'z';
        if ((int) in >= (int) start && (int) in <= (int) end) {
            return true;
        }
        return false;
    }

    // Converts a character to lowercase if it's within the range of lowercase
    // letters
    static char isCharacterChar(char in) {
        char start = 'a', end = 'z';
        if ((int) in >= (int) start && (int) in <= (int) end) {
            return in;
        }
        return '@'; // Placeholder for characters that are not in the lowercase range
    }

    // Checks if a string is a pangram using HashSet
    static void isPanagram(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (isCharacter(str.charAt(i))) {
                set.add(str.charAt(i));
            }
        }

        if (set.size() == 26) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

    // Checks if a string is a pangram using sorting and counting unique characters
    static void isPanagram2(String str) {
        int chars = 0;
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        int n = str.length();

        for (int i = 0; i < n - 1; i++) {
            if (isCharacter(arr[i]) && arr[i] != arr[i + 1]) {
                chars++;
            }
        }
        if (isCharacter(arr[n - 2]) && isCharacter(arr[n - 1]) && arr[n - 2] != arr[n - 1]) {
            chars++;
        }
        if (chars == 26) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Checks if a string is a pangram using a HashMap to count characters
    static void isPanagram3(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(isCharacterChar(str.charAt(i)))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        if (map.containsKey(' ')) {
            map.remove(' ');
        }

        if (map.size() == 26) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

    // Checks if a string is a pangram using a boolean array to track character
    // occurrences
    static void isPanagram4(String str) {
        boolean[] visited = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                visited[ch - 'a'] = true;
            }
        }

        for (boolean ch : visited) {
            if (ch != true) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("yes");
    }

    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";

        String st2 = "the k br";

        // Calling the different pangram checking methods and printing results
        isPanagram(str.toLowerCase());
        isPanagram(st2.toLowerCase());
        System.out.println();

        isPanagram2(str.toLowerCase());
        isPanagram2(st2.toLowerCase());
        System.out.println();

        isPanagram3(str.toLowerCase());
        isPanagram3(st2.toLowerCase());
        System.out.println();

        isPanagram4(str);
        isPanagram4(st2);
    }
}

// output:
// Yes
// No

// Yes
// No

// Yes
// No

// Yes
// No
