class base{
    int x;
    base(){
        System.out.println("Base Class non parameterized Constructor.");
    }
    base(int x){
        this.x=x;
        System.out.println("X = "+x);
    }
}

class derived extends base{
    int y;
    derived(){
        System.out.println("Derived Class non parameterized Constructor.");
    }
    derived(int x,int y){
        super(x);
        this.y=y;
        System.out.println("Y = "+y);
        int area= x*y;
        System.out.println("Area of Rectangle : --" +area);
    }
}


public class parameteriesed_const {
    public static void main(String[] args) {
        // base b=new base();
        base b1 = new base(5);
        derived d = new derived();
        derived d1 = new derived(3,5);
    }
}
