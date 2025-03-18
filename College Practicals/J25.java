// Creating a thread by extending the Thread class
class MyThread extends Thread {
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

public class J25 {
    public static void main(String[] args) {
        // Creating an instance of MyThread
        MyThread thread = new MyThread();
        
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