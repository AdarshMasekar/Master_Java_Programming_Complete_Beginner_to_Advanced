package Functions_or_Methods;

import java.util.Scanner;

public class Functions_in_java {
    static void fun() {
        System.out.println("Inside Function");
    }

    public static void main(String[] args) {
        System.out.println("Before call");
        fun();
        fun();
        System.out.println("After call");
    }
}

// output:
// Before call
// Inside Function
// Inside Function
// After call
