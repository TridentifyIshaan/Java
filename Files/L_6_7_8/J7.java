/*
  
  > Date Created: May 08, 2025
  > Author: Ishaan Rastogi
  > Purpose: Find position of an element in a sorted array of infinite numbers. ( Amazon Question)
  [ Leetcode link: https://leetcode.com/problems/search-in-a-sorted-array-of-unknown-size/ ]
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES - 
  
  In Java, you cannot create a truly infinite array because memory is finite. However, you can simulate an infinite array by assuming that the array is conceptually infinite and only accessing elements as needed.

  We will use finite array and image that it is infinite which means we can't use length function since it's infinite array. That means we also don't know its start and end.

*/

public class J7 {
    public static void main(String[] args) {
        // Not taking user input for this question.
        int [] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;

        System.out.println("Position of an elemnt in a sorted array of infinite numbers is " + findRange(arr, target));
    }
    
    // Method of indices of the array.
    static int findRange ( int arr[], int target ) {
        // Start with box of 2
        int start = 0;
        int end = 1;

        // Check if the target is present in the box of 2.
        while ( target > arr[end] ) {
            // Double the box size.
            int newStart = end + 1;
            // Whenever we do differnece between terminals, we add 1.
            int newEnd = end + (end - start + 1)*2;

            // Updating after the use of old ones is finished.
            start = newStart;
            end = newEnd;
        }
        return binarySearch ( arr, target, start, end );
    }

    static int binarySearch( int arr[], int target, int start, int end ) {
        
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
        return -1; // if the element is not found in the array, then return -1.
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/