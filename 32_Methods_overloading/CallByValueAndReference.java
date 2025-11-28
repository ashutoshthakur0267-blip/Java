public class CallByValueAndReference {

    // ---------------- KEY POINTS ----------------
    // 1. Java is strictly "Call by Value".
    // 2. For primitive data types → method gets a copy of the actual value.
    //    - Changes inside method do NOT affect the original value.
    // 3. For objects → the reference (memory address) is copied.
    //    - Both original and copied reference point to the same object.
    //    - Changes inside method WILL affect the original object.
    // ------------------------------------------------------------

    // ---------------- Call by Value Example ----------------
    static void changePrimitive(int x) {
        x = x + 10; // modifying local copy
        System.out.println("Inside method (primitive): " + x);
    }

    // ---------------- Call by Reference Example ----------------
    static void changeObject(int[] arr) {
        arr[0] = arr[0] + 50; // modifying object through reference
        System.out.println("Inside method (object): arr[0] = " + arr[0]);
    }

    public static void main(String[] args) {

        // -------- Call by Value (Primitive) --------
        int num = 20;
        System.out.println("Before method call (primitive): " + num);
        changePrimitive(num); // passing primitive
        System.out.println("After method call (primitive): " + num); 
        // Original value remains unchanged

        System.out.println("--------------------------------");

        // -------- Call by Reference (Object) --------
        int[] marks = {100, 200, 300}; // array is an object in Java
        System.out.println("Before method call (object): arr[0] = " + marks[0]);
        changeObject(marks); // passing reference of array
        System.out.println("After method call (object): arr[0] = " + marks[0]); 
        // Original object changes
    }
}
