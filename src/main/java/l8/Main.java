package l8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Barsik");
        list.add("Murzik");

        System.out.println(list.get(1));
        System.out.println(list.size());
        list.set(1, "Snegok");
        list.add(1, "Snegok2");
        System.out.println(list);

//        List<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(2);
//
//        System.out.println(list2.get(1));
////        Vector
////        Stack
////        ArrayList
//        Object[] arrayList = new Object[10];
////        LinkedList
    }
}
