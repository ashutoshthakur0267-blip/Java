// Custom Employee class
class Employee {
    // Fields (attributes of Employee)
    int salary;    // stores employee salary
    String name;   // stores employee name

    // Getter method for salary
    public int getSalary() {
        return salary;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String n) {
        name = n;
    }
}

// Custom CellPhone class
class CellPhone {
    // Behavior 1: Ring
    public void ring() {
        System.out.println("📞 Phone is ringing...");
    }

    // Behavior 2: Vibrate
    public void vibrate() {
        System.out.println("📳 Phone is vibrating...");
    }

    // Behavior 3: Call a friend
    public void callFriend() {
        System.out.println("📲 Calling a friend...");
    }
}

// Main class to test Employee and CellPhone
public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee harry = new Employee();
        
        // Setting employee name
        harry.setName("CodeWithHarry");
        
        // Displaying employee details
        System.out.println("=== Employee Details ===");
        System.out.println("👤 Name   : " + harry.getName());

        // Setting salary directly (public field, could also use setter if defined)
        harry.salary = 555;
        System.out.println("💰 Salary : " + harry.getSalary());

        System.out.println();

        // Creating a CellPhone object
        CellPhone asus = new CellPhone();
        
        // Demonstrating phone behaviors
        System.out.println("=== CellPhone Actions ===");
        asus.callFriend();
        asus.vibrate();
        asus.ring();
    }
}
