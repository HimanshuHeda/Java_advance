class outer{
    int a;

    outer(int a){
        this.a =a;
    }

    void show(){
        System.out.println("The value of a is " +a);
    }

    class A{
        void display(){
            System.out.println("From inner class The value of a is " +a);
        }
    }
}

public class inner {
    public static void main(String[] args) {
        outer obj = new outer(5);
        obj.show();
        outer.A obj1=obj.new A();
        obj1.display();
    }
}
