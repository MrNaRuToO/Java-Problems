package pages;
public class Pattern {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        // Loop through rows
        for (int i = 0; i < n; i++) {
            // Print numbers in decreasing order
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }

            // Print asterisks
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }

            // Print numbers in increasing order
            for (int j = n - i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line
        }
    }
}
