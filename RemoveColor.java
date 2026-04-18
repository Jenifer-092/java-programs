package pack;
import java.util.*;

public class RemoveColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red","Blue","Green"));

        colors.remove(1); // remove 2nd element
        colors.remove("Blue");

        System.out.println(colors);
    }
}