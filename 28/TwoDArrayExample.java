public class TwoDArrayExample {
    public static void main(String[] args) {

        // ---------- 1. Creating a 2D array using 'new' keyword ----------
        // Example: 3 students, each with 3 subject marks
        int[][] marks = new int[3][3]; // 3 rows, 3 columns

        // Assigning values manually
        marks[0][0] = 90; marks[0][1] = 85; marks[0][2] = 88; // Student 1
        marks[1][0] = 78; marks[1][1] = 82; marks[1][2] = 80; // Student 2
        marks[2][0] = 92; marks[2][1] = 95; marks[2][2] = 99; // Student 3

        System.out.println("=== 2D Array marks (using new keyword) ===");
        for (int i = 0; i < marks.length; i++) { // rows
            for (int j = 0; j < marks[i].length; j++) { // columns
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }


        // ---------- 2. Declaring 2D array first, then creating ----------
        int[][] matrix;        // Declaration
        matrix = new int[2][2]; // Initialization

        matrix[0][0] = 1; matrix[0][1] = 2;
        matrix[1][0] = 3; matrix[1][1] = 4;

        System.out.println("\n=== 2D Array matrix (declared first, then initialized) ===");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        // ---------- 3. Creating and initializing directly ----------
        int[][] table = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("\n=== 2D Array table (direct initialization) ===");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }


        // ---------- 4. Using For-Each Loop on 2D Array ----------
        System.out.println("\n=== Using For-Each Loop on table ===");
        for (int[] row : table) { // row is a 1D array
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
