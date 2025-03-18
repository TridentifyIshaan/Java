/*

  > Date Created: March 2, 2025
  > Author: Ishaan Rastogi
  > Project Name: Customer Care Call Simulation for Vistara Airlines
  > Project Functionality: This project will simulate an IVR (Interactive synthesizer Response) system where a user navigates through different options, just like when calling customer support.
  > APIs used: FreeTTS (Text-to-Speech) API
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;
import java.util.Random;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import java.util.Locale;

public class VistaraCustomerCare {
    public static void main(String[] args) {

        System.out.println("For English, press 1");
        System.out.println("Hindi ke liye 2 dabayein\n");

        // Creating the object of Scanner class
        Scanner input = new Scanner(System.in);
        int choice, subChoice;
        Synthesizer synthesizer = null;

        try {
            // Set up speech synthesizer
            System.setProperty("freetts.voices", 
                "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");

            SynthesizerModeDesc desc = new SynthesizerModeDesc(Locale.US);
            Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
            
            synthesizer = Central.createSynthesizer(desc);
            synthesizer.allocate();
            synthesizer.resume();

            // Language selection
            String langMenu = "For English, press 1. Hindi ke liye 2 dabayein.";
            speak(synthesizer, langMenu);
            System.out.println(langMenu);
            
            // Scanning the input
            System.out.print("Press: ");
            int number1 = input.nextInt();
                
            switch (number1) {
                case 1:
                    String engMenu = "Welcome to Vistara Airlines! For flight status, press 1!" +
                    "For flight cancellation, press 2!" +
                    "To talk to a customer care executive, press 3!";
                    speak(synthesizer, engMenu);
                    System.out.println(engMenu);

                    //Scanning the input
                    System.out.print("Press: ");
                    int number2 = input.nextInt();

                    switch (number2) {
                        case 1:
                            // To generate random number between 1 and 3
                            int status = new Random().nextInt(3) +1;    
                            String eflightStatus = "Flight status is as follows: ";
                            switch (status) {
                                case 1 -> eflightStatus += "Your flight is on time!";
                                case 2 -> eflightStatus += "Your flight is delayed!";
                                case 3 -> eflightStatus += "Your flight is cancelled!";
                            }
                            speak(synthesizer, eflightStatus);
                            System.out.println(eflightStatus);
                            break;
                        case 2:
                            speak (synthesizer, "Enter your flight details. Please provide your PNR number.");
                            System.out.println("Enter your flight details: ");
                            System.out.print("Enter your PNR: ");
                            String ePNR = input.next();
                            System.out.print("Enter your flight number: ");
                            String eFlightNumber = input.next();
                            speak (synthesizer, "We will get back to you shortly!");
                            System.out.println("We will get back to you shortly!");
                            break;
                        case 3:
                            // One way to create new lines is concatenation
                            speak (synthesizer, "We are experiencing high call volumes. Please hold the line! "
                                    + "We will connect you to a customer care executive shortly.");

                            // Other way to create new lines is using \n
                            System.out.println("WE ARE EXPERIENCING HIGH CALL VOLUMES! PLEASE HOLD THE LINE! \n WE WILL CONNECT YOU TO A CUSTOMER CARE EXECUTIVE SHORTLY!");
                            break;
                    }
                    break;

                case 2:
                    String hindiMenu = "Namaste, Vistara Airlines mein aapka swagat hain! "
                    + "Udaan ki stithi ke liye 1 dabayein. " + "Udaan raddh karne ke liye 2 dabayein! "
                    + "Grahaak seva kaaryakaaree se baat karne ke liye 3 dabayein!";
                    speak(synthesizer, hindiMenu);
                    System.out.println(hindiMenu);

                    //Scanning the input
                    System.out.print("Dabayein: ");
                    int number3 = input.nextInt();

                    switch (number3) {
                        case 1:

                            // To generate random number between 1 and 3
                            int status = new Random().nextInt(3) +1;

                            String hFlightStatus = "Udaan ki stithi is prakaar hain: ";
                            switch (status) {
                                case 1 -> hFlightStatus += "Aapki udaan samay par hain!";
                                case 2 -> hFlightStatus += "Aapki udaan mei deri ho rahi hain!";
                                case 3 -> hFlightStatus += "Aapki udaan raddh kardi gayi hain!";
                            }
                            speak(synthesizer, hFlightStatus);
                            System.out.println(hFlightStatus);
                            break;
                        case 2:
                            speak(synthesizer, "Apni udaan ka vivaran darj karen.");
                            System.out.println("Apni udaan ka vivaran darj karen: ");
                            System.out.print("Apni pee en aar darj karen: ");
                            String hPNR = input.next();
                            System.out.print("Apni udaan sankhya darj karen: ");
                            String hFlightNumber = input.next();
                            speak ( synthesizer, "Hum aapse sheeghr hi sampark karte hain!");
                            System.out.println("Hum aapse sheeghr hi sampark karte hain!");
                            break;
                        case 3:
                            // 1st way
                            speak(synthesizer, "Hum uchch kol aayatan ka anubhav kar rahe hain! Kripaya kol par bane rahiye!"
                            + " Hum aapko sheeghr hee ek graahak seva kaaryakaaree se jod denge!");
                            // 2nd way
                            System.out.println("Hum uchch kol aayatan ka anubhav kar rahe hain! Kripaya kol par bane rahiye! \n Hum aapko sheeghr hee ek graahak seva kaaryakaaree se jod denge!");
                            break;
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (synthesizer != null) {
                try {
                    synthesizer.deallocate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            input.close();
        }
    }

    // Function to speak the text
    public static void speak(Synthesizer synthesizer, String text) {
        if ( synthesizer != null ) {
            try {
                synthesizer.speakPlainText(text, null);
                synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac -cp ".;freetts.jar" VistaraCustomerCare.java
  java -cp ".;freetts.jar" VistaraCustomerCare
*/