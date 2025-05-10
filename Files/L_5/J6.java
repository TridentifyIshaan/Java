/*
  
  > Date Created: May 07, 2025
  > Author: Ishaan Rastogi
  > Purpose: To find an element in a 2-D array using linear search.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;


public class J6 {
    public static void main(String[] args) {            
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array: ");
        
        // traversal of 2-D Array for input
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Input the element to search for
        System.out.println("Enter the element to search for: ");
        int x = sc.nextInt();

        // function call to find the element in 2-D array
        find(arr, x);
    }

    // function to find an element in a 2-D array
    static void find(int[][] arr, int x) {
        for ( int i = 0; i < arr.length; i++) {
            for ( int j = 0; j < arr[i].length; j++) {
                if ( arr[i][j] == x ) {
                    System.out.println("Element found at: (" + i + "," + j + ") ");
                    return;
                }
            }
        }
        // For not found case
        System.out.println("Element not found in the array.");
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/