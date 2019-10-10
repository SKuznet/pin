package l7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex3 {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();
        Cat barsik = new Cat("barsik");
        Cat murzik = new Cat("murzik");
        set.add(barsik);
        set.add(murzik);
        System.out.println(set);
        System.out.println(set.contains(barsik));

        System.out.println(barsik.hashCode());
        // field based on hashcode
        barsik.setName("Barsik");
        System.out.println(barsik.hashCode());
        System.out.println(set.contains(barsik));
        System.out.println(set);
        set.add(barsik);
        System.out.println(set);

        Set<Cat> set2 = new HashSet<>();
        set2.add(new Cat("ads"));
        set2.addAll(set);

        System.out.println(set2);
        TreeSet

    }
}
