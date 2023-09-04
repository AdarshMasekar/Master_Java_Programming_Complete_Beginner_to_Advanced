package Loops;

import java.util.Scanner;

public class Fibonacci_Number {

    static void printFib(int num) {
        int firstIndex = 0, nextIndex = 1;
        System.out.print(firstIndex + " " + nextIndex + " ");
        for (int i = 2; i < num; i++) {
            int presentIndex = firstIndex + nextIndex;
            System.out.print(presentIndex + " ");
            firstIndex = nextIndex;
            nextIndex = presentIndex;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        printFib(num);
    }

}


// output:
// 5
// 0 1 1 2 3
