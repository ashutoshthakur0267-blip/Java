// This is the declaration of a class named 'Main'.
// In Java, every program must have at least one class.
public class Main {

    // This is the main method.
    // It's the entry point of any Java program.
    // 'public' means it can be accessed from anywhere.
    // 'static' means it belongs to the class rather than an object.
    // 'void' means this method does not return any value.
    // 'String[] args' is used to accept command-line arguments.
    public static void main(String[] args) {
        
        // This line is commented out, so it will not execute.
        // It would print the result of 123 + 55 to the console.
        // System.out.println(123 + 55);
        
        // Declaring three integer variables and assigning values to them
        int num1 = 6; // num1 stores the value 6
        int num2 = 5; // num2 stores the value 5
        int num3 = 7; // num3 stores the value 7

        // Declaring another integer variable 'sum' to store the total
        // Here we add num1, num2, and num3 and store the result in 'sum'
        int sum = num1 + num2 + num3;

        // Print text to the console WITHOUT moving to a new line
        System.out.print("The sum of these numbers is:");

        // Print the value of 'sum' to the console
        // 'println' prints the value and moves the cursor to a new line
        System.out.println(sum);
    }
}
