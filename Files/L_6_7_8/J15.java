/*
  
  > Date Created: May 10, 2025
  > Author: Ishaan Rastogi
  > Purpose: To search an element in a 2D matrix using binary search
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;
import java.util.Arrays;

public class J15 {
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

        int[] result = search(matrix, target);
        System.out.println("The element is found at index " + Arrays.toString(result));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            }
            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[] { -1, -1 }; // Not found
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/