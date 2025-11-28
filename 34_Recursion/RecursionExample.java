public class RecursionExample {

    // ---------------- KEY POINTS ----------------
    // 1. Recursion → When a method calls itself.
    // 2. Every recursive function has:
    //    a) Base Case → condition to stop recursion.
    //    b) Recursive Case → function calling itself.
    // 3. Without base case → infinite recursion → StackOverflowError.
    // 4. Recursion is often used in problems like:
    //    - Factorial
    //    - Fibonacci
    //    - Sum of numbers
    //    - Searching, Sorting (advanced)
    // ------------------------------------------------------------

    // Example 1: Factorial using recursion
    static int factorial(int n) {
        if (n == 0 || n == 1) { // Base case
            return 1;
        }
        return n * factorial(n - 1); // Recursive case
    }

    // Example 2: Fibonacci using recursion
    static int fibonacci(int n) {
        if (n == 0) return 0; // Base case
        if (n == 1) return 1; // Base case
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    // Example 3: Sum of first n natural numbers
    static int sumOfN(int n) {
        if (n == 0) return 0; // Base case
        return n + sumOfN(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        // Factorial
        int fact5 = factorial(5);
        System.out.println("Factorial of 5 = " + fact5); // Output: 120

        // Fibonacci
        System.out.println("First 7 Fibonacci numbers:");
        for (int i = 0; i < 7; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(); // new line

        // Sum of N numbers
        int sum10 = sumOfN(10);
        System.out.println("Sum of first 10 natural numbers = " + sum10); // Output: 55
    }
}
