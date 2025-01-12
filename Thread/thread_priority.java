package Thread;
class MyThread1 extends Thread{
    public void run(){
        int i;
        for(i=0; i<1000; i++){
            System.out.println("Hello Good Morning");
            System.out.println("I am in Collage");
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i;
        for(i=0; i<1000; i++){
            System.out.println("Hi");
            System.out.println("at Home");
        }
    }
}

public class thread_priority {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }    
}
