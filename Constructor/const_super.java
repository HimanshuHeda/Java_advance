// create 2 classes each should have one default constructor 
// 1. create object of super class check the result 
// 2. create only the object of subclass check the result 

// Superclass
class SuperClass {
    String message;

    // Default constructor
    SuperClass() {
        System.out.println("This is the SuperClass"); 
    }
}

// Subclass
class SubClass extends SuperClass {
    String subMessage;

    // Default constructor
    SubClass() {
        super(); // Call the constructor of the superclass
        System.out.println("This is the SubClass");
    }
}

public class const_super {
    public static void main(String[] args) {
        // Create an object of the SuperClass
        SuperClass superObj = new SuperClass();
        System.out.println("The above one is the object of Super Class.");

        // Create an object of the SubClass
        SubClass subObj = new SubClass();
        System.out.println("The above one is the object of Sub Class.");
    }
}