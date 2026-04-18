package pack;

import java.util.*;

public class ListOperations {

    // 1. Adding elements
    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
    }

    // 2. Add at specific index
    public static void addAtIndex(List<String> list) {
        list.add(1, "Mango");
    }

    // 3. Add multiple elements
    public static void addMultiple(List<String> list) {
        list.addAll(Arrays.asList("Grapes", "Pineapple"));
    }

    // 4. Access elements
    public static void accessElements(List<String> list) {
        System.out.println("Element at index 2: " + list.get(2));
    }

    // 5. Update elements
    public static void updateElements(List<String> list) {
        list.set(1, "Kiwi");
    }

    // 6. Remove elements
    public static void removeElements(List<String> list) {
        list.remove("Apple");
    }

    // 7. Search elements
    public static void searchElement(List<String> list) {
        System.out.println("Contains Banana? " + list.contains("Banana"));
    }

    // 8. List size
    public static void listSize(List<String> list) {
        System.out.println("Size: " + list.size());
    }

    // 9. Iterate using for-each
    public static void iterateList(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    // 10. Using Iterator
    public static void useIterator(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // 11. Sorting
    public static void sortList(List<String> list) {
        Collections.sort(list);
    }

    // 12. Sublist
    public static void subList(List<String> list) {
        System.out.println("Sublist: " + list.subList(0, 2));
    }

    // 13. Clear list
    public static void clearList(List<String> list) {
        list.clear();
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        addElements(arrayList);
        addElements(linkedList);

        addAtIndex(arrayList);
        addMultiple(arrayList);
        accessElements(arrayList);
        updateElements(arrayList);
        removeElements(arrayList);
        searchElement(arrayList);
        listSize(arrayList);
        iterateList(arrayList);
        useIterator(arrayList);
        sortList(arrayList);
        subList(arrayList);
        clearList(arrayList);

        System.out.println("Final ArrayList: " + arrayList);
    }
}