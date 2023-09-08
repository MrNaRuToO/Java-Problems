package pages;
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int sum1 = calculator.add(2, 3);           // Calls the first add method
        double sum2 = calculator.add(2.5, 3.5);    // Calls the second add method
        int sum3 = calculator.add(2, 3, 4);        // Calls the third add method
        
        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
        System.out.println("Sum3: " + sum3);
    }
}
