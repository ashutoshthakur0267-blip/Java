public class VarargsExample {

    // ---------------- KEY POINTS ----------------
    // 1. Varargs (Variable Arguments) allow a method to accept 0 or more arguments.
    // 2. Syntax: returnType methodName(datatype... varName)
    //    Example: int sum(int... numbers)
    // 3. Inside the method → varargs are treated as an array.
    // 4. A method can have normal (mandatory) parameters + varargs,
    //    BUT varargs must always be the last parameter.
    // 5. Useful when we don’t know how many inputs will be passed.
    // ------------------------------------------------------------

    // Method with varargs only
    static int sumAll(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    // Method with mandatory argument + varargs
    static void printStudentMarks(String studentName, int... marks) {
        System.out.print(studentName + " got marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println(); // new line
    }

    public static void main(String[] args) {

        // ---------------- Example 1: Using only varargs ----------------
        System.out.println("Sum (no args) = " + sumAll());                // no input
        System.out.println("Sum (3, 5) = " + sumAll(3, 5));               // 2 inputs
        System.out.println("Sum (1, 2, 3, 4, 5) = " + sumAll(1, 2, 3, 4, 5)); // multiple inputs

        System.out.println("--------------------------------");

        // ---------------- Example 2: Mandatory arg + varargs ----------------
        printStudentMarks("Ashutosh", 90, 85, 78); // 3 marks
        printStudentMarks("Rahul", 88, 92);        // 2 marks
        printStudentMarks("Sneha");                // no marks, but mandatory name still required
    }
}
