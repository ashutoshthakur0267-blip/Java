interface Parent {
    default void greet() {
        System.out.println("Hello from Parent interface");
    }
}

interface Child extends Parent {
    default void greet() {
        System.out.println("Hello from Child interface");
    }
}

class MyClass implements Child { }

public class DefaultInheritanceDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.greet();  // Which one runs?
    }
}
