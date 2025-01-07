package Thread;

class thread1 implements Runnable{
    public void run(){
        int i;
        for(i=0; i<100; i++){
            System.out.println("Hello Good Morning");
            System.out.println("I am in Collage");
        }
    }
}

class thread2 implements Runnable{
    public void run(){
        int i;
        for(i=0; i<100; i++){
            System.out.println("Hi");
            System.out.println("at Home");
        }
    }
}

public class Thread_runnable {
    
}
