package Strings;

import java.util.Random;

public class StringExercises2 {

    // Q6
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    // Q7
    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    // Q8
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    // Q9
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }

    // Q10
    public static int countWords(String str) {
        if (str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWords("java programming language"));
        System.out.println(truncate("Hello World", 5));
        System.out.println(isNumeric("12345"));
        System.out.println(generateRandomString(8));
        System.out.println(countWords("Java is very easy"));
    }
}