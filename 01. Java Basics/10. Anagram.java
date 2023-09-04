package Arrays;

import java.util.HashMap;

public class Anagram {

    // Function to find the length of a number
    static int findLength(int a) {
        int len = 0;
        while (a > 0) {
            a /= 10;
            len++;
        }
        return len;
    }

    // Function to check if two numbers are anagrams using an array
    static void isAnagram(int a, int b) {
        int[] arr = new int[10]; // To keep track of digit occurrences

        int lenA = findLength(a);
        int lenB = findLength(b);

        if (lenA != lenB) {
            System.out.println("Not an anagram!");
            return;
        }

        for (int i = 0, j = 0; i < lenA && j < lenB; i++, j++) {
            int digita = a % 10;
            a /= 10;
            arr[digita]++;

            int digitb = b % 10;
            b /= 10;
            arr[digitb]--;
        }

        for (int n : arr) {
            if (n != 0) {
                System.out.println("Not an anagram!");
                return;
            }
        }
        System.out.println("Anagram");
    }

    // Function to check if two numbers are anagrams using a HashMap
    static void isAnagramUsingHashMap(int a, int b) {
        HashMap<Integer, Integer> map = new HashMap<>();

        while (a > 0 && b > 0) {
            int digitA = a % 10;
            if (map.containsKey(digitA)) {
                map.put(digitA, map.get(digitA) + 1);
            } else {
                map.put(digitA, 1);
            }

            int digitB = b % 10;
            if (map.containsKey(digitB)) {
                map.put(digitB, map.get(digitB) - 1);
            } else {
                map.put(digitB, -1);
            }

            a /= 10;
            b /= 10;
        }

        // Check if there are remaining digits in either number
        if (b > 0 || a > 0) {
            System.out.println("Not an Anagram!");
        }

        // Print the occurrences of each digit in the HashMap
        for (Integer i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }
        System.out.println("Anagram");
    }

    public static void main(String[] args) {
        int a = 172;
        int b = 127;

        // Check if the numbers are anagrams using the HashMap method
        isAnagramUsingHashMap(a, b);
    }
}
