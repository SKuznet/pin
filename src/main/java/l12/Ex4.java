package l12;

import java.io.*;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        String tmp = "adadasdadqofqbgubq[gubqa[guioqbf";
        int length = tmp.length();
        char[] chars = new char[length];

        tmp.getChars(0, length, chars, 0);
        CharArrayReader input1 = new CharArrayReader(chars);
        CharArrayReader input2 = new CharArrayReader(chars, 0, 5);

        int i;

        System.out.println("Input1 is: ");
        while ((i = input1.read()) != -1) {
            System.out.print((char) i);
        }

        System.out.println();
        System.out.println("input2 is: ");
        while ((i = input2.read()) != -1) {
            System.out.print((char) i);
        }

        System.out.println();
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("outfile"), "UTF8"));
        out.write("asfdd");
        out.close();
    }
}
