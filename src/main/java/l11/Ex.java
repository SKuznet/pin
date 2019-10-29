package l11;

import java.io.IOException;

public class Ex {
    public static void main(String[] args) throws IOException {
//        try {
//            System.out.println(1);
//            System.exit(0);
//        } finally {
//            System.out.println(123);
//        }

        System.out.println(getCount());

    }

    private static int getCount() {
        int count = 5;
        try {
            try {
            } catch (Exception e) {

            }
            throw new RuntimeException();
        } catch(RuntimeException e) {
            count = 10;
            return count;
        } finally {
            count = 15;
            return count;
        }
    }
}
