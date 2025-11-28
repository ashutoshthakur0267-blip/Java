public class RelationalLogicalDemo {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 10;

        // ---- Relational Operators ----
        System.out.println("Relational Operators:");
        System.out.println("a == b → " + (a == b));   // false (10 ≠ 20)
        System.out.println("a == c → " + (a == c));   // true  (10 == 10)
        System.out.println("a != b → " + (a != b));   // true  (10 ≠ 20)
        System.out.println("a > b  → " + (a > b));    // false
        System.out.println("a < b  → " + (a < b));    // true
        System.out.println("a >= c → " + (a >= c));   // true  (10 >= 10)
        System.out.println("b <= 15 → " + (b <= 15)); // false (20 not <= 15)

        // ---- Logical Operators ----
        System.out.println("\nLogical Operators:");
        boolean cond1 = (a < b);    // true (10 < 20)
        boolean cond2 = (a == c);   // true (10 == 10)
        boolean cond3 = (b < 15);   // false (20 < 15)

        System.out.println("cond1 && cond2 → " + (cond1 && cond2)); 
        // true && true → true

        System.out.println("cond1 && cond3 → " + (cond1 && cond3)); 
        // true && false → false

        System.out.println("cond1 || cond3 → " + (cond1 || cond3)); 
        // true || false → true

        System.out.println("!cond3 → " + (!cond3)); 
        // !false → true
    }
}
