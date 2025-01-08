package Thread;

class common{
    int x = 0;
    public synchronized void increment(){
        x++;
    }

    public int getCount(){
        return x;
    }
}

class thread1 extends Thread{
    common obj;
    thread1(common obj){
        this.obj = obj;
    }

    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            obj.increment();
        }
    }
}

public class synchronization_thread {
    public static void main(String[] args) {
        common obj = new common();
        thread1 t1 = new thread1(obj);
        thread1 t2 = new thread1(obj);

        t1.start();
        t2.start();

        // wait for both threads to finish 
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(obj.getCount());        
    }
}
