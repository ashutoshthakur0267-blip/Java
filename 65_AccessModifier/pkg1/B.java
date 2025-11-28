// File: pkg1/B.java
package pkg1;

public class B {
    public static void main(String[] args) {
        A obj = new A(); // ✅ Allowed
        obj.display();   // ✅ Allowed
        System.out.println("Accessing public variable: " + obj.number);
    }
}
/*✅ Java Access Modifiers Visibility Table
Access Modifier	Same Class	Same Package (Different Class)	Subclass in Different Package	Other Class in Different Package
public	✅ Yes	✅ Yes	✅ Yes	✅ Yes
protected	✅ Yes	✅ Yes	✅ Yes (but only via inheritance)	❌ No (without inheritance)
default (no modifier)	✅ Yes	✅ Yes	❌ No	❌ No
private	✅ Yes	❌ No	❌ No	❌ No */
✅ Access Modifier Scheme (The "Four Doors" Memory Trick)

Imagine four security doors in a building representing levels of access:

Modifier	Symbol	Door Rule	Example in Real Life
private	🔒	Only you can enter	Your personal diary
default	🚪	Only people in your building (package) can enter	Society apartment access
protected	🛂	People in your building + your relatives from outside (subclasses)	Family entry into society
public	🌍	Anyone from anywhere can enter	Public park