/* Object-Oriented Programming (OOP) in Java

OOP is a programming paradigm that organizes data and behavior into objects. It helps in writing modular, reusable, and maintainable code.

Java is a pure OOP language (except for primitives).

1. Class and Object

Class: Blueprint/template for creating objects.

Object: Instance of a class (represents real-world entity).*/
class Car {
    String color;
    String model;

    void drive() {
        System.out.println(model + " is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();  // creating object
        car1.color = "Red";
        car1.model = "BMW";
        car1.drive();
    }
}
/*Class defines properties (fields) and behaviors (methods).

Object is a real instance in memory. */




/*2. Four Pillars of OOP
2.1 Encapsulation

Wrapping data (variables) and methods together in a class.

Hides data from outside using private fields and provides getter/setter methods.

Example:
  
class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}*/


/* 2.2 Inheritance

Allows a class to inherit properties and methods from another class.

Achieved using extends keyword.

Types:

Single, Multilevel, Hierarchical, Hybrid

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // inherited
        dog.bark();
    }
}
Keyword: super → Access parent class members.
*/


/* 2.3 Polymorphism

Many forms of a single entity.

a) Compile-time (Method Overloading)

Same method name, different paramete
class MathOperation {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}
b) Runtime (Method Overriding)

Child class redefines parent class method.

class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // Dog barks
    }
}

*/



/* 2.4 Abstraction

Hiding implementation details, showing only functionality.

Achieved using:

abstract class

interface
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("Draw Circle"); }
}


//interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() { System.out.println("Dog barks"); }
}
Abstract class can have fields & methods.

Interface can only have abstract methods (Java 8+ allows default/static methods).

Java supports multiple interfaces, but single inheritance for classes.

*/



/* 3. Constructors

Special method to initialize objects.

Same name as class, no return type.

class Car {
    String model;
    Car(String model) {
        this.model = model;
    }
}

Car c = new Car("BMW");


Types:

Default constructor

Parameterized constructor

Copy constructor (manually created)*/


/*4. this and super keywords

this → Refers to current object.

super → Refers to parent class.

Example:

class Animal {
    void eat() { System.out.println("Animal eats"); }
}

class Dog extends Animal {
    void eat() {
        super.eat(); // call parent method
        System.out.println("Dog eats");
    }
} */



/*5. Static vs Non-Static
Feature	Static	Non-Static
Belongs to	Class	Object
Accessed via	Class name	Object reference
Example	static int count;	int age; */



/*abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    private String model;
    
    Car(String model) { this.model = model; }
    
    void start() { System.out.println(model + " started"); }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car("BMW");
        v.start(); // BMW started
    }
}
 */