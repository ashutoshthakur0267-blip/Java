public class WhileLoopBasic {
    public static void main(String[] args) {

        // ---------- Basic While Loop ----------
        // Logic: Print numbers from 1 to 5

        int num = 1;                // Step 1: Initialization
        while (num <= 5) {          // Step 2: Condition check
            System.out.println("Number: " + num); // Step 3: Loop body
            num++;                  // Step 4: Update
        }                           // Step 5: Exit when num > 5


        // ---------- Infinite While Loop (Example) ----------
        /*
        while (true) { // condition always true → never ends
            System.out.println("This will run forever!");
        }
        */

        // ---------- Safe Infinite Loop with Break ----------
        int i = 1;
        while (true) { // Infinite loop
            System.out.println("Iteration: " + i);

            if (i == 5) {  // Break condition
                System.out.println("Stopping the infinite loop!");
                break;     // exits the loop
            }
            i++;
        }
    }
}
