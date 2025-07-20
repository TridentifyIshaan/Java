public class J15 {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello, World!");
        
        // Append a string
        sb.append(" How are you?");
        System.out.println("After append: " + sb);
        
        // Insert a string at a specific index
        sb.insert(7, "Java ");
        System.out.println("After insert: " + sb);
        
        // Replace a part of the string
        sb.replace(7, 11, "C++");
        System.out.println("After replace: " + sb);
        
        // Delete a part of the string
        sb.delete(7, 11);
        System.out.println("After delete: " + sb);
        
        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // Set the length of the string
        sb.setLength(5);
        System.out.println("After setLength: " + sb);
        
        // Ensure capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity: " + sb.capacity());
        
        // Get the length of the string
        int length = sb.length();
        System.out.println("Length: " + length);
        
        // Get the character at a specific index
        char charAt = sb.charAt(2);
        System.out.println("Character at index 2: " + charAt);
        
        // Set the character at a specific index
        sb.setCharAt(2, 'X');
        System.out.println("After setCharAt: " + sb);
        
        // Get the substring from a specific index
        String substring = sb.substring(2);
        System.out.println("Substring from index 2: " + substring);
        
        // Get the substring between two indices
        String substring2 = sb.substring(1, 3);
        System.out.println("Substring from index 1 to 3: " + substring2);
    }
}