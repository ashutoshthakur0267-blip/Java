// ===================== INTERFACES IN JAVA =======================

// ✅ 1. Base Interface with Abstract + Default + Static methods
interface Vehicle {
    // Abstract method (must be implemented)
    void start();

    // Default method (inherited, can be overridden)
    default void stop() {
        System.out.println("Vehicle stopped (default method from Vehicle)");
    }

    // Static method (belongs to interface, cannot be overridden)
    static void info() {
        System.out.println("Static method in Vehicle interface");
    }
}

// ✅ 2. Another Interface with same default method (for diamond problem demo)
interface Engine {
    void engineType();

    default void stop() {
        System.out.println("Engine stopped (default method from Engine)");
    }
}

// ✅ 3. Interface extending multiple interfaces
interface ElectricVehicle extends Vehicle, Engine {
    void batteryInfo();
}

// ✅ 4. Class implementing multiple interfaces
class TeslaCar implements ElectricVehicle {

    // Implement abstract methods
    public void start() {
        System.out.println("Tesla Car is starting...");
    }

    public void engineType() {
        System.out.println("Electric Engine");
    }

    public void batteryInfo() {
        System.out.println("Battery capacity: 100 kWh");
    }

    // ⚠️ Diamond problem resolution:
    // Vehicle and Engine both have stop()
    // So, class must override stop() to remove ambiguity
    public void stop() {
        System.out.println("Tesla Car stopped (resolved diamond problem)");

        // Optional: call specific interface methods
        Vehicle.super.stop();
        Engine.super.stop();
    }
}

// ✅ 5. Another class implementing only one interface
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
    // stop() is inherited from Vehicle (no need to override)
}

// ===================== MAIN CLASS =======================
public class InterfaceFullDemo {
    public static void main(String[] args) {
        System.out.println("=== TeslaCar Demo ===");
        TeslaCar tesla = new TeslaCar();
        tesla.start();       // abstract method implemented
        tesla.engineType();  // from Engine
        tesla.batteryInfo(); // from ElectricVehicle
        tesla.stop();        // overridden to solve conflict

        // Static method from interface
        Vehicle.info();

        System.out.println("\n=== Bike Demo ===");
        Bike bike = new Bike();
        bike.start();        // implemented abstract method
        bike.stop();         // inherited default method

        // You can also call static method directly from interface
        Vehicle.info();
    }
}
