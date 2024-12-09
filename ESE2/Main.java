// Create a class with 2 variables x,y(BASE class) 
// 1. create a derived class 1 that has z variable and add x,y,z.
// 2. Create another derived class2 that has 't' variable and multiply x,y,t; 
// 3. Create derived class 3 that inherits derived class1 and has 'd' variable and calculate (d*(x+y+z))

// Base class
class Base {
    int x;
    int y;

    Base(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Derived class 1
class Derived1 extends Base {
    int z;

    Derived1(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    int add() {
        return x + y + z;
    }
}

// Derived class 2
class Derived2 extends Base {
    int t;

    Derived2(int x, int y, int t) {
        super(x, y);
        this.t = t;
    }

    int multiply() {
        return x * y * t;
    }
}

// Derived class 3 that inherits from Derived1
class Derived3 extends Derived1 {
    int d;

    Derived3(int x, int y, int z, int d) {
        super(x, y, z);
        this.d = d;
    }

    int calculate() {
        return d * (x + y + z);
    }
}

// Main class to demonstrate functionality
public class Main {
    public static void main(String[] args) {
        // Create an instance of Derived1
        Derived1 derived1 = new Derived1(1, 2, 3);
        System.out.println("Sum of x, y, z in Derived1: " + derived1.add());

        // Create an instance of Derived2
        Derived2 derived2 = new Derived2(1, 2, 3);
        System.out.println("Product of x, y, t in Derived2: " + derived2.multiply());

        // Create an instance of Derived3
        Derived3 derived3 = new Derived3(1, 2, 3, 4);
        System.out.println("Result of d * (x + y + z) in Derived3: " + derived3.calculate());
    }
}