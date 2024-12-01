package Pattern_Printing;

public class number2 {
    public static void main(String[] args) {
        // Number of lines to print
        int n = 5;

        // Loop through each number from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // Print the number i, i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i+ " ");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}