public class ArrayExample {
    public static void main(String[] args) {

        // ---------- 1. Creating an array using 'new' keyword ----------
        int[] marks = new int[5]; // size = 5, default values = 0

        // Assigning values at each index
        marks[0] = 500;
        marks[1] = 100;
        marks[2] = 200;
        marks[3] = 300;
        marks[4] = 400;

        System.out.println("=== Array marks (using new keyword) ===");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }


        // ---------- 2. Declaring array first, then creating it ----------
        int[] marks1;           // Declaration
        marks1 = new int[3];    // Initialization
        marks1[0] = 10;
        marks1[1] = 20;
        marks1[2] = 30;

        System.out.println("\n=== Array marks1 (declared first, then initialized) ===");
        for (int i = 0; i < marks1.length; i++) {
            System.out.println("marks1[" + i + "] = " + marks1[i]);
        }


        // ---------- 3. Creating and initializing array directly ----------
        int[] marks2 = {100, 200, 80, 71, 98};

        System.out.println("\n=== Array marks2 (direct initialization) ===");
        for (int i = 0; i < marks2.length; i++) {
            System.out.println("marks2[" + i + "] = " + marks2[i]);
        }


        // ---------- 4. Using for-each loop to print array ----------
        System.out.println("\n=== Using For-Each Loop on marks2 ===");
        for (int value : marks2) {
            System.out.println("Value: " + value);
        }

        System.out.println(marks.length);
    }
}
