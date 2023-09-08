package pages ;
public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String input = "Hello, world!";
        char charToRemove = 'o';

        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c != charToRemove) {
                result.append(c);
            }
        }

        System.out.println("Input string: " + input);
        System.out.println("Result string: " + result.toString());
    }
}
