package pack;
import java.util.*;

public class DisplayPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C"));

        for(int i=0;i<list.size();i++){
            System.out.println("Index " + i + ": " + list.get(i));
        }
    }
}