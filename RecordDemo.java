package pages;
public class RecordDemo {
   
    public static void main(String[] args) {
        // Create a Person object using the automatically generated constructor
        Person person = new Person("Alice",30);

        // Access fields using accessor methods
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());

        // Automatically generated toString() method
        System.out.println("Person: " + person);

        // Records have built-in equals() and hashCode() methods
        Person anotherPerson = new Person("Tanmay", 23);
        System.out.println("Are they equal? " + person.equals(anotherPerson));
    }
}
