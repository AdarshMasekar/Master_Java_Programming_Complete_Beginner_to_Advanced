package Loops;

import java.util.Scanner;

public class GCDofTwoNumbers {

    static int gcd(int first, int second) {
        int ans = 0;

        for (int i = 1; i <= Math.min(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println("GCD of " + first + " and " + second + " is: " + gcd(first, second));

    }
}

// output:
// 10
// 25
// GCD of 10 and 25 is: 5
