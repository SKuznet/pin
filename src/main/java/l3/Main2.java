package l3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String[] array1 = new String[]{"1", "2", "4"};
        String[] array2 = new String[]{"2", "3", "6"};
        String[] array3 = new String[]{"1", "4", "5", "7"};
        String[] array4 = new String[]{"2", "4", "5", "6", "8"};
        int[] arr = new int[]{0, 0};

        System.out.println();



        int[][] ints = new int[1][4];
        System.out.println(Arrays.deepToString(ints));


//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length ; j++) {
//                for (int k = 0; k < array3.length ; k++) {
//                    for (int l = 0; l < array4.length; l++) {
//                        String result = array1[i] + array2[j] + array3[k] + array4[l];
//                        System.out.println(result + "");
//                    }
//                }
//            }
//        }
    }
}
