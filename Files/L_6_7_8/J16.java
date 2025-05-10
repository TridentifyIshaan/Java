/*
  
  > Date Created: May 10, 2025
  > Author: Ishaan Rastogi
  > Purpose: To search an element in a 2D matrix which is sorted rowwise entirely using binary search ( Microsoft )
  [ Leetcode link - https://leetcode.com/problems/search-a-2d-matrix/ ]
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the matrix: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();

        System.out.println(searchMatrix(matrix, target));
    }

    static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // matrix[0] is the first row of the matrix and it's length is the number of columns

        int start = 0; // First row
        int end = rows - 1; // Last row

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2; // middle row
            // When target is greater than the last element of the mid row
            if ( target > matrix[mid][cols - 1] ) {
                start = mid + 1; // Move first row to middle row + 1
            } else if ( target < matrix[mid][0] ) {
                end = mid - 1; // Move last row to middle row - 1
            } else {
                return binarySearch(matrix[mid], target); // Call binary search on the mid row   
            }
        }
        return false;
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/