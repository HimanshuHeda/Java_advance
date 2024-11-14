// Pass object as a parameter add the instance variables of 2 objects and display the result

class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalto(Test obj) {
        return obj.a == a && obj.b == this.b;
    }

    // Method to add instance variables of two Test objects
    void addAndDisplay(Test obj) {
        int sumA = this.a + obj.a;
        int sumB = this.b + obj.b;
        System.out.println("Sum of a: " + sumA);
        System.out.println("Sum of b: " + sumB);
    }
}

public class passadd {
    public static void main(String[] args) {
        Test obj1 = new Test(10, 20);
        Test obj2 = new Test(10, 20);
        Test obj3 = new Test(5, 5);

        System.out.println("Obj1 == obj2: " + obj1.equalto(obj2));
        System.out.println("Obj1 == obj3: " + obj1.equalto(obj3));

        // Call the addAndDisplay method to add instance variables of obj1 and obj2
        System.out.println("Adding obj1 and obj2:");
        obj1.addAndDisplay(obj2);

        // Call the addAndDisplay method to add instance variables of obj1 and obj3
        System.out.println("Adding obj1 and obj3:");
        obj1.addAndDisplay(obj3);
    }
}