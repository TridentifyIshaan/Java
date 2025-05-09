/*
  
  This note will be available only on first file of each folder present in folder Java .
  Documentation aka basic notes on how to run the code is already kept in each file for each programme using (/) or //.
  Wherever author needs it to be inserted, he has inserted. So that people using these files can learn easily how to code in Java Language. Author has made these programmes as a reference using courses of Kunal Kushwaha, while himself learning Java Language for the first time.
  
  > Date Created: May 06, 2025
  > Author: Ishaan Rastogi
  > Purpose: To search an element in an array using linear search algorithm.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {            
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        if ( n == 0 ) {
            System.out.println("Array is empty.");
            return;
        }

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for ( int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int x = sc.nextInt();
        linearSearch(arr, x);        
    }

    // Function to search in the array
    static void linearSearch( int arr[], int x) {
        // to run the for loop for each element of the array and check if the element is present in the array or not
        for ( int i = 0; i < arr.length; i++) {
            // Here length won't have brackets as it is a property of array, not a method.
            if ( arr[i] == x ) {
                System.out.println("Element found at index: " + i);
            } else {
                // if the element is not found in the array, then print this message
                System.out.println("Element not found in the array.");
            }
        }
        
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/