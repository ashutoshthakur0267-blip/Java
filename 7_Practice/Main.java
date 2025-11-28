// Import Scanner class to take user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ============================
        // 1. Integer Sum Calculation
        // ============================

        int a = 15;   // first integer
        int b = 56;   // second integer
        int c = 74;   // third integer

        // Calculate sum of the three integers
        int sum = a + b + c;

        // Print the result with a clear message
        System.out.println("=== Integer Sum Calculation ===");
        System.out.println("Numbers: " + a + ", " + b + ", " + c);
        System.out.println("Sum = " + sum);
        System.out.println(); // blank line for better console spacing

        // ============================
        // 2. CGPA Calculation Example
        // ============================

        // Here, e, d, f represent marks (out of 100)
        float e = 45;
        float d = 90;
        float f = 87;

        // Formula used: (total marks) / 30 (example scaling for CGPA)
        float cgpa = (e + d + f) / 30;

        // Print the result
        System.out.println("=== CGPA Calculation ===");
        System.out.println("Marks: " + e + ", " + d + ", " + f);
        System.out.println("Calculated CGPA = " + cgpa);
        System.out.println();

        // ============================
        // 3. User Greeting
        // ============================

        // Create Scanner object to take input from user
        Scanner s = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Enter your name: ");
        String str = s.nextLine();  // Read the whole line

        // Print personalized greeting
        System.out.println("=== Greeting ===");
        System.out.println("Hello " + str + "! Have a good day 😊");

        // Close the Scanner (good practice to release resources)
        s.close();
    }
}
