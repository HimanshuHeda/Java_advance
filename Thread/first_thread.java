package Thread;

class thread1 extends Thread{
    public void run(){
        int i;
        for(i=0; i<1000; i++){
            System.out.println("Hello Good Morning");
            System.out.println("I am in Collage");
        }
    }
}

class thread2 extends Thread{
    public void run(){
        int i;
        for(i=0; i<1000; i++){
            System.out.println("Hi");
            System.out.println("at Home");
        }
    }
}

public class first_thread {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}