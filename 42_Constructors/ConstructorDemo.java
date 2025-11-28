// ✅ Demonstration of Constructors in Java

// Class declaration
class Student {

    // Instance variables (also called "data members" or "fields")
    String name;   // To store the student's name
    int age;       // To store the student's age

    // 1️⃣ Default Constructor (No parameters)
    // ✅ This constructor is automatically called when you create an object
    //    without passing any arguments.
    Student() {
        System.out.println("Default Constructor Called"); // Message to show constructor execution
        name = "Unknown";  // Setting default name
        age = 0;           // Setting default age
    }

    // 2️⃣ Parameterized Constructor (With parameters)
    // ✅ This constructor allows assigning values at the time of object creation.
    Student(String name, int age) {
        System.out.println("Parameterized Constructor Called"); // Display message
        this.name = name;  // 'this' keyword refers to the current object's variable
        this.age = age;    // Assigning passed age to object variable
    }

    // 3️⃣ Copy Constructor (Takes another object as argument)
    // ✅ This constructor copies the data from an existing object to a new one.
    Student(Student obj) {
        System.out.println("Copy Constructor Called"); // Display message
        this.name = obj.name; // Copying name
        this.age = obj.age;   // Copying age
    }

    // Method to display the values of name and age
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// ✅ Main class from where the program starts execution
public class ConstructorDemo {

    // Main method - Entry point of the Java program
    public static void main(String[] args) {
        
        // ✅ Object created using Default Constructor (no parameters)
        System.out.println("\n--- Using Default Constructor ---");
        Student s1 = new Student();  // Calls default constructor
        s1.display();                // Display data of s1

        // ✅ Object created using Parameterized Constructor
        System.out.println("\n--- Using Parameterized Constructor ---");
        Student s2 = new Student("Rahul", 21);  // Calls parameterized constructor
        s2.display();                           // Display data of s2

        // ✅ Object created using Copy Constructor
        System.out.println("\n--- Using Copy Constructor ---");
        Student s3 = new Student(s2);  // Calls copy constructor with s2 as argument
        s3.display();                  // Display data of s3 (same as s2)
    }
}
