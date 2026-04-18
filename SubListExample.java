package pack;

import java.util.*;

public class SubListExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red","Blue","Green"));

        List<String> sub = colors.subList(0,2);
        System.out.println(sub);
    }
}