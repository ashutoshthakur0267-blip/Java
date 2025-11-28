// ✅ Parent Class
class Person {
    private String secret = "12345";          // private (not inherited)
    protected String name = "John";           // protected
    public void display() {                   // public
        System.out.println("Person Class Method");
    }
}

// ✅ Child Class 1
class Student extends Person {
    public void studentInfo() {
        // secret cannot be accessed -> private
        System.out.println("Name: " + name); // protected
        display();                            // public
    }
}

// ✅ Child Class 2
class Teacher extends Person {
    void teacherInfo() {                      // default
        System.out.println("Teacher Name: " + name); // protected
        display();                                  // public
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.studentInfo();

        Teacher t = new Teacher();
        t.teacherInfo();
    }
}
