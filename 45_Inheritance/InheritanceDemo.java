/* ✅ What is Inheritance in Java?

Inheritance is a core concept of Object-Oriented Programming (OOP) in Java.

It allows one class to acquire the properties and methods of another class.

The class that is inherited from → Parent Class / Super Class

The class that inherits → Child Class / Sub Class

Keyword used → extends

✅ Benefits of Inheritance:

Reusability of code

Method overriding

Easy maintenance

Polymorphism support*/
// ✅ Parent Class (Super Class)
class Animal {
    String name;

    void eat() {
        System.out.println("This animal eats food.");
    }
}

// ✅ Child Class (Sub Class) inheriting from Animal
class Dog extends Animal {
    
    void bark() {
        System.out.println("The dog barks.");
    }
}

// ✅ Main Class
public class InheritanceDemo {
    public static void main(String[] args) {

        // Creating object of Dog class
        Dog d = new Dog();

        // Accessing parent class property (inherited)
        d.name = "Tommy";
        System.out.println("Dog Name: " + d.name);

        // Accessing parent class method
        d.eat();

        // Accessing child class method
        d.bark();
    }
}
/*✅ Types of Inheritance in Java:
Type	Supported in Java?	Example
Single	✅ Yes	One parent → One child
Multilevel	✅ Yes	Parent → Child → Grandchild
Hierarchical	✅ Yes	One parent → Multiple children
Multiple	❌ Not directly (only via interfaces)	
Hybrid	❌ Not directly (via interfaces)	 */