import java.util.*; // Importing all utility classes (like Scanner) from java.util package

public class Strings {
    public static void main(String[] args) {
        
        // Strings in Java can be created in two ways:
        // 1. Using "new" keyword -> String name = new String("Harry");
        // 2. Direct assignment using double quotes -> String name = "Harry";
        // Both ways create a string, but the second is more common & efficient.
        
        // String name = new String("Harry"); // (Less commonly used way)
        String name = "Harry"; // (Recommended way)
        
        // NOTE: Strings in Java are IMMUTABLE. Once created, their content cannot be changed.
        
        System.out.println(name); // prints "Harry" with a newline
        System.out.print("The name is: "); // prints text but does NOT add newline
        System.out.println(name); // prints "Harry" right after "The name is: "
        
        // Example of formatted output
        int a = 6;
        float b = 5.6454f;
        
        // printf() works like in C/C++: format specifiers control how variables are displayed
        // %d -> integer, %f -> float/double, %4.2f -> float with total 4 width & 2 decimals
        System.out.printf("The value of a is %d and the value of b is %4.2f\n", a, b);
        
        // format() is basically the same as printf(), just another method
        System.out.format("The value of a is %d and the value of b is %f\n", a, b);
        
        // Taking input from user
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your full name: "); // clear instruction for user
        String st = s.nextLine(); // nextLine() takes the full line including spaces
        System.out.println("You entered: " + st);
        
        // Closing Scanner (good practice to free resources)
        s.close();
    }
}
