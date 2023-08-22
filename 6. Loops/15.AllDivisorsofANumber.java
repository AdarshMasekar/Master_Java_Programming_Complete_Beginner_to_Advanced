package Loops;

import java.util.*;

class AllDivisorsofANumber {

    static void printAllDivisors(int num) {
        System.out.println("All divisors of number " + num + " are :");
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count == 2) {
            System.out.println();
            System.out.println("The number " + num + " is a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printAllDivisors(num);
    }
}

// output:
// 7
// All divisors of number 7 are :
// 1 7
// The number 7 is a prime number

// 56
// All divisors of number 56 are :
// 1 2 4 7 8 14 28 56
