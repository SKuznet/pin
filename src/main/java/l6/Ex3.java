package l6;

public class Ex3 {
    public static void main(String[] args) {
        String name = "Barasaika";

        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));

        System.out.println(name.codePointAt(1));
        System.out.println(name.lastIndexOf(97));

        System.out.println(name.indexOf("a", 4));

        // recommend
        System.out.println(name.replace("a", ""));
//         non-recommend
        System.out.println(name.replaceAll("a", ""));
        System.out.println(name.replaceFirst("a", "b"));
    }
}
