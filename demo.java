class box{
    float l,b,h;
}

public class demo {
    public static void main(String[] args) {
        float v;
        box b1=new box();
        b1.b=10;
        b1.l=5;
        b1.h=10;
        v=b1.b * b1.l * b1.h;
        System.out.println("Volume "+v);
        // System.out.print(v);
    }
}
