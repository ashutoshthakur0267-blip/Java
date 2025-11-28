// ✅ Parent Class (Base Class)
class Animal {
    
    // Constructor of Parent Class
    Animal() {
        System.out.println("Animal class constructor called");
    }
}

// ✅ Child Class (Derived Class)
class Dog extends Animal {
    
    // Constructor of Child Class
    Dog() {
        // super() is automatically called even if not written explicitly
        System.out.println("Dog class constructor called");
    }
}

// ✅ Main Class
public class InheritanceConstructorDemo {
    public static void main(String[] args) {
        
        // Creating object of Dog class
        // This will trigger both constructors
        Dog myDog = new Dog();
    }
}
