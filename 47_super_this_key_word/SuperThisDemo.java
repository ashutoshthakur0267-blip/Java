// ✅ Parent Class (Super Class)
class Animal {
    String name = "Parent Animal";  // Parent class variable

    // Parent class constructor
    Animal() {
        System.out.println("Parent Class Constructor Called");
    }

    // Parent class method
    void display() {
        System.out.println("This is Animal class method");
    }
}

// ✅ Child Class (Sub Class)
class Dog extends Animal {

    String name = "Child Dog";   // Child class variable

    // Default Constructor
    Dog() {
        super();  // Calls parent class constructor
        System.out.println("Child Class Constructor Called");
    }

    // Method to show use of 'super' and 'this'
    void showNames() {
        System.out.println("Child Variable (this.name): " + this.name);  // Refers to current class variable
        System.out.println("Parent Variable (super.name): " + super.name); // Refers to parent class variable
    }

    // Overriding parent method
    @Override
    void display() {
        System.out.println("This is Dog class method");

        // Call parent method using super
        super.display();
    }
}

// ✅ Main Class
public class SuperThisDemo {
    public static void main(String[] args) {
        Dog d = new Dog();  // Calls constructors

        System.out.println("\n--- Accessing Variables ---");
        d.showNames();

        System.out.println("\n--- Accessing Methods ---");
        d.display();
    }
}
/*🔹 1. this keyword:

Refers to the current class object

Used to access:
✅ Current class variables
✅ Current class methods
✅ Current class constructors */
/*🔹 2. super keyword:

Refers to the parent class object

Used to access:
✅ Parent class variables
✅ Parent class methods
✅ Parent class constructors */

/*If you want:
✅ Constructor chaining using this()
✅ super() with parameterized constructors */