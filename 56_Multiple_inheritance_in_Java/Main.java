// Multiple Inheritance in Java - Full Demonstration
// -----------------------------------------------

// ❌ 1. Multiple class inheritance (Not allowed)
/*
class A {
    void show() {
        System.out.println("Class A show()");
    }
}

class B {
    void show() {
        System.out.println("Class B show()");
    }
}

// ❌ Error: Java does not support multiple inheritance of classes
class C extends A, B { // INVALID
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
*/

// ✅ 2. Multiple inheritance using interfaces
interface InterfaceA {
    void displayA(); // abstract method
    default void greet() {
        System.out.println("Hello from InterfaceA");
    }
}

interface InterfaceB {
    void displayB(); // abstract method
    default void greet() {
        System.out.println("Hello from InterfaceB");
    }
}

// ✅ 3. Class implementing multiple interfaces
class DemoClass implements InterfaceA, InterfaceB {

    // Implement abstract methods from both interfaces
    public void displayA() {
        System.out.println("Display method of InterfaceA implemented in DemoClass");
    }

    public void displayB() {
        System.out.println("Display method of InterfaceB implemented in DemoClass");
    }

    // ⚠️ 4. Resolving default method conflict (Diamond Problem)
    // Both interfaces have greet(), so we must override it
    public void greet() {
        System.out.println("Hello from DemoClass (resolved conflict)");
        
        // Optionally, we can call specific interface method using InterfaceName.super.method()
        InterfaceA.super.greet();
        InterfaceB.super.greet();
    }
}

// ✅ 5. Interface extending multiple interfaces
interface CombinedInterface extends InterfaceA, InterfaceB {
    void combinedDisplay();
}

// ✅ 6. Class implementing combined interface
class AdvancedClass implements CombinedInterface {

    public void displayA() {
        System.out.println("displayA() from InterfaceA implemented in AdvancedClass");
    }

    public void displayB() {
        System.out.println("displayB() from InterfaceB implemented in AdvancedClass");
    }

    public void combinedDisplay() {
        System.out.println("combinedDisplay() from CombinedInterface implemented in AdvancedClass");
    }

    // Again, resolve the default method conflict
    public void greet() {
        System.out.println("Hello from AdvancedClass");
    }
}

// ✅ 7. Main class
public class MultipleInheritanceDemo {
    public static void main(String[] args) {

        System.out.println("=== Multiple Inheritance Using Interfaces ===");
        DemoClass demo = new DemoClass();
        demo.displayA();
        demo.displayB();
        demo.greet();

        System.out.println("\n=== Interface Extending Multiple Interfaces ===");
        AdvancedClass adv = new AdvancedClass();
        adv.displayA();
        adv.displayB();
        adv.combinedDisplay();
        adv.greet();
    }
}
