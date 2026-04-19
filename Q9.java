package Strings;

import java.util.Random;

public class Q9 {
    public static String generateRandomString(int len) {
        String chars = "ABCabc123";
        Random r = new Random();
        String result = "";

        for (int i = 0; i < len; i++) {
            result += chars.charAt(r.nextInt(chars.length()));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateRandomString(6));
    }
}
