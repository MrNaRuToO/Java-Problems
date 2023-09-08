package pages ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Convert the array to a List
        List<Integer> list = new ArrayList<>();
        for (int element : array) {
            list.add(element);
        }

        // Shuffle the List
        Collections.shuffle(list);

        // Convert the shuffled List back to an array
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }
}
