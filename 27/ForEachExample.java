import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {

        // ---------- For-Each with Array ----------
        String[] fruits = {"Apple", "Banana", "Mango"};

        System.out.println("=== For-Each with Array ===");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }


        // ---------- For-Each with int Array ----------
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("\n=== For-Each with int Array ===");
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }


        // ---------- For-Each with Collection ----------
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        System.out.println("\n=== For-Each with ArrayList ===");
        for (String name : names) {
            System.out.println("Name: " + name);
        }


        // ---------- Limitation of For-Each ----------
        // You cannot directly update array values inside for-each
        System.out.println("\n=== Limitation Example ===");
        for (int n : numbers) {
            // n = n + 5; // This updates only the local variable, not the array
            System.out.println("Value (unchanged): " + n);
        }

        // If you want to update values, use a normal for loop
        System.out.println("\n=== Updating Array with Normal For Loop ===");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 5;
            System.out.println("Updated Number: " + numbers[i]);
        }
    }
}
