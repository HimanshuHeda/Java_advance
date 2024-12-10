// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();
}

// Subclass Dog
class Dog extends Animal {
    // Implementing the abstract method
    void makeSound() {
        System.out.println("Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Implementing the abstract method
    void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class
public class AbstractMain {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Create a Dog object
        Animal myCat = new Cat(); // Create a Cat object

        myDog.makeSound(); // Outputs: Woof!
        myCat.makeSound(); // Outputs: Meow!
    }
}
