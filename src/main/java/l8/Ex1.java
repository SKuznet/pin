package l8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Barsik");
        list.add("Murzik");
        list.add("Murzik");
        list.add("Murzik");
        list.add("Murzik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");

        // NEVER DELETE ELEMENTS FROM LIST with foreach or fori
//        for (String name : list) {
//            if (name.equalsIgnoreCase("barsik")) {
//                list.remove("Barsik");
//            }
//        }

        // USE Iterator for removing element!
        // before java 8
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            if(iterator.next().equalsIgnoreCase("barsik")) {
//                iterator.remove();
//            }
//        }

        // since java 8
        list.removeIf(O -> O.equals("Barsik"));
        System.out.println(list);
    }
}
