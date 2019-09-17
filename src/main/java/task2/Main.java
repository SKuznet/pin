package task2;

import java.util.*;

public class Main {
    int[][] array = new int[6][6];
    String[][] stopArray = new String[6][6];

    // индекс если 3 - то начало не 56,

    Map<Integer, List<String>> map = new HashMap<>();

    {
        List<String> list6 = new ArrayList<>();
        list6.add("123456");
        List<String> list5 = new ArrayList<>();
        // todo think about index
        list5.addAll(Arrays.asList("213456", "124356", "123546", "213456", "234561", "134562", "123564",
                "123465", "124563"));
    }
    //6 - 123456; - 1
    //
    //5 - 213456; - 1
    //5 - 124356; - 1
    //5 - 123546; - 1
    //5 - 213456; - 1
    //
    //5 - 234561; - 2
    //5 - 134562; - 2
    //5 - 123564; - 2
    //5 - 123465; - 2
    //5 - 124563; - 2
    //
    //4 - 321456; - 1
    //
    //4 - 123645; - 2
    //4 - 124635; - 2
    //4 - 125634; - 2
    //4 - 234615; - 2
    //4 - 345612; - 2
    //4 - 213465; - 2
    //4 - 213564; - 2
    //
    //4 - 123654; - 3
    //4 - 124653; - 3
    //4 - 125643; - 3
    //4 - 234651; - 3
    //4 - 345621; - 3
    //4 - 134652; - 3
    //4 - 135642; - 3

    public static void main(String[] args) {

    }
}
