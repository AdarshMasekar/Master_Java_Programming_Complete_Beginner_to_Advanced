package Advanced_Concepts_in_Java;

import java.math.BigInteger;
import java.util.Scanner;

public class Big_Integer {

    public static BigInteger factorial(int num) {
        BigInteger res = new BigInteger("1");
        for (int i = 2; i <= num; i++) {
            BigInteger current = BigInteger.valueOf(i);
            res = res.multiply(current);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find the factorial value of :");

        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
}
