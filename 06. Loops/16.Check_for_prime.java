package Loops;

import java.util.*;

class Check_for_prime {

    static void checkforPrime(int num) {
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
            }
        }

        if (num > 1 && flag) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        checkforPrime(num);
    }
}

// output:
// 41
// The number is prime

// 49
// The number is not a prime number
