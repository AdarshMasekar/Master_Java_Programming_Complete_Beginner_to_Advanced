package Functions_or_Methods;

public class Functions {

    static void fun1() {
        System.out.println("Beginning of fun1");
        System.out.println("Ending of fun1");
    }

    static void fun2() {
        System.out.println("Beginning of fun2");
        System.out.println("Ending of fun2");
    }

    public static void main(String[] args) {
        System.out.println("Before function call");
        fun1();
        fun2();
        System.out.println("After function call");
    }
}

// output:
// Before function call
// Beginning of fun1
// Ending of fun1
// Beginning of fun2
// Ending of fun2
// After function call
