/*✅ What is Polymorphism in Java?

Polymorphism means "one name, many forms". In Java, it allows the same method or object to behave differently depending on the context.

✨ Types of Polymorphism in Java
Type	When it Occurs	Also Called	Example
Compile-time Polymorphism	At compile time	Method Overloading	Same method name, different parameters
Runtime Polymorphism	At runtime	Method Overriding	Child class provides its own version of parent’s method */

//1️⃣ Compile-time Polymorphism (Method Overloading)

// Program to demonstrate all variations of Method Overloading in Java

class OverloadingDemo {

    // 1. Overloading by changing the NUMBER of parameters
    void display(int a) {
        System.out.println("Display with 1 parameter: " + a);
    }

    void display(int a, int b) {
        System.out.println("Display with 2 parameters: " + a + ", " + b);
    }

    // 2. Overloading by changing the DATA TYPE of parameters
    void show(int a) {
        System.out.println("Show with int: " + a);
    }

    void show(double a) {
        System.out.println("Show with double: " + a);
    }

    // 3. Overloading by changing the ORDER of parameters
    void print(int a, String b) {
        System.out.println("Print with (int, String): " + a + ", " + b);
    }

    void print(String b, int a) {
        System.out.println("Print with (String, int): " + b + ", " + a);
    }

    // 4. Overloading with TYPE PROMOTION (int → double automatically)
    void calculate(double a) { 
        System.out.println("Calculate with double: " + a);
    }

    // 5. Overloading using RETURN TYPE (Note: return type alone CANNOT overload!)
    // INVALID: int test(int a) and double test(int a) would cause error if parameters same
    int test(int a, int b) { // valid because parameters are different
        return a + b;
    }

    double test(double a, double b) { // valid because parameters are different
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();

        // Testing Overloads

        obj.display(10);          // 1 parameter
        obj.display(10, 20);      // 2 parameters

        obj.show(5);              // int version
        obj.show(5.5);            // double version

        obj.print(100, "Hello");  // (int, String)
        obj.print("World", 200);  // (String, int)

        obj.calculate(10);        // int promoted to double

        System.out.println("Test(int,int): " + obj.test(2, 3));       // int version
        System.out.println("Test(double,double): " + obj.test(2.5, 3.5)); // double version
    }
}


