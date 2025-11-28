public class Main {
    public static void main(String[] args) {

        // problem 1: Convert string to lowercase
        String name = "Jack Parker";
        name = name.toLowerCase();          // "Jack Parker" → "jack parker"
        System.out.println(name);           // Output: jack parker


        // problem 2: Replace spaces with underscores
        String text = "To My   Friend";     
        text = text.replace(" ", "_");      // replaces every space with "_"
                                            // "To My   Friend" → "To_My___Friend"
        System.out.println(text);           // Output: To_My___Friend


        // problem 3: Replace placeholder with actual name
        String letter = "Dear <|name|>,Thanks a lot";
        letter = letter.replace("<|name|>", "Harry");
                                            // "Dear <|name|>,Thanks a lot"
                                            // → "Dear Harry,Thanks a lot"
        System.out.println(letter);         // Output: Dear Harry,Thanks a lot


        // problem 4: Detect double and triple spaces
        String myString = "This string contains   double and triple space";
        System.out.println(myString.indexOf("  "));   // index of first double space
                                                      // Output: 21
        System.out.println(myString.indexOf("   "));  // index of first triple space
                                                      // Output: 21


        // problem 5: Use escape sequences in string
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\n\tThanks!";
        System.out.println(myLetter);
        // \n → new line
        // \t → tab space
        // Output:
        // Dear Harry,
        //     This Java Course is Nice.
        //     Thanks!
    }
}
