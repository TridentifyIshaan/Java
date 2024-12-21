/*

  > Date Created: December 21, 2024
  > Author: Ishaan Rastogi
  > Purpose: To create a customer care call from Vistara Airlines using nested switch case ( simple or enhanced switch cases)
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;
import java.util.Random;

public class J7 {
    public static void main(String[] args) {

        System.out.println("For English, press 1");
        System.out.println("Hindi ke liye 2 dabayein\n");

        // Scanning the input
        System.out.print("Press: ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
            
        switch (number1) {
            case 1:
                System.out.println("Welcome to Vistara Airlines! For flight status, press 1! \n For flight cancellation, press 2! \n To talk to a customer care executive, press 3!");

                //Scanning the input
                System.out.print("Press: ");
                int number2 = input.nextInt();

                switch (number2) {
                
                    case 1:

                        // To generate random number between 1 and 3
                        int choice = new Random().nextInt(3) +1;    

                        System.out.println("Flight status is as follows: ");
                        switch (choice) {
                            case 1 -> System.out.println("Your flight is on time!");
                            case 2 -> System.out.println("Your flight is delayed!");
                            case 3 -> System.out.println("Your flight is cancelled!");
                        }
                        break;
                    case 2:
                        System.out.println("Enter your flight details: ");
                        System.out.print("Enter your PNR: ");
                        String PNR = input.next();
                        System.out.print("Enter your flight number: ");
                        String flightNumber = input.next();
                        System.out.println("We will get back to you shortly!");
                        break;
                    case 3:
                        System.out.println("WE ARE EXPERIENCING HIGH CALL VOLUMES! PLEASE HOLD THE LINE! \n WE WILL CONNECT YOU TO A CUSTOMER CARE EXECUTIVE SHORTLY!");
                        break;
                }
                break;

            case 2:
                System.out.println("Namasate, Vistara Airlines mein aapka swagat hai! \n Udaan ki stithi ke liye 1 dabayein \n Udaan raddh karne ke liye 2 dabayein! \n Grahaak seva kaaryakaaree se baat karne ke liye 3 dabayein!");
                
                //Scanning the input
                System.out.print("Dabayein: ");
                int number3 = input.nextInt();

                switch (number3) {
                    case 1:

                        // To generate random number between 1 and 3
                        int choice = new Random().nextInt(3) +1;

                        System.out.println("Udaan ki stithi is prakaar hai: ");
                        switch (choice) {
                            case 1 -> System.out.println("Aapki udaan samay par hai!");
                            case 2 -> System.out.println("Aapki udaan mei deri ho rahi hai!");
                            case 3 -> System.out.println("Aapki udaan raddh kardi gayi hai!");
                        }
                        break;
                    case 2:
                        System.out.println("Apni udaan ka vivaran darj karen: ");
                        System.out.print("Apni pee en aar darj karen: ");
                        String PNR = input.next();
                        System.out.print("Apni udaan sankhya darj karen: ");
                        String flightNumber = input.next();
                        System.out.println("Hum aapse sheeghr hi sampark karte hai!");
                        break;
                    case 3:
                        System.out.println("Hum uchch kol aayatan ka anubhav kar rahe hain! Kripaya kol par bane rahiye! \n Hum aapko sheeghr hee ek graahak seva kaaryakaaree se jod denge!");
                        break;
                }
            }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/