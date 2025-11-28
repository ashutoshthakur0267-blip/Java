// Abstract class representing a generic Vehicle

//if a class includes abstract method then the class itself must be declared abstract itslef
abstract class Vehicle {

    // Abstract methods (no implementation here)
    abstract void start();      // Every vehicle must define how it starts
    abstract void fuelType();   // Every vehicle must define its fuel type

    // Concrete (normal) method
    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Car class implementing details of Vehicle
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key ignition.");
    }

    @Override
    void fuelType() {
        System.out.println("Car runs on Petrol or Diesel.");
    }
}

// Electric Scooter class implementing details of Vehicle
class ElectricScooter extends Vehicle {

    @Override
    void start() {
        System.out.println("Electric Scooter starts with a button.");
    }

    @Override
    void fuelType() {
        System.out.println("Electric Scooter runs on Battery.");
    }
}

class Main1 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.fuelType();
        myCar.stop();

        System.out.println();

        Vehicle myScooter = new ElectricScooter();
        myScooter.start();
        myScooter.fuelType();
        myScooter.stop();
    }
}
