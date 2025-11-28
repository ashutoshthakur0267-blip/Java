// In Java, everything must be inside a class.
// Here we create a public class named "Main3".
// The filename must also be Main3.java (same as the class name).
public class Main3 {

    // This is the main method: the starting point of any Java program.
    // When you run the program, Java looks for this method first.
    // public  → means it can be accessed from anywhere.
    // static  → means it belongs to the class (we don’t need to create an object to call it).
    // void    → means this method does not return any value.
    // String[] args → this is used to take command-line arguments (like inputs from outside).
    public static void main(String[] args) {

        // ======================
        // Integer types (whole numbers without decimal)
        // ======================

        // '34' here is a literal (a fixed value written directly in code).
        // Java automatically understands it as a number.
        // We are storing it in a 'byte' variable (range: -128 to 127, size: 1 byte).
        byte age = 34;           

        // '56' is another integer literal.
        // Default type for integer numbers in Java is 'int' (32-bit).
        int age2 = 56;           

        // '87' is also an integer literal, stored in 'short' type (16-bit, range: -32,768 to 32,767).
        short age3 = 87;         

        // This is a very large number.
        // By default, numbers without decimal are treated as int (32-bit),
        // but this number is too large for int.
        // So we must add 'L' at the end to tell Java:
        // "Hey, this is a long literal" (64-bit).
        long ageDino = 5666666666666666L;  

        // ======================
        // Character type
        // ======================

        // 'A' is a character literal (always written in single quotes).
        // char stores a single character (like a letter, digit, or symbol).
        char ch = 'A';           

        // ======================
        // Floating-point numbers (numbers with decimal)
        // ======================

        // By default, decimal numbers are treated as 'double' (64-bit).
        // To store a decimal number in a 'float' (32-bit),
        // we must add 'f' at the end of the number.
        float f1 = 5.6f;         

        // 'd' at the end means this is a double literal (64-bit decimal number).
        // Actually, 'd' is optional because decimals are double by default.
        double d1 = 4.66d;       

        // ======================
        // Boolean type (true/false)
        // ======================

        // 'true' is a boolean literal.
        // Boolean can only have two values: true or false.
        boolean a = true;        

        // ======================
        // String type (text)
        // ======================

        // "ashu" is a string literal (always written inside double quotes).
        // String is not a primitive type like int/float,
        // it is actually a class in Java.
        String str = "ashu";     

        // ======================
        // Printing values
        // ======================

        // System.out.println() is used to print something on the screen (console).
        // 'System' is a built-in class, 'out' is a static object, and 'println' is a method.
        // println prints the value and then moves to a new line.
        System.out.println(age);   // This will print the value of 'age' → 34

        // Printing the string variable 'str'.
        // This will output → ashu
        System.out.println(str);   
    }
}
