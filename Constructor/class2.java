class box{
    int h,b,w;
    void set(){
        h = 10;
        b = 5;
        w = 10;
    }

    int cal_vol(){
        return h*b*w;
    }
}

public class class2 {
    public static void main(String[] args) {
        box b1= new box();
        b1.set();
        int v = b1.cal_vol();
        System.out.println("Volume of box is: " +v);
    }
}
