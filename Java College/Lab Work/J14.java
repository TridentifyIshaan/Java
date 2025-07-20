public class J14 {
    public static void main(String[] args) {
        // Creating a string
        String str = "Hello, World!";
        
        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length);
        
        // Character at a specific index
        char charAt = str.charAt(7);
        System.out.println("Character at index 7: " + charAt);
        
        // Substring from a specific index
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);
        
        // Substring between two indices
        String substring2 = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substring2);
        
        // Concatenation of strings
        String concat = str.concat(" How are you?");
        System.out.println("Concatenated string: " + concat);
        
        // Index of a character
        int indexOf = str.indexOf('W');
        System.out.println("Index of 'W': " + indexOf);
        
        // Index of a substring
        int indexOfSubstring = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOfSubstring);
        
        // Replace characters
        String replace = str.replace('l', 'p');
        System.out.println("String after replacing 'l' with 'p': " + replace);
        
        // Convert to uppercase
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);
        
        // Convert to lowercase
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCase);
        
        // Trim whitespace
        String strWithWhitespace = "   Hello, World!   ";
        String trimmed = strWithWhitespace.trim();
        System.out.println("Trimmed string: '" + trimmed + "'");
        
        // Check if string contains a substring
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);
        
        // Check if string starts with a prefix
        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith);
        
        // Check if string ends with a suffix
        boolean endsWith = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWith);
        
        // Split the string
        String[] split = str.split(", ");
        System.out.println("Split string: ");
        for (String s : split) {
            System.out.println(s);
        }
    }
}