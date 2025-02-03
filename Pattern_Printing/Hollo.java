package Pattern_Printing;

class Hollo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Add an extra space for alignment
                }
            }
            System.out.println(); // Move this outside the inner loop to print new row
        }
    }
}