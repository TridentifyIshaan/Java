import java.io.*;

public class J27 {
    public static void main(String[] args) {
        String data = "Hello, this is a test string.";

        // Writing data to a file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("example.txt")) {
            fos.write(data.getBytes());
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Reading data from the file using FileInputStream
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int content;
            System.out.println("File content:");
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}