// File location: package2/ClassB.java
package package2;

// Import ClassA from package1
import package1.ClassA;

public class ClassB extends ClassA {  // Inheriting ClassA

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        ClassB childObj = new ClassB();

        // ✅ Public method - accessible anywhere
        obj.publicMethod();

        // ✅ Protected method - accessible through inheritance
        childObj.protectedMethod();

        // ❌ Default method - NOT accessible (outside package)
        // obj.defaultMethod();  // ❌ Compilation Error

        // ❌ Private method - NOT accessible outside ClassA
        // obj.privateMethod();  // ❌ Compilation Error

        // ✅ But we can access private through a public method of same class
        obj.accessPrivate();
    }
}
