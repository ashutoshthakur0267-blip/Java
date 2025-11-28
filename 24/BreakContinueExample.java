public class BreakContinueExample {
    public static void main(String[] args) {

        // ---------- Break Example ----------
        System.out.println("=== Break Example ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking loop at i = " + i);
                break; // exit loop completely
            }
            System.out.println("Value of i: " + i);
        }


        // ---------- Continue Example ----------
        System.out.println("\n=== Continue Example ===");
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) { // skip even numbers
                continue; // skip this iteration
            }
            System.out.println("Odd number: " + j);
        }


        // ---------- Break in While Loop ----------
        System.out.println("\n=== Break in While Loop ===");
        int k = 1;
        while (k <= 10) {
            if (k == 4) {
                System.out.println("Breaking while loop at k = " + k);
                break;
            }
            System.out.println("k: " + k);
            k++;
        }


        // ---------- Continue in While Loop ----------
        System.out.println("\n=== Continue in While Loop ===");
        int m = 0;
        while (m < 5) {
            m++;
            if (m == 3) {
                System.out.println("Skipping m = " + m);
                continue; // skip printing 3
            }
            System.out.println("m: " + m);
        }
    }
}
