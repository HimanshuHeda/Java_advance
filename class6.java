class box{
    int h,b,w;
    box(int h, int b, int w){
        this.h = h;
    }
}

class box{
    int cal_vol(){
        return h*b*w;
    }
}
public class class6 {
    public static void main(String[] args) {
        box b1 = new box(10, 20, 30);
        box b2 = new box(5,7);
        box b3 = new box(10);

        int v=b1.cal_vol();
        System.out.println("The volume of box b1 is : " +v);

        int v=b2.cal_vol();
        System.out.println("The volume of box b2 is : " +v);

        int v=b3.cal_vol();
        System.out.println("The volume of box b3 is : " +v);
        
    }
}
