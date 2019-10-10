package l6;

public class StringEx {
    public static void main(String[] args) {
        String name = new String("Barsik");
        String name2 = new String("Barsik");

        System.out.println(name == name2);

        String name3 = "Barsik";
        String name4 = "Barsik";

        System.out.println(name3 == name4);

        // literals = "
        // pool literals == cache
        String name5 = new String("Barsik").intern();
        System.out.println(name4 == name5);
    }
}
