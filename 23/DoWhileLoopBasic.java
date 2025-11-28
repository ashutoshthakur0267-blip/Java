public class DoWhileLoopBasic {
    public static void main(String[] args) {

        // ---------- Basic Do-While Loop ----------
        // Logic: Print numbers from 1 to 5
        int num = 1; // initialization
        do {
            System.out.println("Number: " + num); // body executes at least once
            num++; // update
        } while (num <= 5); // condition checked after execution


        // ---------- Do-While vs While ----------
        int x = 10;
        while (x < 5) {
            System.out.println("This will NOT run (while loop)");
        }

        do {
            System.out.println("This will run ONCE (do-while loop)");
        } while (x < 5); // condition is false but body ran once


        // ---------- Infinite Do-While Loop ----------
        /*
        do {
            System.out.println("This will run forever!");
        } while (true);
        */


        // ---------- Safe Infinite Do-While Loop ----------
        int i = 1;
        do {
            System.out.println("Iteration: " + i);
            if (i == 5) { // break condition
                System.out.println("Breaking the infinite do-while loop!");
                break;
            }
            i++;
        } while (true);
    }
}
