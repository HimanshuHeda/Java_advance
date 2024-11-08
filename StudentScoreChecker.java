// to check the student total  score (out of 3 subjects) check wether pass or fail 50 fail else fail
class Student {
    // Instance variables for scores
    int subject1Score;
    int subject2Score;
    int subject3Score;

    // Non-parameterized constructor
    Student() {
        // Default scores (you can change these values)
        this.subject1Score = 0; // Default score for subject 1
        this.subject2Score = 0; // Default score for subject 2
        this.subject3Score = 0; // Default score for subject 3
    }

    // Parameterized constructor
    Student(int subject1, int subject2, int subject3) {
        this.subject1Score = subject1;
        this.subject2Score = subject2;
        this.subject3Score = subject3;
    }

    // Method to calculate total score
    int calculateTotalScore() {
        return subject1Score + subject2Score + subject3Score;
    }

    // Method to determine pass or fail
    String getResult() {
        return (calculateTotalScore() >= 50) ? "Pass" : "Fail";
    }
}

class StudentScoreChecker {
    public static void main(String[] args) {
        // Create an object using the non-parameterized constructor
        Student student1 = new Student();
        
        // Create an object using the parameterized constructor
        Student student2 = new Student(70, 60, 40);

        // Display results for student 1
        System.out.println("Student 1 Total Score: " + student1.calculateTotalScore() + " - Result: " + student1.getResult());

        // Display results for student 2
        System.out.println("Student 2 Total Score: " + student2.calculateTotalScore() + " - Result: " + student2.getResult());
    }
}