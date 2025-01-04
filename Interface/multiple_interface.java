package Interface;

interface animal{
    void eat();
    default void make_sound(){
        System.out.println("Animal makes a sound"); 
    }
} 

interface bird{
    void fly();
    default void make_sound(){
        System.out.println("Bird makes a sound");
    }
}

class Sparrow implements animal, bird {
    public void eat() {
        System.out.println("Sparrow is eating");
    }
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void make_sound() {
        animal.super.make_sound();      // Calling Animal's default method
        bird.super.make_sound();        // Calling Bird's default method
        System.out.println("Sparrow chirps");
    }
}

public class multiple_interface {
    public static void main(String[] args) {
        Sparrow sp = new Sparrow();
        sp.eat();
        sp.fly();
        sp.make_sound();
    }
}


