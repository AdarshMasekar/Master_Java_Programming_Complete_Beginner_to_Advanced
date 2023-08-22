package Loops;

import java.util.Scanner;

public class LCMofTwoNumbers {

    static int lcm(int first, int second) {
        int ans = 0, max = Math.max(first, second), min = Math.min(first, second);
        for (int i = 1; i <= max; i++) {
            if ((max * i) % min == 0) {
                ans = max * i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println(lcm(first, second));
    }
}

// output
// 3
// 14
// 42
