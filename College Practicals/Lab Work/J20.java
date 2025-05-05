public class J20 {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block");
            int result = 10 / 0; // This will cause ArithmeticException

            try {
                // Inner try block 1
                System.out.println("Inner try block 1");
                int[] array = new int[5];
                int value = array[10]; // This will cause ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught in inner try block 1: " + e.getMessage());
            }

            try {
                // Inner try block 2
                System.out.println("Inner try block 2");
                String str = null;
                int length = str.length(); // This will cause NullPointerException
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught in inner try block 2: " + e.getMessage());
            }

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in outer try block: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}