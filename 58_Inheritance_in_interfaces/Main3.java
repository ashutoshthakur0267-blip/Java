// ================== INTERFACE INHERITANCE DEMO ===================

// Base interface
interface A {
    void showA();
    default void info() {
        System.out.println("Info from Interface A");
    }
}

// Extending interface
interface B extends A {
    void showB();
    default void info() {
        System.out.println("Info from Interface B");
    }
}

// Multiple inheritance in interfaces
interface C extends A, B {
    void showC();
}

// Class implementing sub-interface
class DemoClass implements C {
    public void showA() {
        System.out.println("showA() from A implemented");
    }
    public void showB() {
        System.out.println("showB() from B implemented");
    }
    public void showC() {
        System.out.println("showC() from C implemented");
    }

    // Resolving conflict of default method info()
    public void info() {
        System.out.println("Info resolved in DemoClass");
        A.super.info();  // optionally call parent version
        B.super.info();
    }
}

public class InterfaceInheritanceFull {
    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        obj.showA();
        obj.showB();
        obj.showC();
        obj.info();
    }
}
 