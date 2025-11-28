public class WhileLoopExample {
    public static void main(String[] args) {
        
        // ---------- Basic While Loop ----------
        // A while loop keeps running as long as the condition is true.
        int count = 1; // initialization
        while (count <= 5) { // condition check
            System.out.println("Count is: " + count);
            count++; // increment (to avoid infinite loop)
        }

        // ---------- Infinite Loop Example ----------
        // WARNING: Don't run this without a stopping condition,
        // it will run forever and you have to manually stop it (Ctrl + C).
        /*
        while (true) {  // condition is always true
            System.out.println("This will print forever!");
        }
        */

        // ---------- Beginner-friendly Safe Infinite Loop ----------
        // Instead of running forever, we will break manually
        int i = 1;
        while (true) { // infinite loop
            System.out.println("Loop running... iteration: " + i);
            if (i == 5) {  // break condition
                System.out.println("Breaking the infinite loop!");
                break; // exit the loop
            }
            i++;
        }
    }
}
