// 1. (a)Calculate the percentage secured by the student given 6 subjects marks 
// 1. (b)Check the division secured by the student 0-39 percent fail 40-49 second class 60-74 first class 75 are distinction. 

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold marks of 6 subjects
        int[] marks = new int[6];
        int totalMarksObtained = 0;
        int totalMarksPossible = 600; // Assuming each subject is out of 100

        // Input marks for 6 subjects
        System.out.println("Enter the marks obtained in 6 subjects (out of 100):");
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarksObtained += marks[i]; // Sum the marks
        }

        // Calculate percentage
        double percentage = (double) totalMarksObtained / totalMarksPossible * 100;
        System.out.printf("Percentage secured: %.2f%%\n", percentage);

        // Determine division
        String division;
        if (percentage < 40) {
            division = "Fail";
        }

        else if (percentage >= 40 && percentage < 60) {
            division = "Second Class";
        }

        else if (percentage >= 60 && percentage < 75) {
            division = "First Class";
        }

        else {
            division = "Distinction";
        }

        System.out.println("Division secured: " + division);

        // Close the scanner
        scanner.close();
    }
}
