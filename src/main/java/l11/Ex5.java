package l11;

import java.io.*;
import java.util.Objects;

public class Ex5 {
    public static void main(String[] args) {
        File file = new File("1.txt");
        FileReader reader = null;
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                Objects.requireNonNull(reader).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try(FileReader reader2 = new FileReader(file)){

        } catch (IOException e) {

        }
    }
}
