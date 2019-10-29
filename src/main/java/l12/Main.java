package l12;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // in
        // out

        // text-streams 16bit symbol unicode I am barsik
        // binary-streams 8bit info [01101100][11101101]

        // open
        // working
        // close !!!

//        PrintWriter writer = null;
//        try {
//            // open stream
//            FileWriter out = new FileWriter("text.txt");
//
//            // придание потоковому объекту требуемых свойств
//            BufferedWriter bufferedWriter = new BufferedWriter(out);
////            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt"));
//
//            writer = new PrintWriter(bufferedWriter);
//
//            writer.println("I am a sentence in a text file");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (writer!= null) {
//                writer.close();
//            }
//        }

        try (PrintWriter writer1 = new PrintWriter(new BufferedWriter(new FileWriter("text.txt")))) {
            writer1.println("I am a sentence in a text file with try");
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(new FileReader("asdasd"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int next = scanner.nextInt();
        }
    }
}
