class Overloading{
    void func(){
        System.out.println("Method with no parameters.");
    }

    void func(int a){
        System.out.println("Method with one parameter.");
    }
    
    void func(double b){
        System.out.println("Method with one parameter.");
    }

    void func(int a, int b){
        System.out.println("Method with two parameters.");
        int area = a*b;
        System.out.println("Area = "+area);
    }
}

public class mtd_overloading {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.func();
        obj.func(10);
        obj.func(10, 20);
    }
}
