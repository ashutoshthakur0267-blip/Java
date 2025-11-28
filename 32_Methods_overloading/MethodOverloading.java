public class MethodOverloading {

    // ---------------- KEY POINTS ----------------
    // 1. Method Overloading → Same method name but different parameter list.
    // 2. It helps increase readability and flexibility.
    // 3. Overloading is achieved by:
    //    - Changing the number of parameters
    //    - Changing the type of parameters
    //    - Changing the order of parameters
    // 4. Return type alone CANNOT distinguish overloaded methods.
    // 5. It is an example of **Compile-time Polymorphism**.
    // ------------------------------------------------------------

    // 1. Method with no parameters
    static void greet() {
        System.out.println("Hello! No parameters here.");
    }

    // 2. Method with one parameter
    static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }

    // 3. Method with two parameters (int)
    static void greet(int age, int year) {
        System.out.println("You are " + age + " years old in year " + year + ".");
    }

    // 4. Method with two parameters (different types → String and int)
    static void greet(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }

    // 5. Method with two parameters but order reversed (int first, String second)
    static void greet(int age, String name) {
        System.out.println("Hi " + name + ", your age is " + age + ".");
    }

    // 6. Method with different return type but must also have different parameters
    static double greet(double x, double y) {
        double result = x + y;
        System.out.println("Sum of doubles: " + result);
        return result;
    }

    public static void main(String[] args) {

        // Calling all overloaded versions
        greet(); // Calls method with no parameters

        greet("Ashutosh"); // Calls method with String parameter

        greet(21, 2025); // Calls method with two int parameters

        greet("Ashutosh", 21); // Calls method with (String, int)

        greet(21, "Ashutosh"); // Calls method with (int, String)

        double val = greet(5.5, 6.5); // Calls method with double params
        System.out.println("Returned value from double sum = " + val);
    }
}
