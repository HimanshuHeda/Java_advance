//use class $ objects to calculate sum of square of 4 numbers
class SumOfSquares {
    private int num1, num2, num3, num4;
    // Non-parameterized constructor
    public SumOfSquares() {
        this.num1 = 5;
        this.num2 = 10;
        this.num3 = 20;
        this.num4 = 30;
    }
    // Parameterized constructor
    public SumOfSquares(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }
    // Method to calculate the sum of squares
    public int calculateSumOfSquares() {
        return (num1 * num1) + (num2 * num2) + (num3 * num3) + (num4 * num4);
    }
}
// Main class to test the SumOfSquares class
public class Main {
    public static void main(String[] args) {
        // Using the parameterized constructor
        SumOfSquares paramObj = new SumOfSquares(1, 2, 3, 4);
        System.out.println("Sum of squares (parameterized): " + paramObj.calculateSumOfSquares());
        // Using the non-parameterized constructor
        SumOfSquares nonParamObj = new SumOfSquares();
        System.out.println("Sum of squares (non-parameterized): " + nonParamObj.calculateSumOfSquares());
    }
}