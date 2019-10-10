package l6;

import java.util.Objects;

public class Ex2 {
    public static void main(String[] args) {
        String name1 = "barsik";

        String name2 = new String("Barsik");

        System.out.println(Objects.equals(name1, name2));
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name1.compareTo(name2));
        System.out.println(name1.compareToIgnoreCase(name2));

        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());

        char[] array = new char[name1.length()];
        array = name1.toCharArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
