package pack;
import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red","Blue","Green"));

        Collections.sort(colors);
        System.out.println(colors);
    }
}