// 1) Write a program to calculate the Division of a student, apply constructor overloading and method over overloading 
// depending on the number of subject. (<50% Fail, 50 -60 % Pass, 60- 74% First Division, Above Distinction)

package Assignment;

class Student {
    private String name;
    private int[] marks;

    // Constructor for a single subject
    public Student(String name, int mark) {
        this.name = name;
        this.marks = new int[] { mark };
    }

    // Constructor for multiple subjects
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String calculateDivision() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double percentage = (double) totalMarks / marks.length;

        if (percentage < 50) {
            return "Fail";
        } else if (percentage < 60) {
            return "Pass";
        } else if (percentage < 75) {
            return "First Division";
        } else {
            return "Distinction";
        }
    }

    public String getName() {
        return name;
    }
}

// Example usage
public class StudentDivision {
    public static void main(String[] args) {
        Student student2 = new Student("Himanshu", new int[] { 70, 80, 90 });
        System.out.println(student2.getName() + " has " + student2.calculateDivision() + ".");
        
        Student student1 = new Student("Anugraha", new int[] { 45, 55, 60 });
        System.out.println(student1.getName() + " has " + student1.calculateDivision() + ".");

        Student student3 = new Student("Abhi", new int[] { 10, 40, 30 });
        System.out.println(student3.getName() + " has " + student3.calculateDivision() + ".");
    }
}