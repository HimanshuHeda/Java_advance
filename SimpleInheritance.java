class A {
    int i, j;

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("k:" + k);
    }

    void sum() {
        System.out.println(i + j + k);
    }
}

public class SimpleInheritance {
    public static void main(String args[]) {
        A sup = new A();
        B sub = new B();
        sup.i = 10;
        sup.j = 20;
        System.out.println("Contents of super class ");
        sup.showij();
        sub.i = 7;
        sub.j = 8;
        sub.k = 9;
        System.out.println("Contents of sub class");
        sub.showij();
        sub.showk();
        System.out.println("Sum of i, j and k in sub class");
        sub.sum();
    }
}
