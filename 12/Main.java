// Import Scanner class for user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ================================
        // Example 1: Arithmetic with precedence
        // ================================

        // Expression: 7/4.0f * 9/2.0f
        // - Numbers with 'f' are floats.
        // - / and * have the same precedence and are evaluated left-to-right.
        // Step 1: 7/4.0f → 1.75 (float division because of .0f)
        // Step 2: 1.75*9 → 15.75
        // Step 3: 15.75/2.0f → 7.875
        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println("Result of 7/4.0f*9/2.0f = " + a);

        // ================================
        // Example 2: Character encryption and decryption
        // ================================

        char grade = 'B'; // A character literal
        System.out.println("\nOriginal Grade = " + grade);

        // Encrypt grade by shifting it forward by 8 in ASCII table
        // char is internally stored as a number (Unicode value).
        // 'B' = 66 → 66+8 = 74 → 'J'
        grade = (char)(grade + 8);
        System.out.println("Encrypted Grade = " + grade);

        // Decrypt grade by reversing the operation (subtract 8)
        grade = (char)(grade - 8);
        System.out.println("Decrypted Grade = " + grade);

        // ================================
        // Example 3: Using Scanner and Relational Operator
        // ================================

        Scanner s = new Scanner(System.in); // Scanner for input
        System.out.print("\nEnter a number: ");
        int b = s.nextInt();

        // Check if the number entered is greater than 8
        // '>' is a relational operator that gives true/false
        System.out.println("Is " + b + " greater than 8? " + (b > 8));

        // ================================
        // Example 5: Operator Precedence Demo
        // ================================

        // Expression: 7*49/7 + 35/7
        // Precedence: * and / have higher priority, evaluated left-to-right.
        // Step 1: 7*49=343
        // Step 2: 343/7=49
        // Step 3: 35/7=5
        // Step 4: 49+5=54
        System.out.println("\nResult of 7*49/7+35/7 = " + (7*49/7 + 35/7));

        // Close scanner (good practice)
        s.close();
    }
}
