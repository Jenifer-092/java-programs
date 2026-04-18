package pack;

public class StringOperations {
    public static void main(String[] args) {

        String str = "Hello World";

        // Length
        System.out.println("Length: " + str.length());

        // Character
        System.out.println("Char at 1: " + str.charAt(1));

        // Uppercase
        System.out.println(str.toUpperCase());

        // Lowercase
        System.out.println(str.toLowerCase());

        // Contains
        System.out.println(str.contains("World"));

        // Replace
        System.out.println(str.replace("World", "Java"));
    }
}