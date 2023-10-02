// Step 1: Define a functional interface
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Step 2: Use lambda expressions to implement the functional interface
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
        };

        // Step 3: Use lambda expressions as arguments or in other expressions
        int result1 = operate(10, 5, addition);
        int result2 = operate(20, 8, subtraction);
        int result3 = operate(6, 3, multiplication);
        int result4 = operate(12, 4, division);

        // Step 4: Print the results
        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);
        System.out.println("Multiplication: " + result3);
        System.out.println("Division: " + result4);
    }

    // Step 5: Create a method that takes a functional interface as an argument
    public static int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
