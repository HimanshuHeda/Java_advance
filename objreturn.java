class Number{
    int a,b;

    Number(int a, int b){
        this.a = a;
        this.b = b;
    }

    void add(Number obj){
        int sumA = this.a + obj.a;
        int sumB = this.b + obj.b;
        System.out.println("Sum of a values : " + sumA);
        System.out.println("Sum of a values : " + sumB);
    }
}

public class objreturn{
    public static void main(String[] args) {
        Number num1 = new Number(10, 20);
        Number num2 = new Number(30, 40);
        
        num1.add(num2);
    }
}