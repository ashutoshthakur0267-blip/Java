// Defining an interface

/*✅ What is an Interface in Java?

An interface in Java is like a contract or blueprint that defines what a class must do, but not how it will do it.

It only contains method declarations (without body) — and any class that implements the interface must provide implementation for those methods.

💡 Real-Life Analogy

Think of an interface like a Remote Control — it has buttons like:

powerOn()

volumeUp()

changeChannel()

But how these buttons actually work inside a TV or a Set-Top Box is different.
Same buttons → Different implementations. */
interface Animal {
    void sound();   // abstract method
    void eat();     // abstract method
}

// Class implementing interface
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
        myDog.eat();
    }
}
