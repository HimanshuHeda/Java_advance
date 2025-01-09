package Thread;

class thread1 extends Thread {
    @Override
    public void run() {
        // Code to execute in the new thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Guys");
        }
    }
}

class thread2 extends Thread {
    @Override
    public void run() {
        // Code to execute in the new thread
        for (int i = 0; i < 5; i++) {
            System.out.println("My name is Himanshu Heda");
        }
    }
}

public class thread_creation {
    public static void main(String[] args) {
        thread1 thread = new thread1();
        thread.start(); // Starts the thread

        thread2 thread2 = new thread2();
        thread2.start(); // Starts another thread
    }
}