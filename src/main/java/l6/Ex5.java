package l6;

public class Ex5 {
    public static void main(String[] args) {
        String name = "Ba" + "rs" + "ik";
        StringBuffer buffer = new StringBuffer();
        buffer.append("Ba");
        buffer.append("rs").append("ik");

        System.out.println(buffer.toString());

        // non-thread safe - quick
        StringBuilder builder = new StringBuilder();
        builder.append("Bar").append("sik");
        System.out.println(builder.toString());

        System.out.println(builder.reverse());

        char[] chars = name.toCharArray();
        for (int i = name.length() - 1; i >=0 ; i--) {
//            System.out.print(name.charAt(i));
            System.out.print(chars[i]);
        }
    }
}
