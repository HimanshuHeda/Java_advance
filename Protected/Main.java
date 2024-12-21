package Protected;

class Base {
    int n = 1;               // Default access modifier
    private int n_pri = 2;   // Private access modifier
    protected int n_pro = 3;  // Protected access modifier
    public int n_pub = 4;     // Public access modifier

    public Base() {
        System.out.println("Base Constructor");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class Derived extends Base {
    public Derived() {
        System.out.println("Derived Constructor");
        System.out.println("Accessing Base class members from Derived class:");
        System.out.println("n = " + n);          // Accessible (default)
        // System.out.println("n_pri = " + n_pri); // Not accessible (private)
        System.out.println("n_pro = " + n_pro);   // Accessible (protected)
        System.out.println("n_pub = " + n_pub);    // Accessible (public)
    }
}

public class Main {
    public static void main(String[] args) {
        Derived derived = new Derived();
    }
}