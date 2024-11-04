// 2. (a)Generate odd numbers from 100 to 500.
// 2. (b)Print any table and add 
//          2*1 = 2
//          2*2 = 4
//          sum of products 

public class table {
    public static void main(String[] args) {
        // Part (a): Generate odd numbers from 100 to 500
        System.out.println("Odd numbers from 100 to 500:");
        for (int i = 101; i <= 500; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line for better readability

        // Part (b): Print the multiplication table for 2
        int number = 2;
        int sumOfProducts = 0;

        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " * " + i + " = " + product);
            sumOfProducts += product; // Accumulate the sum of products
        }

        // Print the sum of products
        System.out.println("Sum of products: " + sumOfProducts);
    }
}
