package Loops;

import java.util.Scanner;

public class FactorialofANumber {

    static int factorial(int num) {
        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(factorial(a));
    }
}

// output:
// 5
// 120
