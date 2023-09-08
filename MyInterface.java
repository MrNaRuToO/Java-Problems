package pages;
public class MyClass implements MyInterface {
    @Override
    public void regularMethod() {
        System.out.println("Implementing regularMethod()");
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();

        // Call regularMethod
        myObj.regularMethod(); // Outputs: Implementing regularMethod()

        // Call defaultMethod
        myObj.defaultMethod(); // Outputs: Default method in MyInterface

        // Call staticMethod using the interface name
        MyInterface.staticMethod(); // Outputs: Static method in MyInterface
    }
}

