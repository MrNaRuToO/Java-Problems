package pages;
public class ImmutableStringDemo {
    public static void main(String[] args) {
        // Create a string object
        String originalString = "Hello, World!";
        
        // Attempt to modify the string
        String modifiedString = modifyString(originalString);
        
        // Check if the original string and modified string are the same
        boolean isSame = originalString == modifiedString;
        
        // Print the result
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
        System.out.println("Are the strings the same object? " + isSame);
    }
    
    public static String modifyString(String input) {
        // Attempt to modify the string
        input = input + " (Modified)";
        return input;
    }
}

