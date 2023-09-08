package pages ;

    public class OnlyOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Replace this with your array

        System.out.println("Odd numbers in the array:");
        printOddNumbers(numbers);
    }

    // Function to print odd numbers from an array
    public static void printOddNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
