/*
  
  > Date Created: May 09, 2025
  > Author: Ishaan Rastogi
  > Purpose: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

  NOTES - Again, copy paste the code below the main function and paste in leetcode.
  
*/

public class J11 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 3)); // Output: false
        System.out.println(search(arr, 0)); // Output: true
    }

    static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If no pivot is found, the array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1) != -1;
        }

        // If pivot is found, we have two sorted arrays
        if (nums[pivot] == target) {
            return true;
        }

        // Search in the first half
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1) != -1;
        }

        // Search in the second half
        return binarySearch(nums, target, pivot + 1, nums.length - 1) != -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // CASE 1: Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // CASE 2: Check if mid-1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // CASE 3: Handle duplicates (skip duplicates)
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                // Check if start is the pivot
                if (start < end && start + 1 < arr.length && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check if end is the pivot
                if (end > start && end - 1 >= 0 && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // CASE 4: Left side is sorted, pivot must be in the right side
            else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            // CASE 5: Right side is sorted, pivot must be in the left side
            else {
                end = mid - 1;
            }
        }

        return -1; // No pivot found
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/