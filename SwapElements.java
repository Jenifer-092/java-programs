package pack;

import java.util.*;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C"));

        Collections.swap(list,0,2);
        System.out.println(list);
    }
}