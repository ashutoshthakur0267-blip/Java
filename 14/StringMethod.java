public class StringMethod {
    public static void main(String[] args) {
        String name = "Harry";  // Declare and initialize a string

        int value = name.length();  // length() → returns number of characters in string
        System.out.println(value);  // Output: 5

        String lString = name.toLowerCase();  // toLowerCase() → convert to lowercase
        System.out.println(lString);          // Output: harry

        String uString = name.toUpperCase();  // toUpperCase() → convert to uppercase
        System.out.println(uString);          // Output: HARRY

        String nonTrimmString = "     Harry    "; // String with leading & trailing spaces
        System.out.println(nonTrimmString);       // Output: "     Harry    "
        System.out.println(nonTrimmString.trim()); // trim() → removes spaces at ends
                                                   // Output: "Harry"

        System.out.println(name.substring(2));     // substring(2) → from index 2 till end
                                                   // "Harry" → "rry"
        System.out.println(name.substring(1,3));   // substring(1,3) → index 1 to 2
                                                   // "Harry" → "ar"

        System.out.println(name.replace('r','p')); // replace all 'r' with 'p'
                                                   // "Harry" → "Happy"
        System.out.println(name.replace("rry","ier")); // replace substring "rry" with "ier"
                                                       // "Harry" → "Haier"
        System.out.println(name.replace("r", "ier"));  // replace every "r" with "ier"
                                                       // "Harry" → "Haieriery"

        System.out.println(name.startsWith("Har"));  // true (string starts with "Har")
        System.out.println(name.endsWith("i"));      // false ("Harry" does not end with "i")

        System.out.println(name.charAt(1));          // charAt(1) → character at index 1
                                                     // "Harry" → 'a'

        System.out.println(name.indexOf("r"));       // first occurrence of "r"
                                                     // "Harry" → index 2
        String modifiedString = "Harryrry";          
        System.out.println(modifiedString.indexOf("rry",4));
        // indexOf("rry",4) → search for "rry" starting from index 4
        // "Harryrry" → found at index 5

        System.out.println(modifiedString.lastIndexOf("r"));
        // last occurrence of 'r' in "Harryrry" → index 6

        System.out.println(modifiedString.lastIndexOf("r", 4));
        // last occurrence of 'r' before index 4
        // "Harryrry" → index 3

        System.out.println(modifiedString.lastIndexOf("rry",7));
        // last occurrence of "rry" before or at index 7
        // "Harryrry" → index 5

        System.out.println(name.equals("harry"));
        // equals() → case-sensitive, "Harry" ≠ "harry" → false

        System.out.println(name.equalsIgnoreCase("harry"));
        // equalsIgnoreCase() → ignores case → true

        System.out.println("I am escape\t sequen\nce\"double quote\"");
        // Demonstrates escape sequences:
        // \t → tab space
        // \n → new line
        // \" → double quote
        // Output:
        // I am escape	 sequen
        // ce"double quote"
    }
}
