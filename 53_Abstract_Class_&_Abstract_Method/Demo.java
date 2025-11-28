// Abstract class
abstract class Animal {

    // Static variable (belongs to the class, not objects)
    static int animalCount = 0;

    // Constructor of abstract class
    Animal() {
        System.out.println("Animal constructor called");
        animalCount++;  // Increases when an animal object is created
    }

    // Abstract method (must be implemented by child)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping...");
    }

    // Final method (cannot be overridden)
    final void info() {
        System.out.println("This is a final method from Animal class.");
    }

    // Static method
    static void displayCount() {
        System.out.println("Total animals created: " + animalCount);
    }
}

// Child class
class Dog extends Animal {

    // Child class constructor
    Dog() {
        System.out.println("Dog constructor called");
    }

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Main class
public class  Demo{
    public static void main(String[] args) {

        // Upcasting (parent reference, child object)
        Animal a = new Dog();

        a.sound();       // Calls Dog's version
        a.sleep();       // Calls Animal's concrete method
        a.info();        // Calls final method (cannot be overridden)

        // Calling static method
        Animal.displayCount();
    }
}
