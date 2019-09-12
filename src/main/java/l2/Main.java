package l2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();
        Cat barsik = new Cat("Barsik");
        Cat murzik = new Cat("Murzik");

        set.add(barsik);
        set.add(murzik);

        System.out.println(set);
    }
}
