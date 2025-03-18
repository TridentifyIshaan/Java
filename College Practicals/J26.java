// Creating a thread by implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
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
        
        // Creating a Thread object and passing MyRunnable instance to it
        Thread thread = new Thread(myRunnable);
        
        // Starting the thread
        thread.start();
        
        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                // Sleep for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }
        }
    }
}