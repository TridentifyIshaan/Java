/*
  
  > Date Created: May 09, 2025
  > Author: Ishaan Rastogi
  > Purpose: https://leetcode.com/problems/search-in-rotated-sorted-array ( Google, Amazon )
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

  NOTES - Again, copy paste the code below the main function and paste in leetcode.
  
*/

public class J10 {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 3)); // Output: -1
        System.out.println(search(arr, 0)); // Output: 4
    }

    // Binary Search
    static int search ( int[] nums, int target ) {
        int pivot = findPivot(nums);

        // if no pivot found, means array is not rotated
        if ( pivot == -1 ) {
            // do normal binary search
            return binarySearch(nums, target, 0, nums.length -1);
        }

        // if pivot is found, we have 2 sorted arrays
        if ( nums[pivot] == target ) {
            return pivot;
        }

        if ( target >= nums[0] ) {
            return binarySearch(nums, target, 0, pivot -1); // Searching in first half
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length -1); // Searching in second half
        }
    }

    static int binarySearch( int arr[], int target, int start, int end ) {
        while ( start <= end ) {
            int mid = start + ( end - start )/2;
            if ( target < arr[mid] ) {
                end = mid - 1;
            } else if ( target > arr[mid] ) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot ( int[] arr ) {
        int start = 0;
        int end = arr.length -1;
        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;
            
            // CASE 1
            if ( mid < end && arr[mid] > arr[mid+1] ) { // mid < end because at end, mid+1 will be out of bound | && is logical operator for AND gate
                return mid;
            }

            // CASE 2
            if ( mid > start && arr[mid] < arr[mid-1] ) {
                return mid -1;
            }
            
            // CASE 3 & 4
            if ( arr[start] >= arr[mid] ) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return -1; // no pivot found
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/