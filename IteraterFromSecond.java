package pack;

import java.util.*;

public class IteraterFromSecond{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D"));

        Iterator<String> it = list.listIterator(1);
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}