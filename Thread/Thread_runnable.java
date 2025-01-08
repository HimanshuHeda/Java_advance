package Thread;

class Thread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            System.out.println("at Home");
        }
    }
}

class Thread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            System.out.println("at Work");
        }
    }
}

public class Thread_runnable {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread mainobj1 = new Thread(t1);

        Thread2 t2 = new Thread2();
        Thread mainobj2 = new Thread(t2);

        mainobj1.start();
        mainobj2.start();
    }
}
