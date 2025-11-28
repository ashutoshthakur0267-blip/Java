// Demonstration of Constructor Overloading in Java

class Student {
    String name;
    int age;
    String course;

    // 1️⃣ Default Constructor (No parameters)
    Student() {
        System.out.println("Default Constructor Called");
        name = "Not Assigned";
        age = 0;
        course = "Not Assigned";
    }

    // 2️⃣ Constructor with one parameter
    Student(String name) {
        System.out.println("Constructor with 1 Parameter Called");
        this.name = name;
        this.age = 0;
        this.course = "Not Assigned";
    }

    // 3️⃣ Constructor with two parameters
    Student(String name, int age) {
        System.out.println("Constructor with 2 Parameters Called");
        this.name = name;
        this.age = age;
        this.course = "Not Assigned";
    }

    // 4️⃣ Constructor with three parameters
    Student(String name, int age, String course) {
        System.out.println("Constructor with 3 Parameters Called");
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to print object details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

// Main class
public class ConstructorOverloadingDemo {
    public static void main(String[] args) {

        System.out.println("\n--- Using Default Constructor ---");
        Student s1 = new Student();
        s1.display();

        System.out.println("\n--- Using Constructor with 1 Parameter ---");
        Student s2 = new Student("Aman");
        s2.display();

        System.out.println("\n--- Using Constructor with 2 Parameters ---");
        Student s3 = new Student("Riya", 20);
        s3.display();

        System.out.println("\n--- Using Constructor with 3 Parameters ---");
        Student s4 = new Student("Karan", 22, "B.Tech");
        s4.display();
    }
}
