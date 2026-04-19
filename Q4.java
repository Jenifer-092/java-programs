package Strings;

public class Q4 {
    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String rev = new StringBuilder(clean).reverse().toString();
        return clean.equals(rev);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam"));
    }
}
