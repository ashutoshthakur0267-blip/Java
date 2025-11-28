class Car {
    String model;
    int year;

    // Constructor
    Car(String m, int y) {
        model = m;
        year = y;
    }

    void display() {
        System.out.println(year + " " + model);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 2022);
        Car c2 = new Car("Audi", 2021);

        c1.display();
        c2.display();
    }
}
