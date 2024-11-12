class Rectangle {
    private double length;
    private double width;

    // Constructor with no parameters (default constructor)
    public Rectangle() {
        this.length = 1.0; // Default length
        this.width = 1.0;  // Default width
    }

    // Constructor with one parameter
    public Rectangle(double side) {
        this.length = side; // Length and width are the same
        this.width = side;
    }

    // Constructor with two parameters
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double area() {
        return length * width;
    }

    // Method to display rectangle dimensions
    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        // Using the default constructor
        Rectangle rect1 = new Rectangle();
        rect1.display();
        System.out.println("Area: " + rect1.area());

        // Using the constructor with one parameter
        Rectangle rect2 = new Rectangle(5.0);
        rect2.display();
        System.out.println("Area: " + rect2.area());

        // Using the constructor with two parameters
        Rectangle rect3 = new Rectangle(4.0, 6.0);
        rect3.display();
        System.out.println("Area: " + rect3.area());
    }
}
