// We need to import the Scanner class from java.util package
// because it is not built-in by default.
// Scanner helps us to take input from the user via the keyboard.
import java.util.Scanner;

// Class definition named "UserInput" (same as filename: UserInput.java)
public class UserInput {

    // Main method: entry point of the program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard (System.in).
        // 'sc' is the variable name of our Scanner object.
        Scanner sc = new Scanner(System.in);

        // Print a message to the user
        System.out.println("Taking Input From the User");

        // Ask the user to enter the first number
        System.out.print("Enter number 1: ");

        // Example of taking integer input (commented out for now):
        // int a = sc.nextInt();

        // Here we are reading a float value instead of int
        // sc.nextFloat() reads the next floating-point number typed by the user.
        float c = sc.nextFloat();

        // Ask the user to enter the second number
        System.out.print("Enter number 2: ");

        // Example of integer input (commented out again):
        // int b = sc.nextInt();

        // Read another float number from the user
        float d = sc.nextFloat();

        // Calculate the sum of the two numbers entered by the user
        float sum = c + d;

        // Print the result to the user
        System.out.print("The sum of these number is: ");
        System.out.println(sum);

        // ===========================
        // Checking if the next input is an integer
        // ===========================

        // sc.hasNextInt() checks whether the user entered an integer or not.
        // It returns true if the next input is an int, otherwise false.
        boolean b1 = sc.hasNextInt();

        // Print true/false based on whether the input was an integer
        System.out.println(b1);

        // ===========================
        // Reading Strings
        // ===========================

        // If we use sc.next(), it reads only ONE WORD (stops at space).
        // Example: If user enters "Hello World", next() will return only "Hello".
        // String str = sc.next();

        // sc.nextLine() reads the entire line (including spaces until Enter is pressed).
        // Example: If user enters "Hello World", nextLine() will return "Hello World".
        String str = sc.nextLine();

        // Print the string entered by the user
        System.out.println(str);
    }
}
