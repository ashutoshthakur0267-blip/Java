// ✅ Base Class (Level 1)
class A {
    // Default Constructor
    A() {
        System.out.println("Default Constructor of Class A");
    }

    // Parameterized Constructor
    A(int x) {
        System.out.println("Parameterized Constructor of Class A: x = " + x);
    }
}

// ✅ Level 2
class B extends A {
    // Default Constructor
    B() {
        super(); // Calls default constructor of A
        System.out.println("Default Constructor of Class B");
    }

    // Parameterized Constructor
    B(int x, int y) {
        super(x); // Calls parameterized constructor of A
        System.out.println("Parameterized Constructor of Class B: y = " + y);
    }
}

// ✅ Level 3
class C extends B {
    // Default Constructor
    C() {
        super(); // Calls default constructor of B
        System.out.println("Default Constructor of Class C");
    }

    // Parameterized Constructor
    C(int x, int y, int z) {
        super(x, y); // Calls parameterized constructor of B
        System.out.println("Parameterized Constructor of Class C: z = " + z);
    }
}

// ✅ Level 4
class D extends C {
    // Default Constructor
    D() {
        super(); // Calls default constructor of C
        System.out.println("Default Constructor of Class D");
    }

    // Parameterized Constructor
    D(int x, int y, int z, int w) {
        super(x, y, z); // Calls parameterized constructor of C
        System.out.println("Parameterized Constructor of Class D: w = " + w);
    }
}

// ✅ Main Class
public class ConstructorOrderDemo {
    public static void main(String[] args) {

        System.out.println("\n--- Creating object using DEFAULT constructors ---");
        D obj1 = new D();  // Calls default chain

        System.out.println("\n--- Creating object using PARAMETERIZED constructors ---");
        D obj2 = new D(10, 20, 30, 40); // Calls parameterized chain
    }
}
