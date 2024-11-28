// 2)Design a Java class Employee to represent an employee with the
// following features: employeeId , salary workingHoursPerWeek. All the
// attributes should be private.
// (Can use getter and setter methods for each attribute.)
// If the working hours per week exceed 40, the employee is eligible for a
// bonus of 10% of the base salary.The bonus should be added to the salary.
// Use the toal salary of the person. Take atlest 2 objects one whose working
// hours exceeds 40 and other less than 40. Display all the values of the
// object. Use constructor to initialize the employee&#39;s attributes.

package ESE;

public class Employee {
    // Private attributes
    private int empId;
    private double salary;
    private int workingHoursPerWeek;

    // Constructor to initialize the employee's attributes
    Employee(int empId, double salary, int workingHoursPerWeek) {
        this.empId = empId;
        this.salary = salary;
        this.workingHoursPerWeek = workingHoursPerWeek;
    }

    // Getter and setter for employeeId
    int getEmployeeId() {
        return empId;
    }

    void setEmployeeId(int empId) {
        this.empId = empId;
    }

    // Getter and setter for salary
    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter and setter for workingHoursPerWeek
    int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    void setWorkingHoursPerWeek(int workingHoursPerWeek) {
        this.workingHoursPerWeek = workingHoursPerWeek;
    }

    // Method to calculate total salary including bonus if applicable
    double calculateTotalSalary() {
        double totalSalary = salary;
        if (workingHoursPerWeek > 40) {
            totalSalary += salary * 0.10; // Adding 10% bonus
        }
        return totalSalary;
    }

    // Method to display employee details
    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Base Salary: " + salary);
        System.out.println("Working Hours Per Week: " + workingHoursPerWeek);
        System.out.println("Total Salary (with bonus if applicable): " + calculateTotalSalary());
        System.out.println("------------------------------");
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating two Employee objects
        Employee emp1 = new Employee(101, 50000, 49); 
        Employee emp2 = new Employee(102, 60000, 40); 

        // Displaying employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}

