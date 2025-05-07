/*
  
  > Date Created: May 07, 2025
  > Author: Ishaan Rastogi
  > Purpose: To find the minimum and maximum element in an array using linear search.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;


public class J5 {
    public static void main(String[] args) {            
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for ( int i =0; i < n; i++ ) {
            arr[i] = sc.nextInt();
        }
        System.out.println( "The Minimum element is " + min(arr));
        System.out.println( "The Maximum element is " + max(arr));
    }

    // function to find the minimum element in an array
    static int min( int[] arr ) {
        int min = arr[0];
        for ( int i = 1; i < arr.length; i++ ) {
            if ( arr[i] < min ) {
                min = arr[i];
            }
        }
        return min;
    }

    // function to find the maximum element in an array
    static int max ( int[] arr ) {
        int max = arr[0];
        for ( int i = 1; i < arr.length; i++ ) {
            if ( arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/