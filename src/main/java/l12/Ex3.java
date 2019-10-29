package l12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        byte[] bytesToWrite = {1, 2, 3};
        byte[] bytesReaded = new byte[10];

        String fileName = "c:\\temp\\test.txt";
        FileOutputStream outputStream = null;
        FileInputStream inputStream = null;

        outputStream = new FileOutputStream(fileName);
        System.out.println("file is opened for writing...");
        outputStream.write(bytesToWrite);
        System.out.println("Wrote: " + bytesToWrite.length + " byte");
        outputStream.close();
        System.out.println("Finished out");

        inputStream = new FileInputStream(fileName);
        System.out.println("File opened for reading...");
        int bytesAvailable = inputStream.available();
        System.out.println("Ready for reading: " + bytesAvailable + " byte");
        int count = inputStream.read(bytesReaded, 0, bytesAvailable);
        System.out.println("Read: " + count + " byte");
        inputStream.close();
        System.out.println("Finished in");
    }
}
