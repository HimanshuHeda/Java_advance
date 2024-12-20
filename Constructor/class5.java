class box{
    int h,b,w;
    box(int x,int y,int z){
        h=x;
        b=y;
        w=z;
}
int cal_vol(){
    return h*b*w;
}
}
class class5 {
    public static void main(String[] args) {
        box b1=new box(10,10,10);
        int v=b1.cal_vol();
        System.out.println("The  volume of the box -"+v);

        box b2=new box(2, 3, 4);
        v=b2.cal_vol();
        System.out.println("The  volume of the box -"+v);
    }
}