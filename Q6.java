package Strings;

public class Q6 {
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWords("java programming"));
    }
}