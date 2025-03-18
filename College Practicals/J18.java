public class J18 {
    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            int result = 10 / 0; // This will cause ArithmeticException
            int[] array = new int[5];
            int value = array[10]; // This will cause ArrayIndexOutOfBoundsException
            String str = null;
            int length = str.length(); // This will cause NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}