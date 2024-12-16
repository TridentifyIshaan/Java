/*
  
  This note will be available only on first file of each folder present in folder Java .
  Documentation aka basic notes on how to run the code is already kept in each file for each programme using (/) or //.
  Wherever author needs it to be inserted, he has inserted. So that people using these files can learn easily how to code in Java Language. Author has made these programmes as a reference using courses of Kunal Kushwaha, while himself learning Java Language for the first time.
  
  > Date Created: December 16, 2024
  > Author: Ishaan Rastogi
  > Purpose: To print Hello World in Java & Understand the basic structure of Java
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES-
  
  1. Name of the file should be the name of the only public class present in the file.
  2. Java is case sensitive language.
  3. Java is a strongly typed language, so we need to define the type of variable. ( LATER IN THE COURSE)
  4. It's a convention to start the name of the class with a capital letter but not a hard fast rule, it's a good practice to follow the conventions.
  5. Java is a platform independent language, it's a WORA language (Write Once Run Anywhere).
  6. Latest Java version available is Java 21.  

*/

public class Main { // Class name should be same as the file name    
    public static void main(String[] args) { //first method / function to be called by JVM
        System.out.println("Hello World!"); // It will print Hello World
    }
}

// Static- It means that the method belongs to the class and not an instance of the class (object). In literal words, we want to call the method without creating an object of the class.
// String[] args- It is used to store command line arguments. We will learn about it later in the course. It's an array of type String.

/*
  
  For Terminal Code... Ctrl + Shift + `
  NOTE- Install Code Runner extension to run the code
  
  To Run code- Ctrl + Alt + N

  Or use the following commands in the terminal:
    > javac filename.java
    > java filename
  
*/