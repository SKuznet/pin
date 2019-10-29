package l12;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        byte[] bytes = {1, -1, 0};

        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        System.out.println(inputStream.read());
        System.out.println((byte)inputStream.read());
        System.out.println(inputStream.read());
//        int read = inputStream.read();
//
//        System.out.println((byte) read);
//
//        By

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(10);
        outputStream.write(11);
        byte[] bytes1 = outputStream.toByteArray();
        System.out.println(Arrays.toString(bytes1));
    }
}
