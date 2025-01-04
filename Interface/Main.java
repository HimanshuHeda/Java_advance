package Interface;

// Define the interfaces
interface Basic {
    void add(int a, int b);
    void sub(int a, int b);
}

interface Advanced {
    void mul(int a, int b);
    void div(int a, int b);
}

// Implement the Advanced interface
class Calculator implements Advanced {
    // Implementing methods from the Advanced interface
    public void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void div(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    // Implementing methods from the Basic interface
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}

// Main class with the main function
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calc = new Calculator();

        // Perform operations
        calc.add(10, 15);
        calc.sub(20, 5);
        calc.mul(30, 10);
        calc.div(100, 2);
    }
}