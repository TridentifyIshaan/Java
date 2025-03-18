// Q19 Write a Java Program that correctly implements the producer – consumer problem using the concept of interthread communication.

/*
    1. SharedResource Class: This class represents the shared resource between the producer and consumer. It contains synchronized methods for producing and consuming data.
    
    2. Producer Class: This class implements the Runnable interface and represents the producer thread. It produces data and adds it to the shared resource.
    
    3. Consumer Class: This class implements the Runnable interface and represents the consumer thread. It consumes data from the shared resource.
    
    4. Main Class J37: This is the main class containing the main method, which is the entry point of the program. It creates instances of the producer and consumer threads and starts them.
*/

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