package Strings;

public class Q7 {
    public static String truncate(String str, int len) {
        if (str.length() <= len) return str;
        return str.substring(0, len) + "...";
    }

    public static void main(String[] args) {
        System.out.println(truncate("Hello World", 5));
    }
}