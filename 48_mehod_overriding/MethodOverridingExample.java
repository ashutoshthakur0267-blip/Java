/*✅ ✅ What is Method Overriding?

Method Overriding occurs when:

✔ A child class defines a method
✔ With the same name, return type, and parameters
✔ As defined in the parent class

It is used to provide a specific implementation of a method that is already defined in the superclass.

✅ Achieves Runtime Polymorphism (Dynamic Dispatch) */
/*✅ Key Rules of Method Overriding:

✔ Method name must be the same
✔ Parameter list must be the same
✔ Return type must be the same (or covariant)
✔ Access modifier cannot be more restrictive
✔ Use @Override annotation (optional but recommended)

✅ When is Method Overriding Used?

✔ Runtime polymorphism
✔ Customized behavior in child classes
✔ Replacing parent method logic in subclass
✔ Example: toString(), equals(), run() in Threads */
// ✅ Parent Class
class Employee {

    // Parent class method
    void work() {
        System.out.println("Employee is working...");
    }

    // Another method (not overridden)
    void takeBreak() {
        System.out.println("Employee is taking a break.");
    }
}

// ✅ Child Class 1
class Developer extends Employee {

    // Overriding work() method
    @Override
    void work() {
        System.out.println("Developer is writing code.");
    }
}

// ✅ Child Class 2
class Manager extends Employee {

    // Overriding work() method
    @Override
    void work() {
        System.out.println("Manager is planning and managing projects.");
    }
}

// ✅ Main Class
public class MethodOverridingExample {
    public static void main(String[] args) {

        // ✅ Parent class reference
        Employee emp;

        // Reference to Developer object
        emp = new Developer();
        emp.work();       // Calls Developer's overridden method
        emp.takeBreak();  // Calls method from parent (not overridden)

        System.out.println("----------------------------");

        // Reference to Manager object
        emp = new Manager();
        emp.work();       // Calls Manager's overridden method
        emp.takeBreak();  // Inherited from parent

        Manager m=new Manager();
        m.work();
        m.takeBreak();
    }
}
/*Even though reference type is Employee, the object decides which method runs: */
/*Employee emp = new Developer();  ✅ Calls Developer's method
Employee emp = new Manager();    ✅ Calls Manager's method
 *//*✔️ 3. Shows Non-overridden Method

Method takeBreak() is not overridden, so parent version runs always.

✔️ 4. Uses @Override Annotation

It helps ensure correct overriding. */
/*✅ When Should You Use Method Overriding?

✔ To give different behavior to the same method in child classes
✔ To achieve runtime polymorphism
✔ To follow OOP principles like abstraction and inheritance */