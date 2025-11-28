import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int age;

        // Asking the user to enter age
        System.out.print("Enter Your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        // ---------- If-Else Ladder ----------
        // Check the age range and print experience level
        if (age > 56) {
            System.out.println("You are experienced!");
        } 
        else if (age > 46) {
            System.out.println("You are semi-experienced!");
        } 
        else if (age > 36) {
            System.out.println("You are semi-semi-experienced!");
        } 
        else {
            System.out.println("You are not experienced");
        }

        // ---------- Traditional Switch Case ----------
        // Switch checks for exact age matches
        switch (age) {
            case 18:
                System.out.println("You are going to become an Adult!");
                break; 
                // break prevents *fall-through* (executing next case)
                // without break, it would run all statements until next break

            case 23:
                System.out.println("You are going to join a Job!");
                break;

            case 68:
                System.out.println("You are going to get retired!");
                break;

            default:
                System.out.println("Enjoy your life");
                break;
        }

        // ---------- Extended Switch (Java 14+ feature) ----------
        // Cleaner syntax using '->' instead of break
        switch (age) {
            case 13 -> System.out.println("You are a Teenager!");
            case 21 -> System.out.println("You can legally drink (in some countries)!");
            case 30 -> System.out.println("You might be focusing on your Career/Family!");
            case 50 -> System.out.println("You are in your Midlife stage!");
            case 100 -> System.out.println("Wow! Century completed!");
            default -> System.out.println("This is just another milestone of life.");
        }
    }
}
