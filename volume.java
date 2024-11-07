class Box {
    // Declare the dimensions of the box as public to access them directly
    public int l, b, h;
}

public class volume {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.l = 10;
        b1.b = 5;
        b1.h = 10;
        int v = b1.l * b1.b * b1.h;
        System.out.println("Volume for box 1: " + v);

        Box b2 = new Box();
        b2.l = 5;
        b2.b = 5;
        b2.h = 5;
        v = b2.l * b2.b * b2.h;
        System.out.println("Volume for box 2: " + v);
    }
}