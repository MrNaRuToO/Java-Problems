package pages;
@FunctionalInterface
public interface MyFunctionalInterface {
    // Single abstract method
    void myMethod(int a, int b);

    // You can have default methods or static methods in a functional interface as well
    // as long as there is only one abstract method.
    
    // For example, a default method:
    default void someDefaultMethod() {
        System.out.println("This is a default method.");
    }
}
