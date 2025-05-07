/*
  
  > Date Created: May 07, 2025
  > Author: Ishaan Rastogi
  > Purpose: To implement Order Agnostic Binary Search Algorithm.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES-

  Order-Agnostic Binary Search is a modified version of the traditional Binary Search algorithm. This variant is particularly useful when the order of the sorted array (ascending or descending) is not known beforehand. The algorithm determines the order of the array during the search process and adjusts its search strategy accordingly. This is achieved by comparing the first and last elements of the array to identify whether it is sorted in ascending or descending order. Based on this information, the algorithm performs the search in the appropriate half of the array.

  But since we are taking user input and then sorting via functions, we will either sort it by ascending or descending order.
  So, we will not use the order agnostic binary search algorithm. Hence, to use order agnostic binary search algorithm, we will randomize the sorting order of the array with the help of Random class.

*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class J12 {
    public static void main(String[] args) {
        // Input the number of elements in the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array of size n
        int arr[] = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Randomly decide sorting order
        Random r = new Random();
        boolean order = r.nextBoolean(); // Randomly choose the order of sorting

        if (order) {
            // Sort in ascending order
            Arrays.sort(arr);
            System.out.println("Array sorted in ascending order: " + Arrays.toString(arr));
        } else {
            // Sort in descending order
            Arrays.sort(arr);
            reverseArray(arr); // Reverse the array for descending order
            System.out.println("Array sorted in descending order: " + Arrays.toString(arr));
        }

        // Target element to be searched
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();

        // Call the binary search function to find the element in the array
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Reverse the array for descending order
    static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Binary Search implementation
    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        // Check if all elements are the same
        if (arr[start] == arr[end] && arr[start] == target) {
            return 0; // Return index 0 if all elements are the same and match the target
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            }

            // Determine sorting order dynamically
            if (arr[start] <= arr[end]) {
                // Ascending order logic
                if (target < arr[mid]) {
                    end = mid - 1; // Search in the left half
                } else {
                    start = mid + 1; // Search in the right half
                }
            } else {
                // Descending order logic
                if (target > arr[mid]) {
                    end = mid - 1; // Search in the left half
                } else {
                    start = mid + 1; // Search in the right half
                }
            }
        }

        return -1; // Element not found
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/