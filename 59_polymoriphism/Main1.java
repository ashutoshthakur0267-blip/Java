/* ✅ What is Method Overriding in Java?

Method Overriding occurs when a child (subclass) provides its own implementation of a method that is already defined in the parent (superclass).

🔹 Rules for Method Overriding:

Rule	Description
Same Method Signature	Method name, parameters must be identical
Inherited from Parent	Must exist in superclass
Access Modifier	Cannot be more restrictive than parent
Happens at Runtime	Hence, known as Runtime Polymorphism*/


// Parent class
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    // Overriding the sound() method of Animal
    @Override // Annotation used to ensure correct overriding
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Parent class reference, Parent object
        Animal a1 = new Animal();
        a1.sound(); // Calls Animal's sound()

        // Parent class reference, Child objects (Runtime Polymorphism)
        Animal a2 = new Dog(); 
        a2.sound(); // Calls Dog's sound()

        Animal a3 = new Cat();
        a3.sound(); // Calls Cat's sound()
    }
}

