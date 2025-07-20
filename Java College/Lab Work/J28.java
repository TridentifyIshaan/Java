// Task 1: Print numbers from 1 to 5
class Task1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task1 - Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Task1 interrupted: " + e.getMessage());
            }
        }
    }
}

// Task 2: Print letters from A to E
class Task2 extends Thread {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Task2 - Letter: " + c);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Task2 interrupted: " + e.getMessage());
            }
        }
    }
}

// Task 3: Print a message 5 times
class Task3 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task3 - Message: Hello, World!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Task3 interrupted: " + e.getMessage());
            }
        }
    }
}

public class J28 {
    public static void main(String[] args) {
        // Creating instances of the tasks
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        
        // Starting the threads
        task1.start();
        task2.start();
        task3.start();
    }
}