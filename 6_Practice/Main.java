// Import the Scanner class so we can take input from the user
import java.util.Scanner;

// Define a public class named "Main" (filename must also be Main.java)
public class Main {
    // Main method: execution starts from here
    public static void main(String[] args) {

        // Create a Scanner object 's' to take input from the keyboard
        Scanner s = new Scanner(System.in);

        // =======================
        // Taking marks input
        // =======================

        // Ask user for marks of subject 1
        System.out.print("Enter the marks of subject 1: ");
        int a = s.nextInt();  // Reads an integer from user and stores in variable 'a'

        // Ask user for marks of subject 2
        System.out.print("Enter the marks of subject 2: ");
        int b = s.nextInt();  // Reads an integer and stores in 'b'

        // Ask user for marks of subject 3
        System.out.print("Enter the marks of subject 3: ");
        int c = s.nextInt();  // Stores input in 'c'

        // Ask user for marks of subject 4
        System.out.print("Enter the marks of subject 4: ");
        int d = s.nextInt();  // Stores input in 'd'

        // Ask user for marks of subject 5
        System.out.print("Enter the marks of subject 5: ");
        int e = s.nextInt();  // Stores input in 'e'

        // =======================
        // Calculating total and average
        // =======================

        // Add marks of all 5 subjects
        int sum = a + b + c + d + e;

        // Divide the total by 5 to get average
        // Since both sum and 5 are integers, this will give an integer average
        int avg = sum / 5;

        // =======================
        // Displaying result
        // =======================

        // Print the average marks
        System.out.println("The average of the total marks is: " + avg);
    }
}
