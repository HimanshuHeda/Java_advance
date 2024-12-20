class base {
    int x;

    // Non-parameterized constructor
    base() {
        System.out.println("Base Class non-parameterized Constructor.");
    }

    // Parameterized constructor
    base(int x) {
        this.x = x;
        System.out.println("X = " + x);
    }
}

class derived extends base {
    int y;

    // Non-parameterized constructor
    derived() {
        super(); // Call the base class non-parameterized constructor
        System.out.println("Derived Class non-parameterized Constructor.");
    }

    // Parameterized constructor
    derived(int x, int y) {
        super(x); // Call the base class parameterized constructor
        this.y = y;
        System.out.println("Y = " + y);
        int area = x * y;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class parameterized_const {
    public static void main(String[] args) {
        // Uncomment the following line to create an instance of the base class
        // base b = new base();
        base b1 = new base(5); // Create an instance of base with parameter
        derived d = new derived(); // Create an instance of derived with no parameters
        derived d1 = new derived(3, 5); // Create an instance of derived with parameters
    }
}