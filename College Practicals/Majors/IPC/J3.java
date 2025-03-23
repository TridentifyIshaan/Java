package IPC;

/*
    SOLUTION:
    Synchronization on queue while adding and removing data
    On queue empty, the consumer has to wait until the producer adds new data to the queue
    When the queue is full, the producer has to wait until the consumer consumes data and the queue has some empty buffer
*/

class Que {
    int i;
    boolean flag = false; // new line
    public synchronized void get() throws InterruptedException{ // extended line
        while (!flag) { // new line
            wait(); // new line
        } // new line
        flag = false; // new line
        System.out.println("Consumer got : "+i);
        notify(); // new line
        }
    public synchronized void put(int i) throws InterruptedException{ // extended line
        while (flag) { // new line
            wait(); // new line
        } // new line
        this.i = i; // new line
        flag = true; // new line
        System.out.println("Producer put : "+i);   
        notify(); // new line
    }   
}

class Producer implements Runnable{
    // Reference to the Que object
    Que q;
    Producer(Que q){
        this.q=q;
        Thread t=new Thread(this,"Producer");
        t.start();
    }
    public void run() {
        int i=0;
        while(i<=5) {
            // extended lines
            try {
                q.put(i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }        
    }
} 

class Consumer implements Runnable{
    Que q;
    Consumer(Que q) {
        this.q=q;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }  
    public void run(){
        int i=0;
        while(i<=5) {
            // extended lines
            try {
                q.get();
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class J3 {
    public static void main(String[] args) {
        Que q=new Que();
        Producer P=new Producer(q);
        Consumer c=new Consumer(q); 
    }
}