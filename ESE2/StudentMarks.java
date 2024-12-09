// Use inheritance concept. create a class and enter marks of 3 core subjects and calculate total marks and percentage.
// create a derived class that has 2 elective subjects and calculate total marks and percentage of 2 students.

// Base class for Core Subjects
class CoreSubjects {
    int marks1, marks2, marks3;
    int totalCoreMarks;
    double percentageCore;

    // Constructor to initialize core subject marks
    CoreSubjects(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        
        // Calculate total and percentage
        totalCoreMarks = marks1 + marks2 + marks3;
        percentageCore = (totalCoreMarks / 3.0);
    }

    // Method to display core subject results
    void displayCoreResults() {
        System.out.println("Total Marks in Core Subjects: " + totalCoreMarks);
        System.out.println("Percentage in Core Subjects: " + percentageCore + "%");
    }
}

// Derived class for Elective Subjects
class ElectiveSubjects extends CoreSubjects {
    int elective1, elective2;
    int totalElectiveMarks;
    double percentageElective;

    // Constructor to initialize elective subject marks
    ElectiveSubjects(int marks1, int marks2, int marks3, int elective1, int elective2) {
        super(marks1, marks2, marks3); 
        this.elective1 = elective1;
        this.elective2 = elective2;
        
        // Calculate total and percentage
        totalElectiveMarks = elective1 + elective2;
        percentageElective = (totalElectiveMarks / 2.0);
    }

    // Method to display elective subject results
    void displayElectiveResults() {
        System.out.println("Total Marks in Elective Subjects: " + totalElectiveMarks);
        System.out.println("Percentage in Elective Subjects: " + percentageElective + "%");
    }

    // Method to display overall results
    void displayOverallResults() {
        int totalMarks = totalCoreMarks + totalElectiveMarks;
        double overallPercentage = (totalMarks / 5.0); 
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Overall Percentage: " + overallPercentage + "%");
    }
}

// Main class to run the program
public class StudentMarks {
    public static void main(String[] args) {
        // Hardcoded marks for two students
        ElectiveSubjects student1 = new ElectiveSubjects(85, 90, 78, 88, 92);
        ElectiveSubjects student2 = new ElectiveSubjects(75, 80, 70, 82, 85);

        // Display results for student 1
        System.out.println("Results for Student 1:");
        student1.displayCoreResults();
        student1.displayElectiveResults();
        student1.displayOverallResults();

        // Display results for student 2
        System.out.println("\nResults for Student 2:");
        student2.displayCoreResults();
        student2.displayElectiveResults();
        student2.displayOverallResults();
    }
}