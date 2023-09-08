package pages;
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch and handle the exception
            System.err.println("An ArithmeticException occurred: " + e.getMessage());
        }

        System.out.println("Program continues after the exception handling.");
    }

    public static int divide(int dividend, int divisor) {
        // Attempt to divide, which may throw an exception
        return dividend / divisor;
    }
}
