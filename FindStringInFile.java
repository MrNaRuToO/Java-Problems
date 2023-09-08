package pages ;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindStringInFile {
    public static void main(String[] args) {
        String filePath = "\"C:\\Users\\acer\\java\\JAVA Session.txt\""; // Replace with the path to your text file
        String searchString = "JAVA Session"; // Replace with the string you want to find

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (line.contains(searchString)) {
                    System.out.println("Found '" + searchString + "' on line " + lineNumber + ": " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
