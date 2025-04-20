class SharedResource {
    private int data;
    private boolean isProduced = false;

    // Synchronized method for producing data
    public synchronized void produce(int value) {
        while (isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        data = value;
        isProduced = true;
        System.out.println("Produced: " + data);
        notify();
    }

    // Synchronized method for consuming data
    public synchronized void consume() {
        while (!isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("Consumed: " + data);
        isProduced = false;
        notify();
    }
}

class Producer implements Runnable {
    private final SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private final SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            resource.consume();
        }
    }
}

public class J37 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}