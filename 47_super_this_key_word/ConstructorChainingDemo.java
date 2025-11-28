// ✅ Parent Class
class Vehicle {

    // Default Constructor
    Vehicle() {
        System.out.println("Vehicle Default Constructor");
    }

    // Parameterized Constructor
    Vehicle(String type) {
        System.out.println("Vehicle Parameterized Constructor: " + type);
    }
}

// ✅ Child Class
class Car extends Vehicle {

    // Default Constructor
    Car() {
        this("Sedan");  // Calls parameterized constructor of SAME class
        System.out.println("Car Default Constructor");
    }

    // Parameterized Constructor
    Car(String model) {
        super("Four Wheeler");  // Calls parent class constructor
        System.out.println("Car Parameterized Constructor: " + model);
    }
}

// ✅ Main Class
public class ConstructorChainingDemo {
    public static void main(String[] args) {
        System.out.println("--- Creating Car Object ---");
        Car c = new Car();   // Triggers constructor chaining
    }
}
/*✅ ✅ Explanation (Step-by-step Flow):
✅ When Car c = new Car(); runs:
1️⃣ Car() is called

But first line in it is:

this("Sedan");


➡ So it goes to the parameterized constructor of the same class.

2️⃣ Now Car(String model) runs

First line here:

super("Four Wheeler");


➡ So it goes to the parent constructor.

3️⃣ Vehicle(String type) runs

✅ Prints: "Vehicle Parameterized Constructor: Four Wheeler"

4️⃣ Returns to Car(String model)

✅ Prints: "Car Parameterized Constructor: Sedan"

5️⃣ Returns to Car()

✅ Prints: "Car Default Constructor"

✅ Summary:
Keyword	Used For	Calls
this()	Same class	Another constructor in same class
super()	Parent class	Constructor of parent class
First Statement Rule	Must be first line in constructor	Yes */