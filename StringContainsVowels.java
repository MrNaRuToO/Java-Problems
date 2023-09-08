package pages;

public class StringContainsVowels {
    public static void main(String[] args) {
        String input = "Hello, World"; // Change this to the string you want to check

        if (containsVowels(input)) {
            System.out.println("'" + input + "' contains vowels.");
        } else {
            System.out.println("'" + input + "' does not contain vowels.");
        }
    }

    // Function to check if a string contains vowels
    public static boolean containsVowels(String str) {
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive check

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel (a, e, i, o, u)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true; // Vowel found, return true
            }
        }

        return false; // No vowels found
    }
}
