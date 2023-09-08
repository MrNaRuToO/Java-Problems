package pages ;
// Superclass (Base class)
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass (Derived class)
class Dog extends Animal {
    Dog(String name) {
        super(name); // Call the superclass constructor
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create instances of the base and derived classes
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy");

        // Access properties and methods of the base class
        animal.eat();
        animal.sleep();

        // Access properties and methods of the derived class
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
