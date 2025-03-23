/*
    Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with each other.
    Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed.
    It is implemented by following methods of Object class:
    wait() - to pause the current thread
    notify() - to wake current thread
    notifyAll() - to wake all threads
*/

package IPC;

// Bank Management System

// Creating a customer class to withdraw and deposit money
class customer{
    // Initial amount
    int amount=5000;
    // method to withdraw money
    synchronized public void withdraw(int money){
        System.out.println("Withdraw Process");
        if(amount<money){
            // to check if amount is less than money to withdraw
            try{
            wait(); // wait is a method of Object class which is used to pause the current thread execution
            } catch(Exception e) {
                System.out.println(e);
            }
        }
        // Withdraw money
        amount-=money;
        System.out.println("Withdraw completed");
        System.out.println("Updated balance : "+amount);
    }

    // method to deposit money
    synchronized public void deposit(int money){
        System.out.println("Deposit Process");
        // Deposit money
        amount+=money;
        System.out.println("Deposit completed");
        System.out.println("Updated balance : "+amount);
        notify(); // notify is a method of Object class which is used to resume the paused thread
    }
}

// Thread class 1 to withdraw money
class Thread1 extends Thread{
    // Reference to the customer object
    customer c;
    // Constructor
    Thread1(customer c){
        this.c=c;
    }
    // Run method to withdraw money
    public void run(){
        c.withdraw(1000);
    }
}

// Thread class 2 to deposit money
class Thread2 extends Thread{
    customer c;
    Thread2(customer c){
        this.c=c;
    }
    // Run method to deposit money
    public void run(){
        c.deposit(1000);
    }
}

public class J1 {
    public static void main(String[] args) {
        customer c= new customer();
        Thread1 t1=new Thread1(c);
        Thread2 t2=new Thread2(c);
        t1.start();
        t2.start();     
    }        
}