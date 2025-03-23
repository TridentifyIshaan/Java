package IPC;

/*
    The producer-consumer problem (also known as the bounded-buffer problem) is a classic example of a multi-process synchronization problem.
    The problem describes two processes, the producer and the consumer, which share a common, fixed-size buffer used as a queue.
    In this problem, we need two threads, Thread t1 (produces the data) and Thread t2 (consumes the data). However, both the threads shouldn’t run simultaneously.
*/

class Que{
    int i;
    public synchronized void get(){
        System.out.println("Consumer got : "+i);     
    }
    public synchronized void put(int i){
        System.out.println("Producer put : "+i);   
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
            q.put(i++);  
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
            q.get();
            i++;
        }
    }
} 

public class J2 {
    public static void main(String[] args) {
        Que q=new Que();
        Producer P=new Producer(q);
        Consumer c=new Consumer(q); 
    }
}