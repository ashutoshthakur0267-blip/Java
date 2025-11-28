// Program to demonstrate all types of operators in Java
import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {

        System.out.println("===== Java Operators Demo =====\n");

        // ================================
        // 1. Arithmetic Operators (+, -, *, /, %)
        // ================================
        int a = 20, b = 6;  // two numbers to perform arithmetic
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition (a + b) = " + (a + b));
        System.out.println("Subtraction (a - b) = " + (a - b));
        System.out.println("Multiplication (a * b) = " + (a * b));
        System.out.println("Division (a / b) = " + (a / b));   // integer division (result = 3)
        System.out.println("Modulus (a % b) = " + (a % b));   // remainder (result = 2)
        System.out.println();

        // ================================
        // 2. Relational (Comparison) Operators (==, !=, >, <, >=, <=)
        // ================================
        System.out.println("=== Relational Operators ===");
        System.out.println("Is a equal to b? (a == b): " + (a == b));
        System.out.println("Is a not equal to b? (a != b): " + (a != b));
        System.out.println("Is a greater than b? (a > b): " + (a > b));
        System.out.println("Is a less than b? (a < b): " + (a < b));
        System.out.println("Is a greater than or equal to b? (a >= b): " + (a >= b));
        System.out.println("Is a less than or equal to b? (a <= b): " + (a <= b));
        System.out.println();

        // ================================
        // 3. Logical Operators (&&, ||, !)
        // ================================
        boolean x = true, y = false;
        System.out.println("=== Logical Operators ===");
        System.out.println("x = true, y = false");
        System.out.println("Logical AND (x && y) = " + (x && y));  // true only if both true
        System.out.println("Logical OR (x || y) = " + (x || y));   // true if any one is true
        System.out.println("Logical NOT (!x) = " + (!x));           // reverses true/false
        System.out.println();

        // ================================
        // 4. Assignment Operators (=, +=, -=, *=, /=, %=)
        // ================================
        int num = 10;
        System.out.println("=== Assignment Operators ===");
        System.out.println("Initial value: num = " + num);
        num += 5; // num = num + 5
        System.out.println("After num += 5: " + num);
        num -= 3; // num = num - 3
        System.out.println("After num -= 3: " + num);
        num *= 2; // num = num * 2
        System.out.println("After num *= 2: " + num);
        num /= 4; // num = num / 4
        System.out.println("After num /= 4: " + num);
        num %= 3; // num = num % 3
        System.out.println("After num %= 3: " + num);
        System.out.println();

        // ================================
        // 5. Unary Operators (+, -, ++, --, ~, !)
        // ================================
        int u = 5;
        System.out.println("=== Unary Operators ===");
        System.out.println("u = " + u);
        System.out.println("Unary plus (+u): " + (+u));
        System.out.println("Unary minus (-u): " + (-u));
        System.out.println("Pre-increment (++u): " + (++u)); // increase before use
        System.out.println("Post-increment (u++): " + (u++)); // use first, then increase
        System.out.println("Value after post-increment: " + u);
        System.out.println("Pre-decrement (--u): " + (--u)); // decrease before use
        System.out.println("Post-decrement (u--): " + (u--)); // use first, then decrease
        System.out.println("Value after post-decrement: " + u);
        int bit = 5; // in binary: 0101
        System.out.println("Bitwise NOT (~5): " + (~bit));  // flips all bits
        System.out.println("Logical NOT (!true): " + (!true));
        System.out.println();

        // ================================
        // 6. Bitwise Operators (&, |, ^, <<, >>, >>>)
        // ================================
        int p = 5, q = 3; // 5 = 0101, 3 = 0011 in binary
        System.out.println("=== Bitwise Operators ===");
        System.out.println("p = " + p + " (0101), q = " + q + " (0011)");
        System.out.println("Bitwise AND (p & q) = " + (p & q));  // 0101 & 0011 = 0001 → 1
        System.out.println("Bitwise OR (p | q) = " + (p | q));   // 0101 | 0011 = 0111 → 7
        System.out.println("Bitwise XOR (p ^ q) = " + (p ^ q));  // 0101 ^ 0011 = 0110 → 6
        System.out.println("Left Shift (p << 1) = " + (p << 1)); // 0101 << 1 = 1010 → 10
        System.out.println("Right Shift (p >> 1) = " + (p >> 1));// 0101 >> 1 = 0010 → 2
        System.out.println("Unsigned Right Shift (p >>> 1) = " + (p >>> 1));
        System.out.println();

        // ================================
        // 7. Ternary Operator ( ?: )
        // ================================
        int age = 20;
        System.out.println("=== Ternary Operator ===");
        String result = (age >= 18) ? "Eligible to Vote" : "Not Eligible to Vote";
        System.out.println("Age = " + age + " → " + result);
        System.out.println();

        // ================================
        // 8. instanceof Operator
        // ================================
        System.out.println("=== instanceof Operator ===");
        String name = "Ashu";
        boolean check = name instanceof String; // checks if object belongs to class
        System.out.println("\"Ashu\" is instance of String? " + check);
        System.out.println();

        // ================================
        // 9. Type Cast Operator
        // ================================
        System.out.println("=== Type Casting Operator ===");
        double val = 9.78;
        int castVal = (int) val;  // Explicit conversion from double to int
        System.out.println("Double value: " + val);
        System.out.println("After casting to int: " + castVal);
    }
}
