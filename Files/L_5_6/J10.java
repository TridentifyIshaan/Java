/*
  
  > Date Created: May 07, 2025
  > Author: Ishaan Rastogi
  > Purpose: https://leetcode.com/problems/richest-customer-wealth/description/
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
    NOTES-
    
    1. It is mentioned in the problem statement that the array grid named accounts is already given in the form of 2-D array, so we don't need to ask for it or make it.
    
    Hence, we will only write the portion of the code that is written inside the static function to be written in public function.

    2. According to the problem statement, the maximum wealth of a customer, where the wealth of a customer is the sum of their accounts across all banks.

*/

import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {            
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers in each bank and number of banks: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] accounts = new int[n][m];
        System.out.println("Enter the wealth of each customer: ");
        
        // traversal of 2-D Array for input
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                accounts[i][j] = sc.nextInt();
            }
        }
        // function call to find the wealth of the richest customer
        System.out.println(maxWealth(accounts));    
    }

    // function to find the maximum element in a 2-D array
    static int maxWealth(int[][] accounts) {
        int maxWealth = accounts[0][0];
        // for each loop
        for ( int customer[] : accounts ) {

            int currentWealth = 0;

            // Calculate total wealth of the current customer
            for ( int wealth : customer ) {
                    currentWealth += wealth;
            }

            // Update maxWealth if currentWealth is greater
            if ( currentWealth > maxWealth ) {
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/