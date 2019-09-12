package l2;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {

        // todo think about optimization (variant with [][] index logic)
        Map<Integer, Integer[]> map = new HashMap<>();
        map.put(1, new Integer[]{1, 2, 4});
        map.put(2, new Integer[]{1, 2, 3, 5});
        map.put(3, new Integer[]{2, 3, 6});
        map.put(4, new Integer[]{1, 4, 5, 7});
        map.put(5, new Integer[]{2, 4, 5, 6, 8});
        map.put(6, new Integer[]{3, 5, 6, 9});
        map.put(7, new Integer[]{4, 7, 8});
        map.put(8, new Integer[]{0, 5, 7, 8, 9});
        map.put(9, new Integer[]{6, 8, 9});
        map.put(0, new Integer[]{0, 8});
    }
}
