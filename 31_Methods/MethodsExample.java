public class MethodsExample {

    // ---------------- KEY POINTS ----------------
    // 1. Methods are blocks of code that perform a specific task.
    // 2. They help in reusability, readability, and modular programming.
    // 3. Methods can be:
    //    - With or without parameters
    //    - With or without return type
    // 4. 'static' keyword → allows calling a method without creating an object.
    // 5. 'void' → means the method does not return any value.
    // 6. If return type is not void → must use 'return' statement.
    // 7. Java also has predefined methods like Math.max(), Math.sqrt(), etc.
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

    int sum(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        // Calling methods

        greet(); // Output: Hello! Welcome to Java Methods.

        printSum(10, 20); // Output: Sum of 10 and 20 = 30

        int result = multiply(5, 6); // storing returned value
        System.out.println("Multiplication result = " + result); // Output: 30

        String msg = getMessage(); // storing returned string
        System.out.println(msg); // Output: Java methods make code reusable!

        // Using a predefined method
        double sqrtValue = Math.sqrt(25); // Math is predefined class in Java
        System.out.println("Square root of 25 = " + sqrtValue); // Output: 5.0

        MethodsExample obj=new MethodsExample();
        System.out.println(obj.sum(5,12));
    }
}
