public class IfElseExamples {
    public static void main(String[] args) {

        // Example 1: Simple if condition
        int age = 20;
        if (age >= 18) {   // check if age is greater than or equal to 18
            System.out.println("You are an adult.");
        }

        // Example 2: if-else condition
        int number = 5;
        if (number % 2 == 0) {   // check if number is divisible by 2
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Example 3: if-else if-else ladder
        int marks = 72;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Example 4: Nested if
        boolean hasID = true;
        int personAge = 16;
        if (hasID) {   // check if person has an ID
            if (personAge >= 18) {
                System.out.println("You can enter the club.");
            } else {
                System.out.println("You are underage, cannot enter.");
            }
        } else {
            System.out.println("You need an ID to enter.");
        }

        // Example 5: Multiple conditions with logical operators
        int x = 10, y = 20;
        if (x > 0 && y > 0) {   // && means both conditions must be true
            System.out.println("Both numbers are positive.");
        }
        if (x > 5 || y > 25) {  // || means at least one condition is true
            System.out.println("Either x is greater than 5 OR y is greater than 25.");
        }

        // Example 6: if-else with string comparison
        String name = "Harry";
        if (name.equals("Harry")) {   // use .equals() to compare strings
            System.out.println("Hello Harry!");
        } else {
            System.out.println("You are not Harry.");
        }
    }
}
