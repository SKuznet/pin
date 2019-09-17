package task2;

public class Main2 {
    public static void main(String[] args) {

        // придумать алгоритм заполнения массива *
        // || использовать заготовку из метода main
        // int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        // попгули перебор всех вариантов массива чисел между собой (числа уникальные)
        // 123 132 312 321 213 231

        int[] arr = new int[]{6, 1, 3, 4, 5, 2};

        System.out.println("Видим башни слева " + viewTowers(arr));
        System.out.println("Видим башни справа " + viewTowers(getReverseArr(arr)));

    }

    // 123456
    // 213456
    private static int viewTowers(int[] arr) {
        int towerCount = arr.length;
        int viewCountL = 1;

        int helperIndex = 0;
        while (true) {
            if (arr[helperIndex] - arr[helperIndex + 1] < 0) {
                viewCountL++;
                helperIndex++;
            } else {
                if (getFirstLargerEl(helperIndex, arr) != helperIndex) {
                    helperIndex = getFirstLargerEl(helperIndex, arr);
                    viewCountL++;
                } else {
                    return viewCountL;
                }

            }

            if (helperIndex == arr.length - 1) {
                break;
            }
        }

        return viewCountL;
    }

    private static int getFirstLargerEl(int helperIndex, int[] arr) {
        for (int i = helperIndex; i < arr.length; i++) {
            if (arr[i] > arr[helperIndex]) {
                return i;
            }
        }

        // it's largest element 6
        return helperIndex;
    }

    private static int[] getReverseArr(int[] arr) {
        int[] helperArr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            helperArr[j] = arr[i];
            j++;
        }
        return helperArr;
    }
}
