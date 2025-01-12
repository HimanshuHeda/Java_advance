package Threads_and_Swings;

class thread1 extends Thread {
    thread1(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Good Morning");
            try {
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class thread2 extends Thread {
    thread2(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Myself Himanshu Heda");
            try {
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Thread_priority {
    public static void main(String[] args) {
        thread1 t1 = new thread1("This is the program on Thread Priority");
        thread2 t2 = new thread2("Have a Look on it.");

        // Print initial thread names and priorities
        System.out.println("Thread 1 name is " + t1.getName());
        System.out.println("Thread 2 name is " + t2.getName());
        System.out.println("Thread 1 Priority is " + t1.getPriority());
        System.out.println("Thread 2 Priority is " + t2.getPriority());

        // Set new priorities
        t1.setPriority(9);
        t2.setPriority(3);

        // Start the threads
        t1.start();
        t2.start();

        try {
            // Wait for threads to complete
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Print final priorities after threads have completed
        System.out.println("Thread 1 Priority is " + t1.getPriority());
        System.out.println("Thread 2 Priority is " + t2.getPriority());
    }
}