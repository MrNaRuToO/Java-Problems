package pages;
interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B extends A {
    // No additional methods or implementations
}

interface C extends A {
    // No additional methods or implementations
}

class D implements B, C {
    public static void main(String[] args) {
        D d = new D();
        d.show();
    }
}
