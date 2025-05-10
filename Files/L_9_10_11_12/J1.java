/*
  
  This note will be available only on first file of each folder present in folder Java .
  Documentation aka basic notes on how to run the code is already kept in each file for each programme using (/) or //.
  Wherever author needs it to be inserted, he has inserted. So that people using these files can learn easily how to code in Java Language. Author has made these programmes as a reference using courses of Kunal Kushwaha, while himself learning Java Language for the first time.
  
  > Date Created: May 10, 2025
  > Author: Ishaan Rastogi
  > Purpose: To sort an array via bubble sort
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES - Copy paste the code below the main function and paste in leetcode.

*/

import java.util.Scanner;
import java.util.Arrays;

public class J1 {
    public static void main(String[] args) {
        
        // Input the number of elements in the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array of size n
        int nums[] = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for ( int i = 0; i < n; i++ ) {
            nums[i] = sc.nextInt();
        }

        bubbleSort(nums);
        System.out.println("The sorted array is " + Arrays.toString(nums));        
    }

    static void bubbleSort ( int[] nums ) {

        boolean swap;

        // run the loop for n-1 times
        for ( int i = 0; i < nums.length; i++ ) {
            // Done to check if the array is already sorted
            swap = false;
            // run the loop for n-i-1 times
            for ( int j = 1; j < nums.length - i - 1; j++ ) {
                // swapping the elements
                if ( nums[j] < nums [ j - 1] ) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    // Done to check if the array is already sorted
                    swap = true;
                }
            }

            if ( swap == false ) {
                break;
            }
        }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/