package l8;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Barsik");
        list.add("Murzik");
        list.add("Barsik");
        list.add("Murzik");
        list.add("Barsik");
        list.add("Murzik");

        System.out.println(list.indexOf("Barsik"));
        System.out.println(list.lastIndexOf("Barsik"));
        list.listIterator();

        List<String> list2 = list.subList(3, 5);
        System.out.println(list2);

        ArrayList list1 = new ArrayList();
        list1.ensureCapacity(55);
        list1.trimToSize();

        list1.addAll(list);
    }
}
