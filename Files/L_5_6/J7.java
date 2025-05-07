/*
  
  > Date Created: May 07, 2025
  > Author: Ishaan Rastogi
  > Purpose: To find minimum and maximum element in a 2-D array using linear search.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;


public class J7 {
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
        // function call to find the element in 2-D array
        System.out.println( "The Minimum element is " + min(arr));
        System.out.println( "The Maximum element is " + max(arr));    
    }

    // function to find the minimum element in a 2-D array
    static int min(int[][] arr) {
        int min = arr[0][0];
        for ( int i = 0; i < arr.length; i++) {
            for ( int j = 0; j < arr[i].length; j++) {
                if ( arr[i][j] < min ) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    // function to find the maximum element in a 2-D array
    static int max(int[][] arr) {
        int max = arr[0][0];
        for ( int i = 0; i < arr.length; i++) {
            for ( int j = 0; j < arr[i].length; j++) {
                if ( arr[i][j] > max ) {
                    max = arr[i][j];
                }
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