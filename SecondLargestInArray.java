package pages;
public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 8, 3, 6};

        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer
        int secondLargest = Integer.MIN_VALUE; // Initialize secondLargest to the smallest possible integer

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest; // Update secondLargest with the previous largest
                largest = number; // Update largest with the new largest
            } else if (number > secondLargest && number != largest) {
                secondLargest = number; // Update secondLargest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}

