// ✅ Parent Class
class Person {
    String name;

    // Parameterized constructor
    Person(String name) {
        System.out.println("Person constructor called");
        this.name = name;
    }
}

// ✅ Child Class
class Student extends Person {
    int rollNo;

    // Parameterized constructor in subclass
    Student(String name, int rollNo) {
        super(name);  // Calls parent constructor
        System.out.println("Student constructor called");
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

// ✅ Main Class
public class ConstructorWithSuperDemo {
    public static void main(String[] args) {
        Student s = new Student("Ramesh", 101);
        s.display();
    }
}
