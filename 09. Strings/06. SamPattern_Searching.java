package Strings;

import java.util.Scanner;

public class Pattern_Searching {

    public static void patternIndex(String main, String pattern) {
        // StringBuilder str = new StringBuilder(main);
        int l1 = main.length(), l2 = pattern.length();
        boolean isFound = false;
        for (int i = 0; i <= l1 - l2; i++) {
            // System.out.println(main.substring(i, (l2 + i)));
            if (main.substring(i, (i + l2)).equals(pattern)) {
                System.out.print(i + " ");
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }

    static void findIndexes(String str, String pattern) {
        int pos = str.indexOf(pattern);
        while (pos >= 0) {
            System.out.print(pos + " ");
            pos = str.indexOf(pattern, pos + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main String : ");
        String main = sc.nextLine();
        System.out.println("Enter the pattern String : ");
        String pattern = sc.nextLine();

        // patternIndex(main, pattern);
        findIndexes(main, pattern);

        sc.close();
    }
}

// output:
// Enter the main String :
// pattern searching problem search
// Enter the pattern String :
// sear
// 8 26
