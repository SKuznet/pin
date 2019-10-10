package l6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name = "Barsik";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        char[] result = new char[name.length()];
        result[0] = 'a';
        name.getChars(2, 4, result, 1);

//        System.out.println(result);
//        System.out.println(name.isEmpty());

        byte[] array = new byte[name.length()];
        array = name.getBytes();
        System.out.println(Arrays.toString(array));

        System.out.println(name.codePointAt(0));
        char sym = 66;

        System.out.println(sym);
    }

}
