package l8;

import java.util.LinkedList;

public class Ex3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("barsik");
        linkedList.add("murzik");
        linkedList.add(1, "Yuki");

        linkedList.addFirst("snegok");
        linkedList.addLast("snegok");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

    }
}
