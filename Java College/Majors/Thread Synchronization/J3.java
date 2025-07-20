// Synchronisation using method

// Creating a Printer class to print the documents
class Printer{
    // synchronized method
    synchronized public void print(int no,String docname){
        for ( int i = 1; i<=no ; i++ ) {
        System.out.println("Printing document: "+docname+" "+i);
        }
    }
}
// Thread class 1
class MyThread1 extends Thread{
    //reference to the printer object
    Printer pref;
    // Constructor
    MyThread1(Printer P){
        pref=P;
    }
    // Run method
    public void run(){
        pref.print(10, "Supriya.pdf");
    }
}
// Thread class 2
class MyThread2 extends Thread{
    // Reference to the printer object
    Printer pref2;
    // Constructor
    MyThread2(Printer P)
    {
        pref2=P;
    }
    // Run method
    public void run()
    {
        pref2.print(10, "Raheja.pdf");   
    }
}

public class J3 {
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