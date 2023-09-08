package pages;

import java.util.Arrays;

public class ArrayEqualityCheck {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};

        if (areArraysEqual(array1, array2)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        // Check if the arrays are of the same length
        if (array1.length != array2.length) {
            return false;
        }

        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare each element of the sorted arrays
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        // If all elements match, the arrays are equal
        return true;
    }
}
