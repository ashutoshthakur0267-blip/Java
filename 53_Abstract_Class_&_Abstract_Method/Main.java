// This is an abstract class
abstract class Animal {

    // Abstract method (no implementation here)
    abstract void sound();  // Child classes must provide a body for this method

    // Normal concrete method (already implemented)
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child class extending abstract class
class Dog extends Animal {

    // Providing implementation of abstract method
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Main {
    public static void main(String[] args) {
        // Animal obj = new Animal(); ❌ Not allowed (cannot create object of abstract class)

        Animal myDog = new Dog(); // ✅ Allowed (upcasting)
        myDog.sound();            // Calls Dog's implementation
        myDog.sleep();            // Calls concrete method from Animal class
    }
}
/*✅ What is an Abstract Class?

An abstract class in Java is a class that cannot be instantiated (you can’t create objects of it directly).
It is meant to be inherited by other classes.
It can contain abstract methods (methods without implementation) as well as regular methods.

✅ What is an Abstract Method?

An abstract method is a method without a body (just declaration, no implementation).
It must be implemented by the child class (unless the child is also abstract). */