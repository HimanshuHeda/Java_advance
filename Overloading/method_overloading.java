
public class method_overloading {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        method_overloading example = new method_overloading();

        // Calling the method with two integers
        int sum1 = example.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        // Calling the method with three integers
        int sum2 = example.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);

        // Calling the method with two double values
        double sum3 = example.add(5.5, 10.5);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
