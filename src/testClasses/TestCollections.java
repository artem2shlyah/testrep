package testClasses;

import java.util.*;

public class TestCollections {

    public static void startMapCollections() {
        Map mapCollection = new HashMap();
        mapCollection.putIfAbsent("1", "frst element in hashMap");
        mapCollection.putIfAbsent("2", "scnd element in hashMap");
        mapCollection.putIfAbsent("3", "thrd element in hashMap");
        mapCollection.putIfAbsent("4", "fourth element ih hashMap");

        System.out.println("Начальные значения HashMap:");
        for (Object i : mapCollection.entrySet()) {
            System.out.print(i + " ");
        }
        System.out.println();

        mapCollection.put("2", "new scnd element in hashMap");
        System.out.println("После добавления элемента с существующим ключом значения HashMap:");
        for (Object i : mapCollection.entrySet()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void startSetCollections() {
        Set setCollection = new HashSet();
        setCollection.add("frst element in HashSet");
        setCollection.add("scnd element in HashSet");
        setCollection.add("thrd element in HashSet");

        System.out.println("Элементы в коллекции HashSet (необязательно упорядоченные):");
        for (Iterator it = setCollection.iterator(); it.hasNext(); ) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
        System.out.println("Пытаемся записать элемент, который уже есть в Set-e");
        System.out.println(setCollection.add("scnd element in HashSet"));

    }

    public static void startListCollections() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("frst");
        linkedList.add("scnd");
        linkedList.add("thrd");
        linkedList.add("fourth");
        linkedList.add("fifth");

        for (Object o : linkedList) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println(linkedList.get(2));
    }

}
