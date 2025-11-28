// Defining a custom class
class Student {
    // Fields (attributes)
    String name;
    int age;
    String course;

    // Method (behavior)
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Student class
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.course = "Computer Science";

        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 22;
        s2.course = "Mechanical Engineering";

        // Calling method
        s1.displayInfo();
        System.out.println("------");
        s2.displayInfo();
    }
}
