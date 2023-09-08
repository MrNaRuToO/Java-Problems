package pages;
import java.util.HashMap;
import java.util.Map;

public class DistinctCharactersCount {
    public static void main(String[] args) {
        String inputString = "programming";

        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the input string
        for (char c : inputString.toCharArray()) {
            // Update the count for the current character in the HashMap
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print distinct characters and their counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
