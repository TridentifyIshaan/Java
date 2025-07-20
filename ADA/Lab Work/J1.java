import java.util.Arrays;

/*
  > Date Created: 20/07/2025
  > Author: Ishaan Rastogi
  > Purpose: To map out graph between Linear Search & Recursive Binary Search against the time taken to execute the code.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
*/

// Time Complexity of Linear Search: O(n)
// Time Complexity of Recursive Binary Search: O(log n)

import java.util.Arrays;
public class J1 { // Public class to encapsulate the search methods
    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        // Iterating through the array to find the target
        int i = 0;
        // For each loop - for( dataType variableName : collectionName ) {}
        for (int num : arr) {
            if (num == target) {
                return i;
            }
            i++;
        }
        return -1;
    }

    // Recursive Binary Search
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, high);
        }
    }

    // Function to measure execution time
    public static long measureTime(Runnable searchFunction) {
        long start = System.nanoTime();
        searchFunction.run();
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 50000, 100000, 200000};
        System.out.printf("%-10s %-20s %-25s\n", "Size", "Linear Search (ns)", "Binary Search (ns)");

        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = i;
            }
            int target = size - 1; // Worst case for linear, present for binary

            // Linear Search timing
            long linearTime = measureTime(() -> linearSearch(arr, target));

            // Binary Search timing (array must be sorted)
            long binaryTime = measureTime(() -> binarySearch(arr, target, 0, arr.length - 1));

            System.out.printf("%-10d %-20d %-25d\n", size, linearTime, binaryTime);
        }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  NOTE- Install Code Runner extension to run the code
  
  To Run code- Ctrl + Alt + N

  Or use the following commands in the terminal:
    > javac filename.java
    > java filename
  
*/