public class ForLoopBasic {
    public static void main(String[] args) {

        // ---------- Basic For Loop ----------
        // Logic: Print numbers from 1 to 5

        for (int num = 1; num <= 5; num++) {
            // Initialization → int num=1
            // Condition → num<=5
            // Update → num++
            System.out.println("Number: " + num);
        }


        // ---------- Infinite For Loop ----------
        /*
        for(;;) { // no condition → always true
            System.out.println("This runs forever!");
        }
        */


        // ---------- Safe Infinite Loop with Break ----------
        for (int i = 1; ; i++) { // condition missing → infinite
            System.out.println("Iteration: " + i);

            if (i == 5) { // stop when i==5
                System.out.println("Breaking the infinite loop!");
                break; 
            }
        }


        // ---------- For Loop with Multiple Variables ----------
        for (int a = 1, b = 5; a <= 5 && b >= 1; a++, b--) {
            System.out.println("a: " + a + ", b: " + b);
        }


        // ---------- Enhanced For Loop (For-Each Loop) ----------
        // Used to iterate over arrays or collections
        String[] fruits = {"Apple", "Banana", "Mango"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
