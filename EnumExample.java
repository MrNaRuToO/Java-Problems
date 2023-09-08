package pages;
public class EnumExample {
  
    public static void main(String[] args) {
        // Declare a variable of the enum type
     DayOfWeek today = DayOfWeek.WEDNESDAY;

        // Use the enum in a switch statement
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            default:
                System.out.println("It's not Monday or Wednesday.");
        }
    }
}
