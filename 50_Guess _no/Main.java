import java.util.Random;
import java.util.Scanner;

class Game {
    private int number;        // Random number to guess
    private int noOfGuesses;   // Count guesses
    private int inputNumber;   // User input

    // Getter
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // ✅ Constructor generates a random number from 1 to 100
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1;  // Ensures number is 1–100
        this.noOfGuesses = 0;
    }

    // ✅ Take user input
    void takeUserInput() {
        System.out.print("Enter your guess: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    // ✅ Check if guessed number is correct
    boolean isCorrectNumber() {
        noOfGuesses++; // Increase every time a guess is made

        if (inputNumber == number) {
            System.out.println("✅ Correct Guess!");
            return true;
        } else if (inputNumber < number) {
            System.out.println("🔼 Too Low!");
        } else {
            System.out.println("🔽 Too High!");
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {

        Game g = new Game();   // Create game object
        boolean isCorrect = false;

        System.out.println("🎮 Guess the Number (1 to 100)!");

        // Loop until the correct number is guessed
        while (!isCorrect) {
            g.takeUserInput();          // Take user guess
            isCorrect = g.isCorrectNumber();  // Check it
        }

        // ✅ When guessed correctly
        System.out.println("🎉 You guessed it in " + g.getNoOfGuesses() + " attempts!");
    }
}
