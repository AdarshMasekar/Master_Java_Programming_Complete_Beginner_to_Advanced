package Functions_or_Methods;

import java.util.ArrayList;
import java.util.List;

public class PrimeFacctorization {
    public static List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();

        // Divide by 2 until n is odd
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // Check for prime factors starting from 3
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // If n is still greater than 2, it's a prime factor
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }

    public static void main(String[] args) {
        int num = 51;
        List<Integer> factors = primeFactors(num);

        System.out.printf("Prime factorization of %d: ", num);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
    }
}

// output:
// Prime factorization of 51: 3 17
