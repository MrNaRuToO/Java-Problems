package pages;
import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        // Using forEach with an array
        int[] numbers = {1, 2, 3, 4, 5};

        Arrays.stream(numbers).forEach(number -> System.out.println(number));
    }
}
