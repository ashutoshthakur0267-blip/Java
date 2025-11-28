// ✅ Base Class
class Vehicle {
    protected String brand = "Honda";      // protected
    void engine() {                        // default (package-private)
        System.out.println("Engine is working");
    }
}

// ✅ Intermediate Class
class Car extends Vehicle {
    public int wheels = 4;                 // public
}

// ✅ Child Class
class Sedan extends Car {
    public void showDetails() {
        System.out.println("Brand: " + brand); // protected access
        System.out.println("Wheels: " + wheels); // public access
        engine();                                // default access (same package)
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Sedan obj = new Sedan();
        obj.showDetails();
    }
}
