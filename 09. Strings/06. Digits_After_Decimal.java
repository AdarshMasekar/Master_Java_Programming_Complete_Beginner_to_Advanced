package Strings;

import java.util.Scanner;

class Digits_After_Decimal {
    static void digitsAfterDecimal(String str) {
        int index = str.indexOf(".");
        System.out.println(
                index != -1 ? ("value after the decimal is " + str.substring(index + 1)) : "decimal not found!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to find the digits after decimal: ");
        String str = sc.nextLine();

        digitsAfterDecimal(str);
    }
}

// output
// str = "12.5318"
// o/p : value after the decimal is 5318

// str = "1586.5466"
// o/p : value after the decimal is 5466

// str = "155"
// o/p : decimal not found!
