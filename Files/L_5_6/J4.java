/*
  
  > Date Created: May 06, 2025
  > Author: Ishaan Rastogi
  > Purpose: To search an element in a given range
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J4 {
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
        
        System.out.println("Enter the range to be searched: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Checking if the range is valid or not
        if ( a < 0 || b > n || a >= b) {
            System.out.println("Invalid range.");
            return;
        }

        // Calling the function to search in the array
        linearSearch(arr, x, a, b);
    }

    // Function to search in the array
    static void linearSearch( int arr[], int x, int a, int b) {
        // to run the for loop for each element of the array and check if the element is present in the array or not

        // Here for loop will run in the range given by the user.
        for ( int i = a; i < b; i++) {
            // Here length won't have brackets as it is a property of array, not a method.
            if ( arr[i] == x ) {
                System.out.println("Element found at index: " + i);
                return;
            }        
        }
        // if the element is not found in the array, then print this message
        System.out.println("Element not found in the array.");
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/