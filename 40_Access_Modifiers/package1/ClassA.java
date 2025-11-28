// File location: package1/ClassA.java
package package1;

public class ClassA {

    // ✅ public → accessible everywhere
    public void publicMethod() {
        System.out.println("✅ Public Method: Accessible Everywhere");
    }

    // ✅ protected → same package + subclasses
    protected void protectedMethod() {
        System.out.println("✅ Protected Method: Same package or subclass in another package");
    }

    // ✅ default → only within same package
    void defaultMethod() {
        System.out.println("✅ Default Method: Accessible only within the same package");
    }

    // ✅ private → only inside this class
    private void privateMethod() {
        System.out.println("✅ Private Method: Only within this class");
    }

    // Method to call private method from same class
    public void accessPrivate() {
        privateMethod();  // ✅ Allowed here
    }
}
