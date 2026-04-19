package Strings;

import java.util.*;

public class StringOperations {
    public static void main(String[] args) {

        // String Creation
        String str1 = "Hello";
        String str2 = new String("World");

        // Length and Character Access
        System.out.println("Length: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // String Comparison
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("hello"));

        // String Searching
        System.out.println("Index of 'l': " + str1.indexOf('l'));
        System.out.println("Contains 'He': " + str1.contains("He"));

        // Substring
        System.out.println("Substring: " + str1.substring(1, 4));

        // String Modification
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Replace: " + str1.replace('l', 'x'));

        // Whitespace Handling
        String str3 = "   Java Programming   ";
        System.out.println("Trim: " + str3.trim());

        // Concatenation
        System.out.println("Concatenation: " + str1 + " " + str2);

        // Splitting
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("StringBuilder: " + sb);

        // Formatting
        String formatted = String.format("Name: %s, Age: %d", "John", 20);
        System.out.println("Formatted: " + formatted);

        // Email Validation
        String email = "student@aiet.edu";
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}