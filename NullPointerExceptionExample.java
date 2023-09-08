package pages;
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        
        try {
            // Attempt to access the length of a null string
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            // Catch and handle the NullPointerException
            System.err.println("A NullPointerException occurred: " + e.getMessage());
        }
        
        System.out.println("Program continues after the exception handling.");
    }
}
