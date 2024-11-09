package Assignment;

class Student {
    private String name;
    private int[] marks;

    // Constructor for a single subject
    public Student(String name, int mark) {
        this.name = name;
        this.marks = new int[]{mark};
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
        Student student1 = new Student("Alice", new int[]{45, 55, 60});
        System.out.println(student1.getName() + " has " + student1.calculateDivision() + ".");

        Student student2 = new Student("Bob", new int[]{70, 80, 90});
        System.out.println(student2.getName() + " has " + student2.calculateDivision() + ".");
    }
}