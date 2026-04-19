package Strings;

public class StringExercises1 {

    // Q1
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    // Q2
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0, index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    // Q3
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Q4
    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    // Q5
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("   "));
        System.out.println(countOccurrences("hello hello", "hello"));
        System.out.println(reverseString("Java"));
        System.out.println(isPalindrome("Madam"));
        System.out.println(removeWhitespace("Java Programming"));
    }
}