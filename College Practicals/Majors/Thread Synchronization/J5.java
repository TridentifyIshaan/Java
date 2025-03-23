/*
   Synchronized block can be used to perform synchronization on any specific resource of the method.
   Suppose we have 50 lines of code in our method, but we want to synchronize only 5 lines, in such cases, we can use synchronized block. If we put all the codes of the method in the synchronized block, it will work same as the synchronized method.
 */

// Creating a Printer class to print the documents
class Printer{
    public void print(int no,String docname){
        for ( int i = 1; i<=no ; i++ ) {
        System.out.println("Printing document: "+docname+" "+i);
        }
    }
}
// Thread class 1
class MyThread1 extends Thread{
    Printer pref;
    MyThread1(Printer P) {
        pref=P;
    }
    public void run() {
        synchronized(pref) {
        pref.print(10, "Supriya.pdf");
        }
    }
}
// Thread class 2
class MyThread2 extends Thread{
    Printer pref2;
    MyThread2(Printer P) {
        pref2=P;
    }
    public void run() {
        synchronized(pref2) {
        pref2.print(10, "Raheja.pdf");  
        }
    }
}

public class J5 {
    public static void main(String[] args) {
        // Printer object to set reference
        Printer obj=new Printer();
        // Thread objects
        MyThread1 t1=new MyThread1(obj);   
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}