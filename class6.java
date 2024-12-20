class Box {
    int h, b, w;

    Box(int h, int b, int w) {
        this.h = h;
        this.b = b;
        this.w = w;
    }

    Box(int h, int b) {
        this.h = h;
        this.b = b;
        this.w = 1; // Default value for width
    }

    Box(int h) {
        this.h = h;
        this.b = 1; // Default value for breadth
        this.w = 1; // Default value for width
    }

    int cal_vol() {
        return h * b * w;
    }
}

public class class6 {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        Box b2 = new Box(5, 7);
        Box b3 = new Box(10);

        int v1 = b1.cal_vol();
        System.out.println("The volume of box b1 is : " + v1);

        int v2 = b2.cal_vol();
        System.out.println("The volume of box b2 is : " + v2);

        int v3 = b3.cal_vol();
        System.out.println("The volume of box b3 is : " + v3);
    }
}