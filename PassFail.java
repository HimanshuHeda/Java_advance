// to check the student total score (out of 3 subjects) and check weather the student is pass or fail (above 50 percent pass else fail)

class Student {
    int marks1, marks2, marks3;

    Student(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    void checkPassFail() {
        int totalScore = marks1 + marks2 + marks3;
        double averageScore = totalScore / 3;

        if (averageScore > 50) {
            System.out.println("Student has Passed");
        } else {
            System.out.println("Student has Failed");
        }
    }
}

public class PassFail {
    public static void main(String[] args) {
        Student student1 = new Student(60, 70, 80);
        student1.checkPassFail(); 

        Student student2 = new Student(40, 50, 30);
        student2.checkPassFail(); 
    }
}