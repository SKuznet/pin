package l6;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        String name = "Barsik";

        System.out.println(name.contains("ars"));
        System.out.println(String.copyValueOf(name.toCharArray(), 2, 3));
        System.out.println(name.startsWith("Bar"));
        System.out.println(name.startsWith("B1r"));
        System.out.println(name.endsWith("ik"));

        String name2 = "  Ba r ";
        System.out.println(name2.trim());

        System.out.println(name.substring(2, 5));

        String val = "abc,def,ghi";
        System.out.println(Arrays.toString(val.split(",")));
    }
}
