class box{
    float l,b,w;
}

public class demo {
    public static void main(String[] args) {
        float v;
        box b1=new box();
        b1.b=10;
        b1.l=5;
        b1.w=10;
        v=b1.b * b1.l * b1.w;
        System.out.println("Volume +",v);
    }
}
