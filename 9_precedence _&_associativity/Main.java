// Program to demonstrate Operator Precedence and Associativity in Java
// Precedence = Which operator has higher priority (executes first)
// Associativity = If operators have the same precedence, which direction they are executed (Left → Right OR Right → Left)

public class Main{
    public static void main(String[] args) {

        int a = 10, b = 5, c = 2;

        System.out.println("=== Operator Precedence and Associativity Demo ===\n");

        // ==============================================================
        // Example 1: Multiplication has higher precedence than Addition
        // ==============================================================

        int result1 = a + b * c;
        // Multiplication (*) has higher precedence than addition (+).
        // So b*c is done first → 5*2=10 → a+10=20
        System.out.println("a + b * c = " + result1 + "   (Multiplication happens before Addition)");

        // ==============================================================
        // Example 2: Parentheses () change the precedence
        // ==============================================================

        int result2 = (a + b) * c;
        // Parentheses () have the HIGHEST precedence.
        // (a+b)=15 → 15*2=30
        System.out.println("(a + b) * c = " + result2 + "   (Parentheses evaluated first)");

        // ==============================================================
        // Example 3: Subtraction (same precedence, left-to-right associativity)
        // ==============================================================

        int result3 = a - b - c;
        // - and + are evaluated left to right (same precedence).
        // (a-b)-c = (10-5)-2 = 5-2=3
        System.out.println("a - b - c = " + result3 + "   (Subtraction is left-to-right)");

        // ==============================================================
        // Example 4: Division and Multiplication (same precedence, left-to-right)
        // ==============================================================

        int result4 = a / b * c;
        // * and / have same precedence → evaluated left-to-right
        // (a/b)=10/5=2 → 2*2=4
        System.out.println("a / b * c = " + result4 + "   (Division and Multiplication are left-to-right)");

        // ==============================================================
        // Example 5: Assignment (=) is RIGHT-TO-LEFT associativity
        // ==============================================================

        int x, y, z;
        x = y = z = 5;
        // Assignment happens right-to-left
        // z=5 → y=z=5 → x=y=5
        System.out.println("x = " + x + ", y = " + y + ", z = " + z + "   (Assignment is right-to-left)");

        // ==============================================================
        // Example 6: Ternary Operator (?:) is also right-to-left
        // ==============================================================

        int age = 17;
        String eligibility = (age >= 18) ? "Can Vote" : "Cannot Vote";
        // Ternary (?:) evaluates right-to-left
        // First check condition (age>=18), if true pick "Can Vote", else "Cannot Vote"
        System.out.println("Age " + age + " → " + eligibility + "   (Ternary operator is right-to-left)");

        // ==============================================================
        // Example 7: Relational vs Logical
        // ==============================================================

        boolean check = a > b && b > c;
        // > (Relational) has higher precedence than && (Logical AND).
        // a>b → 10>5 → true
        // b>c → 5>2 → true
        // true && true → true
        System.out.println("a > b && b > c = " + check + "   (Relational before Logical)");

        // ==============================================================
        // Example 8: Equality vs Assignment
        // ==============================================================

        boolean eqCheck = (a == 10);
        // == (Equality check) has higher precedence than = (Assignment)
        // First check (a==10) → true
        // Then assign result to eqCheck
        System.out.println("a == 10 → " + eqCheck);

        System.out.println("\n=== End of Demo ===");
    }
}
