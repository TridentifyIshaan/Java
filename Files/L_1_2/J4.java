/*
  
  > Date Created: December 16, 2024
  > Author: Ishaan Rastogi
  > Purpose: To assign primitive & non-primitive datatypes, store them and print them.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner; // Importing Scanner class from java.util package
public class J4 { // Class name should be same as the file name    
    public static void main(String[] args) { //first method / function to be called by JVM
        //primitive datatypes are the datatypes which can't be further divided into more datatypes
        int rollno = 64; // 4 bytes
        char letter = 'r'; // 2 bytes
        float marks = 98.67f; // 4 bytes
        double largeDecimalNumbers = 4567.4567; // 8 bytes
        long largeInteger = 6784567890L; // 8 bytes
        boolean check = true; // 1 bit
        
        // Non-primitive datatypes
        String name = "Ishaan"; // I can divide Ishaan string into different character datatypes like I, s, h, a, a, n

        // Printing the values
        System.out.println("The roll number is " + rollno);
        System.out.println("The letter is " + letter);
        System.out.println("The marks are " + marks);
        System.out.println("The large decimal number is " + largeDecimalNumbers);
        System.out.println("The large integer is " + largeInteger);
        System.out.println("The boolean value is " + check);
        System.out.println("The name is " + name);

        // If a number is large and you don't want to forget how many zeroes are there, you use comma. Eg- 234, 000, 718 but here commas can't be used so instead you can use _ so that you don't forget how many zeroes are there. You may find it lame but it is actually a good trick to keep in mind.
        int a = 234_000_718;
        System.out.println(a);

        //Taking input from the user
        
        Scanner input = new Scanner(System.in);
        // float marks = input.nextFloat();
        // This will give an error because we have already declared marks above. So, we can't declare it again.
        float userMarks = input.nextFloat();
        System.out.println("The marks entered by the user are " + userMarks);

      }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

*/
