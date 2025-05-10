/*
  
  > Date Created: May 08, 2025
  > Author: Ishaan Rastogi
  > Purpose: To find floor of a number in a sorted array using binary search.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;
import java.util.Arrays;

public class J14 {
    public static void main(String[] args) {
        
        // Input the number of elements in the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array of size n
        int arr[] = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for ( int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
        }
        
        // Sort the array in ascending order
        Arrays.sort(arr); // We will study different sorting algorithms later.

        // Target element to be searched
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();

        // Call the binary search function to find the element in the array
        int result = floor(arr, target);
        if ( result == -1 ) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    static int floor( int arr[], int target ) {

        // If the target is less than the first element of the array
        if ( target < arr[0]) {
            System.out.println("No floor.");
        }

        int start = 0;
        int end = arr.length -1;
        while ( start <= end ) {

            // mid = ( start + end ) / 2; can lead to overflow because ( start + end ) can exceed the range of integer in java. Hence, we use the below formula. Basically, the same formula but written in a different way.
            int mid = start + ( end - start )/2;

            if ( target < arr[mid] ) {
                end = mid - 1; // target is less than mid, so we will search in the left half of the array.
            } else if ( target > arr[mid] ) {
                start = mid + 1; // target is greater than mid, so we will search in the right half of the array.
            } else {
                return mid; // the answer is found.
            }
        }
        return arr[end]; // if the element is not found in the array, then return end
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/