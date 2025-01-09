package Thread;

class Thread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Its a beautiful day");
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enjoy the day");
        }
    }
}

public class thread_interface {
    public static void main(String[] args) {
        // Create instances of Runnable
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        // Create Thread objects and pass the Runnable instances
        Thread thread1 = new Thread(t1, "Thread-1");
        Thread thread2 = new Thread(t2, "Thread-2");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}