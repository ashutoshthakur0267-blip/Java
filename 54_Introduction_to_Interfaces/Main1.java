// Interface acting like a blueprint for all animals
interface Animal {

    // Interface variables are always public, static, and final (constants)
    int LEGS = 4;  // All animals (in this example) have 4 legs

    // Abstract methods (no body) - must be implemented by child classes
    void sound();
    void eat();

    // Default method (introduced in Java 8)
    // Can have body - acts like an optional method for child classes
    default void walk() {
        System.out.println("This animal walks on " + LEGS + " legs.");
    }

    // Static method in interface (introduced in Java 8)
    // Can be called without creating object
    static void info() {
        System.out.println("Animal Interface - All animals share common behaviors.");
    }
}

// Another interface to demonstrate multiple inheritance
interface Pet {
    void play();
}

// Class implementing multiple interfaces (Multiple Inheritance)
class Dog implements Animal, Pet {

    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    @Override
    public void play() {
        System.out.println("Dog loves playing with humans.");
    }

    // Overriding default method is optional, but allowed
    @Override
    public void walk() {
        System.out.println("Dog runs fast on " + LEGS + " legs.");
    }
}

class Main1 {
    public static void main(String[] args) {

        // Calling static method directly from interface
        Animal.info();

        Animal myDog = new Dog();  // Upcasting - Allowed because Dog IS-A Animal

        myDog.sound(); // Calls Dog's implementation
        myDog.eat();
        myDog.walk(); // Calls overridden walk() method

        // Accessing Pet behavior
        Pet petDog = new Dog();
        petDog.play();
    }
}
