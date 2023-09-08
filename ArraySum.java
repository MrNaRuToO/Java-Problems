package pages;
public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        int sum = 0; // Initialize a variable to store the sum
        
        // Iterate through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        System.out.println("Sum of elements in the array: " + sum);
    }
}
