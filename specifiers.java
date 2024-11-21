class Class1 {
    public int a = 10;
    private int b;

    void setB(int i) {
        b = i;
    }

    int getB() {
        return b;
    }
}

public class specifiers {
    public static void main(String[] args) {
        Class1 obj = new Class1(); // Create an instance of Class1
        obj.setB(5); // Set the value of b

        System.out.println("The value of a is: " + obj.a);
        System.out.println("The value of b is: " + obj.getB());
        System.out.println("The sum of A and B is: " + (obj.a + obj.getB()));
    }    
}