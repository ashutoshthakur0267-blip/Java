/*✅ What is Dynamic Method Dispatch?

Dynamic Method Dispatch (also known as Runtime Polymorphism) happens when:
✔ A parent class reference points to a child class object,
✔ And the method that gets executed is decided at runtime, not compile time.

This allows Java to choose the correct overridden method dynamically. */
// ✅ Parent Class
class Phone {

    // Method to be overridden by child classes
    void showFeatures() {
        System.out.println("Basic Phone Features");
    }
}

// ✅ Child Class 1
class AndroidPhone extends Phone {

    // Overriding parent class method
    @Override
    void showFeatures() {
        System.out.println("Android Phone: Touchscreen, Play Store, Apps");
    }
}

// ✅ Child Class 2
class IPhone extends Phone {

    // Overriding parent class method
    @Override
    void showFeatures() {
        System.out.println("iPhone: iOS, App Store, Face ID");
    }
}

// ✅ Main Class to demonstrate Dynamic Method Dispatch
public class DynamicDispatchDemo {

    public static void main(String[] args) {

        // ✅ Step 1: Create a reference of the parent class
        Phone ref;

        // ✅ Step 2: Assign a child class object to the parent reference
        // Even though reference type is 'Phone', the object is of 'AndroidPhone'
        ref = new AndroidPhone();

        // ✅ Step 3: Call the overridden method
        // Java decides at RUNTIME which method to call (child class method)
        ref.showFeatures(); // Output: Android Phone features

        // ✅ Step 4: Reassign reference to another child class object
        ref = new IPhone();

        // ✅ Step 5: Again call the same method
        // Now the method of IPhone class will execute (runtime decision)
        ref.showFeatures(); // Output: iPhone features
    }
}
