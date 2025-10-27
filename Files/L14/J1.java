/*
  
  This note will be available only on first file of each folder present in folder Java .
  Documentation aka basic notes on how to run the code is already kept in each file for each programme using (/) or //.
  Wherever author needs it to be inserted, he has inserted. So that people using these files can learn easily how to code in Java Language. Author has made these programmes as a reference using courses of Kunal Kushwaha, while himself learning Java Language for the first time.
  
  > Date Created: Oct 27, 2025
  > Author: Ishaan Rastogi
  > Purpose: Patterns in Java
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES - Copy paste the code below the main function and paste in leetcode.

*/

public class J1 {
    public static void main(String[] args) {
        int n = 4;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);
        System.out.println();
        pattern7(n);
        System.out.println();
        pattern8(n);
        System.out.println();
        pattern9(n);
        System.out.println();
        pattern10(n);
        System.out.println();
        pattern11(n);
        System.out.println();
        pattern12(n);
        System.out.println();
        //pattern13(n);
        System.out.println();
        //pattern14(n);
        System.out.println();
        //pattern15(n);
        System.out.println();
        //pattern16(n);
        System.out.println();
        //pattern17(n);
        System.out.println();
        //pattern18(n);
        System.out.println();
        //pattern19(n);
        System.out.println();
        //pattern20(n);
        System.out.println();
        //pattern21(n);
        System.out.println();
        //pattern22(n);
        System.out.println();
        //pattern23(n);
        System.out.println();
        //pattern24(n);
        System.out.println();
        //pattern25(n);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for ( int row = 1; row <= n; row++) {
            for ( int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for ( int row = 1; row <= n; row++) {
            for ( int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            if ( row <= n ) {
                // upper half
                for ( int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {
                // lower half - decreasing
                for ( int col = 1; col <= 2*n - row; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = n; row >= 1; row--) {
            // for every row, run the col
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = n; row >= 1; row--) {
            // for every row, run the col
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = n; row >= 1; row--) {
            // for every row, run the col
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = n; row >= 1; row--) {
            // for every row, run the col
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // when one row is printed, we need to add a new line
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern13(int n) {
        // upper half including middle row
        for (int row = 1; row <= n; row++) {
            // leading spaces
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            if (row == 1) {
                System.out.println("*");
            } else {
                System.out.print("*");
                for (int s = 1; s <= 2 * row - 3; s++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        // lower half excluding middle row
        for (int row = n - 1; row >= 1; row--) {
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            if (row == 1) {
                System.out.println("*");
            } else {
                System.out.print("*");
                for (int s = 1; s <= 2 * row - 3; s++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }

}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/