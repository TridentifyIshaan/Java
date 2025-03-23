// Creating a thread by implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Thread.currentThread() returns a reference to the currently executing thread object
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                // Sleep for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class J26 {
    public static void main(String[] args) {
        // Creating an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();
        
        // Creating Thread objects and passing MyRunnable instance to them
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        
        // Setting thread names
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        
        // Starting the threads
        thread1.start();
        thread2.start();
    }
}