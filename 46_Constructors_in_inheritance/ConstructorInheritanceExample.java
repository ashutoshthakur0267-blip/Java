class Vehicle {

    Vehicle() {
        System.out.println("Default Vehicle Constructor");
    }

    Vehicle(String type) {
        System.out.println("Parameterized Vehicle Constructor: " + type);
    }
}

class Car extends Vehicle {

    Car() {
        super("Four Wheeler");  // Explicit call to parent class constructor
        System.out.println("Car Constructor");
    }
}

public class ConstructorInheritanceExample {
    public static void main(String[] args) {
        Car c = new Car();
    }
}
/*✅ Key Points to Remember:

✔ Parent constructor runs before child constructor
✔ If super() is not written, Java adds it automatically
✔ Use super(arguments) to call a specific parent constructor
✔ Constructors are not inherited, but can be called */