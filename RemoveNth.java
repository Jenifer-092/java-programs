package pack;

import java.util.*;

public class RemoveNth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red","Blue","Green"));

        int n = 1;
        colors.remove(n);

        System.out.println(colors);
    }
}