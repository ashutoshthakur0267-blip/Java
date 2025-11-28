public class Main2 {

    public static void main(String[] args) {
        // Check if the user provided exactly 3 arguments
        if (args.length != 3) {
            System.out.println("Please provide exactly 3 numbers as arguments!");
            return; // Exit the program if not enough or too many arguments
        }

        // Convert the string arguments to integers
        int num1 = Integer.parseInt(args[0]); // First argument
        int num2 = Integer.parseInt(args[1]); // Second argument
        int num3 = Integer.parseInt(args[2]); // Third argument

        // Calculate the sum
        int sum = num1 + num2 + num3;

        // Print the result
        System.out.println("The sum of these numbers is: " + sum);
    }
}
