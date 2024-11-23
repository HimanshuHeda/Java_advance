// 1) Create a class Calculator with methods for basic operations: Addition,
// Subtraction, Multiplication, and Division. Overload the add and multiply
// methods to handle operations for both integers and floating-point
// numbers. Use the this keyword to reference instance variables if needed.

package ESE;

public class Calculator {
    
    // Addition method for integers
    int add(int a, int b) {
        return a + b;
    }
    
    // Addition method for floating-point numbers
    double add(double a, double b) {
        return a + b;
    }
    
    // Subtraction method for integers
    int sub(int a, int b) {
        return a - b;
    }
    
    // Subtraction method for floating-point numbers
    double sub(double a, double b) {
        return a - b;
    }
    
    // Multiplication method for integers
    int mul(int a, int b) {
        return a * b;
    }
    
    // Multiplication method for floating-point numbers
    double mul(double a, double b) {
        return a * b;
    }
    
    // Division method for integers
    int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
    
    // Division method for floating-point numbers
    double div(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
    
    // Main method for testing the Calculator class
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Testing integer operations
        System.out.println("Integer Addition: " + calc.add(15, 6)); 
        System.out.println("Integer Subtraction: " + calc.sub(30, 20)); 
        System.out.println("Integer Multiplication: " + calc.mul(17, 13)); 
        System.out.println("Integer Division: " + calc.div(60, 20)); 
        
        // Testing floating-point operations
        System.out.println("Floating-point Addition: " + calc.add(15.5, 13.23)); 
        System.out.println("Floating-point Subtraction: " + calc.sub(1.3, 2.5)); 
        System.out.println("Floating-point Multiplication: " + calc.mul(8.5, 10.2)); 
        System.out.println("Floating-point Division: " + calc.div(2.5, 9.2)); 
    }
}