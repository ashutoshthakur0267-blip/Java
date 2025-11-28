// ✅ Parent Class
class Animal {

    // ✅ Overridden method (will be replaced in child classes)
    void sound() {
        System.out.println("Animal makes some sound");
    }

    // ✅ Non-overridden method (child will inherit as it is)
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// ✅ Child Class 1
class Dog extends Animal {

    @Override
    void sound() { // Overridden method
        System.out.println("Dog barks");
    }

    // ✅ Method only available in Dog class
    void guard() {
        System.out.println("Dog is guarding the house");
    }
}

// ✅ Child Class 2
class Cat extends Animal {

    @Override
    void sound() { // Overridden method
        System.out.println("Cat meows");
    }

    // ✅ Method only available in Cat class
    void scratch() {
        System.out.println("Cat is scratching");
    }
}

// ✅ Child Class 3
class Cow extends Animal {

    @Override
    void sound() { // Overridden method
        System.out.println("Cow moos");
    }

    // ✅ Non-overridden method
    void eatGrass() {
        System.out.println("Cow is eating grass");
    }
}

// ✅ Main Class demonstrating ALL object creation & calling types
public class AdvancedDynamicDispatch {
    public static void main(String[] args) {

        System.out.println("✅ 1. Parent reference, parent object:");
        Animal a1 = new Animal(); // No polymorphism
        a1.sound();  // Parent version
        a1.sleep();  // Parent non-overridden

        System.out.println("\n✅ 2. Parent reference, Dog object:");
        Animal a2 = new Dog(); // Dynamic dispatch
        a2.sound();  // Calls Dog class method (OVERRIDDEN)
        a2.sleep();  // Calls Animal method (NOT overridden)

        System.out.println("\n✅ 3. Parent reference, Cat object:");
        Animal a3 = new Cat();
        a3.sound();  // Cat version
        a3.sleep();  // From Animal

        System.out.println("\n✅ 4. Parent reference, Cow object:");
        Animal a4 = new Cow();
        a4.sound();  // Cow version
        a4.sleep();  // From Animal

        System.out.println("\n✅ 5. Direct child reference (Dog):");
        Dog d = new Dog();
        d.sound();   // Own overridden method
        d.sleep();   // Inherited
        d.guard();   // Specific to Dog

        System.out.println("\n✅ 6. Direct child reference (Cat):");
        Cat c = new Cat();
        c.sound();   // Own overridden method
        c.sleep();   // Inherited
        c.scratch(); // Specific to Cat

        System.out.println("\n✅ 7. Direct child reference (Cow):");
        Cow cow = new Cow();
        cow.sound();     // Own overridden method
        cow.sleep();     // Inherited
        cow.eatGrass();  // Specific to Cow
    }
}
