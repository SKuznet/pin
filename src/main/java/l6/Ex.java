package l6;

import l5.Barsik;

public class Ex {
    public static void main(String[] args) {
        Byte b1 = -128;
        Byte b2 = 127;

        Short s1 = -1;
        Short s2 = -128;

        Barsik barsik = new Barsik();
        Barsik barsik2 = new Barsik();
        // идентичность объектов - проверяем является ли этот объект тем же самым объектом
        System.out.println(s1 == s2);
        System.out.println();

    }

}
