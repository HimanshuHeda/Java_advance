class Rect {
    int length, breadth;

    Rect(int l, int b) {
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rect {
    double height;

    Cuboid(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    void volume() {
        System.out.println(length * breadth * height);
    }
}

public class vol {
    public static void main(String args[]) {
        Cuboid v = new Cuboid(1, 2, 3);
        v.volume();
    }
}
