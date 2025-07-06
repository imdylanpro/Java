// Dylan Nelson
// July 06, 2025
// JavaThreads.java

class ThreadOne extends Thread {

    private final Object locker;

    // Constructor so that the class has access to the locker object.
    ThreadOne(Object locker) {
        this.locker = locker;
    }

    @Override
    public void run() {
        synchronized (locker) {
            System.out.println("Beginning thread one: ");
            for (int i = 0; i <= 20; i++) {
                System.out.println("Counter one is at: " + (i+1));
            }
            System.out.println("Thread one finished!");
        }
    }
}

class ThreadTwo extends Thread {

    private final Object locker;

    // Constructor so that the class has access to the locker object.
    ThreadTwo(Object locker) {
        this.locker = locker;
    }

    @Override
    public void run() {
        // The synchronized (locker) portion locks the other thread(s) from 
        //  executing while this portion is in progress. Anything outside 
        //  it would not be locked.
        synchronized (locker) {
            System.out.println("Beginning thread two: ");
            for (int i = 20; i >= 0; i--) {
                System.out.println("Counter two is at: " + i);
            }
            System.out.println("Thread two finished!");    
        }       
    }
}

public class JavaThreads {

    public static void main(String[] args) {
        
        // Create the locking object.
        Object locker = new Object();

        // Create the threading objects, pass the locker object in so they 
        //  share the locking capability.
        ThreadOne t1 = new ThreadOne(locker);
        ThreadTwo t2 = new ThreadTwo(locker);
        
        // Scehdule both threads to begin.
        t1.start();
        t2.start();

        // This will join the program back into main. Waits for t1 and t2 
        //  to finish before proceeding.
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.err.println("Error occured when trying to join threads: " + e);
        }
    }
}