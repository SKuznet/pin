package l11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(".in"));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        try(BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in))){
//            System.out.println(reader2.readLine());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
