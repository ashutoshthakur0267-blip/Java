public class MethodsExample1{

    // ---------------- KEY POINTS ----------------
    // 1. Methods are blocks of code that perform a specific task.
    // 2. Methods improve: Reusability, Readability, and Modularity.
    // 3. Types of methods:
    //    - With or without parameters
    //    - With or without return type
    // 4. 'static' methods → can be called without creating an object.
    // 5. Non-static methods (instance methods) → need an object of the class to be called.
    // 6. 'void' → method does not return anything.
    // 7. If a method has a return type → it MUST return a value.
    // 8. Java also has predefined methods like Math.max(), Math.sqrt(), etc.
    // ------------------------------------------------------------

    // 1. Simple method without parameters and no return type
    static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    // 2. Method with parameters and no return type
    static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " = " + sum);
    }

    // 3. Method with parameters and return type
    static int multiply(int x, int y) {
        return x * y; // must return an int because return type is int
    }

    // 4. Method with no parameters but return type
    static String getMessage() {
        return "Java methods make code reusable!";
    }

    // 5. Instance method (non-static method)
    // Needs an object of MethodsExample to call
    int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        // ------------------- Static Methods -------------------

        greet(); // Output: Hello! Welcome to Java Methods.

        printSum(10, 20); // Output: Sum of 10 and 20 = 30

        int result = multiply(5, 6); // storing returned value
        System.out.println("Multiplication result = " + result); // Output: 30

        String msg = getMessage(); // storing returned string
        System.out.println(msg); // Output: Java methods make code reusable!

        // ------------------- Predefined Methods -------------------
        double sqrtValue = Math.sqrt(25); // Math is predefined class in Java
        System.out.println("Square root of 25 = " + sqrtValue); // Output: 5.0

        // ------------------- Instance Method -------------------
        MethodsExample1 obj = new MethodsExample1(); // create object
        int s = obj.sum(5, 12); // call non-static method using object
        System.out.println("Sum using instance method = " + s); // Output: 17
    }
}
