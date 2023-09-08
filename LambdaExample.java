package pages;
public class LambdaExample {
    public static void main(String[] args) {
        // Using a lambda expression to define addition behavior
        Calculator addition = (a, b) -> a + b;

        // Using a lambda expression to define subtraction behavior
        Calculator subtraction = (a, b) -> a - b;

        // Using the lambda expressions to perform calculations
        int result1 = addition.calculate(5, 3); // result1 = 8
        int result2 = subtraction.calculate(10, 4); // result2 = 6

        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);
    }
}
