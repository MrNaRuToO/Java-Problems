package pages;
public class SwitchExpressionExample {
    public static void main(String[] args) {
        int dayOfWeek = 2;

        String dayType = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Weekday"; // Multi-label case statement
            case 6, 7 -> "Weekend"; // Multi-label case statement
            default -> "Invalid day"; // Default case
        };

        System.out.println("Day type: " + dayType);
    }
}

