class Test{
    int a,b;
    Test(int i,int j){
        a=i;
        b=j;
    }
    boolean equalto(Test obj){
        if(obj.a==a && obj.b == this.b)
        return true;
        else
        return false;
    }
    
}

public class passobj {
    public static void main(String[] args) {
        Test obj1=new Test(10,20);
        Test obj2=new Test(10,20);
        Test obj3=new Test(5,5);
        System.out.println("Obj1 == obj2 "+ obj1.equalto(obj2));
        System.out.println("Obj1 == obj3 "+ obj1.equalto(obj3));
    }
}

