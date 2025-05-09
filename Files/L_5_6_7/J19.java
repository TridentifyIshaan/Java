/*
  
  > Date Created: May 09, 2025
  > Author: Ishaan Rastogi
  > Purpose:    Hard: https://leetcode.com/problems/find-in-mountain-array/
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working BUT YOU CAN'T SUBMIT THIS CODE ON LEETCODE BECAUSE WE HAVE TO USE PROPER INTERFACE OF MOUNTAIN ARRAY AND WE WILL LEARN ABOUT INTERFACES IN JAVA LATER.

  NOTES -

  1. A mountain array is an array whose elements increase uptil a peak and then decrease. ( Condition is arr.length >= 3 )
  2. Again, copy paste the code below the main function and paste in leetcode.
  
*/

public class J19 {
    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 3, 4, 5, 3, 1};
        int target1 = 3;
        System.out.println("Output: " + search(arr1, target1));

        // Example 2
        int[] arr2 = {0, 1, 2, 4, 2, 1};
        int target2 = 3;
        System.out.println("Output: " + search(arr2, target2));
    }

    static int search(int[] arr, int target) {
        int peak = findPeak(arr);

        // Search in the ascending part of the array
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry; // Return the minimum index if found in the first half
        }

        // Search in the descending part of the array
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // Descending part of the array, move left
                end = mid;
            } else {
                // Ascending part of the array, move right
                start = mid + 1;
            }
        }
        // At the end of the loop, start == end, which is the peak index
        return start;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1; // Search in the left half
                } else {
                    start = mid + 1; // Search in the right half
                }
            } else {
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