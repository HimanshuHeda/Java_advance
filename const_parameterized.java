// modify the above classes include parameter constructor in both. (get both the results) 
// both default constructor should be executed.
// parametaized of child and default of parent class constructor should be executed 
// both parameterized of child and parent should get executed 
// parameterized constructor of parent class and default constructor of child class should get executed 


class Parent {
    // Default constructor
    public Parent() {
        System.out.println("Parent default constructor called.");
    }

    // Parameterized constructor
    public Parent(String value) {
        System.out.println("Parent parameterized constructor called with value: " + value);
    }
}

class Child extends Parent {
    // Default constructor
    public Child() {
        super(); // Calls the default constructor of Parent
        System.out.println("Child default constructor called.");
    }

    // Parameterized constructor
    public Child(String childValue) {
        super(); // Calls the default constructor of Parent
        System.out.println("Child parameterized constructor called with value: " + childValue);
    }

    // Parameterized constructor that calls Parent's parameterized constructor
    public Child(String childValue, String parentValue) {
        super(parentValue); // Calls the parameterized constructor of Parent
        System.out.println("Child parameterized constructor called with value: " + childValue);
    }
}

public class const_parameterized {
    public static void main(String[] args) {
        System.out.println("Test Case 1: Default constructors");
        Child child1 = new Child(); // Should call default constructors of both Parent and Child

        System.out.println("\nTest Case 2: Parameterized constructor of Child and default of Parent");
        Child child2 = new Child("Child Value"); // Should call parameterized constructor of Child and default of Parent

        System.out.println("\nTest Case 3: Parameterized constructors of both Child and Parent");
        Child child3 = new Child("Child Value", "Parent Value"); // Should call parameterized constructors of both

        System.out.println("\nTest Case 4: Parameterized constructor of Parent and default constructor of Child");
        Parent parent = new Parent("Parent Value"); // Should call parameterized constructor of Parent
        Child child4 = new Child(); // Should call default constructor of Child
    }
}