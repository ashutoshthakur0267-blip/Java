public class AllTypesOfRecursion {

    // ---------------- KEY POINTS ----------------
    // Types of Recursion:
    // 1. Direct Recursion → method calls itself directly.
    // 2. Indirect Recursion → method calls another method which again calls the first method.
    // 3. Tail Recursion → recursive call is the LAST statement (no extra work after recursion).
    // 4. Head Recursion → recursive call happens FIRST, before any other statement.
    // 5. Tree Recursion → function calls itself more than once.
    // ------------------------------------------------------------

    // 1. Direct Recursion (Factorial Example)
    static int factorial(int n) {
        if (n == 0) return 1; // Base case
        return n * factorial(n - 1); // Direct recursion
    }

    // 2. Indirect Recursion
    static void methodA(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            methodB(n - 1); // calls methodB
        }
    }

    static void methodB(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            methodA(n / 2); // calls methodA → indirect recursion
        }
    }

    // 3. Tail Recursion (Recursive call is the last step)
    static void tailRecursion(int n) {
        if (n == 0) return; // Base case
        System.out.print(n + " ");
        tailRecursion(n - 1); // nothing left after this → tail recursion
    }

    // 4. Head Recursion (Recursive call happens first)
    static void headRecursion(int n) {
        if (n == 0) return; // Base case
        headRecursion(n - 1); // recursive call first
        System.out.print(n + " "); // work after recursion
    }

    // 5. Tree Recursion (Method calls itself more than once)
    static void treeRecursion(int n) {
        if (n <= 0) return;
        System.out.print(n + " ");
        treeRecursion(n - 1); // first recursive call
        treeRecursion(n - 2); // second recursive call
    }

    public static void main(String[] args) {
        // ---------------- Direct Recursion ----------------
        System.out.println("Factorial of 5 (Direct Recursion): " + factorial(5));

        // ---------------- Indirect Recursion ----------------
        System.out.print("Indirect Recursion sequence: ");
        methodA(10);
        System.out.println();

        // ---------------- Tail Recursion ----------------
        System.out.print("Tail Recursion (countdown from 5): ");
        tailRecursion(5);
        System.out.println();

        // ---------------- Head Recursion ----------------
        System.out.print("Head Recursion (count up to 5): ");
        headRecursion(5);
        System.out.println();

        // ---------------- Tree Recursion ----------------
        System.out.print("Tree Recursion with n=3: ");
        treeRecursion(3);
        System.out.println();
    }
}
