package pages;
public class CaseConversion {
    public static void main(String[] args) {
        String inputString = "Hello, World! 123";

        String convertedString = toggleCase(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Converted String: " + convertedString);
    }

    // Function to replace lower-case characters with upper-case and vice-versa
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder(str.length());

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c); // Keep non-alphabetical characters unchanged
            }
        }

        return result.toString();
    }
}
