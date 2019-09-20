package l4;

public class Main {
    private static int[] top = new int[6];
    private static int[] right = new int[6];
    private static int[] bottom = new int[6];
    private static int[] left = new int[6];

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // Scanner scanner = new Scanner(System.in);
        // String input = scanner.nextLine();
//        String input = "0,0,0,2,2,0,0,0,0,6,3,0,0,4,0,0,0,0,4,4,0,3,0,0";
        //String input = "3,2,2,3,2,1,1,2,3,3,2,2,5,1,2,2,4,3,3,2,1,2,2,4";
//        String input = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
//        String input = "3,3,0,3,0,0,0,0,2,3,0,3,0,0,1,3,0,3,3,3,2,0,3,4";
//        String input = "4,1,0,4,0,0,2,0,0,3,0,0,3,0,3,0,5,0,4,0,0,4,0,2";
        String input = "1,2,3,4,2,2,3,1,4,2,4,2,3,3,1,2,2,4,3,3,4,2,2,1";
//        String input = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
//        String input = "6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6";

        String[] inputToArray = input.split(",");
        int[] limits = new int[inputToArray.length];
        int[][] field = new int[6][6];
        for (int i = 0; i < limits.length; i++) {
            limits[i] = Integer.parseInt(inputToArray[i]);
        }

        for (int i = 0; i < 6; i++) {
            top[i] = limits[i];
            right[i] = limits[6 + i];
            bottom[i] = limits[12 + i];
            left[i] = limits[18 + i];
        }

        boolean inputChecker = getInputChecker();

        if (inputChecker) {
            checkForObvious(field, top, right, bottom, left);
            backTracking(field);

            for (int y = 0; y < 6; y++) {
                for (int x = 0; x < 6; x++) {
                    if (y == 5 && x == 5) {
                        System.out.print(field[y][x]);
                    } else {
                        System.out.print(field[y][x] + ",");
                    }
                }
            }
            System.out.println();
            System.out.println(System.currentTimeMillis() - startTime);
            System.out.println(Runtime.getRuntime());
        } else {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    field[i][j] = 0;
                    if (i == 5 && j == 5) {
                        System.out.print(field[i][j]);
                    } else {
                        System.out.print(field[i][j] + ",");
                    }
                }
            }
        }
    }

    private static boolean getInputChecker() {
        boolean result = true;
        for (int i = 0; i < top.length; i++) {
            if (checkInputRes(i, top, bottom)) {
                return false;
            }
            if (checkInputRes(i, right, left)) {
                return false;
            }
        }
        return result;
    }

    private static boolean checkInputRes(int i, int[] right, int[] left) {
        int resX = right[i] + left[5 - i];
        if (!(right[i] == 0 || left[5 - i] == 0 || resX > 2 && resX < 8)) {
            return true;
        }
        return false;
    }

    private static void checkForObvious(int[][] field, int[] top, int[] right, int[] bottom, int[] left) {
        int k = 1;
        int l = 6;
        for (int i = 0; i < top.length; i++) {
            if (top[i] == 6) {
                for (int y = 0; y < 6; y++) {
                    field[y][i] = k++;
                }
            }
            if (top[i] == 1) {
                field[0][i] = 6;
            }
            if (top[i] == 4) {
                if (bottom[5 - i] == 3) {
                    field[3][i] = 6;
                }
            }
            if (top[i] == 3) {
                if (bottom[5 - i] == 4) {
                    field[2][i] = 6;
                }
            }
        }
        for (int i = 0; i < right.length; i++) {
            if (right[i] == 6) {
                field[i] = new int[]{6, 5, 4, 3, 2, 1};
            }
            if (right[i] == 1) {
                field[i][5] = 6;
            }
            if (right[i] == 4) {
                if (left[5 - i] == 3) {
                    field[i][2] = 6;
                }
            }
            if (right[i] == 3) {
                if (left[5 - i] == 4) {
                    field[i][3] = 6;
                }
            }
        }
        for (int i = 0; i < bottom.length; i++) {
            if (bottom[i] == 6) {
                for (int y = 0; y < 6; y++) {
                    field[y][i] = l--;
                }
            }
            if (bottom[i] == 1) {
                field[5][5 - i] = 6;
            }
        }
        for (int i = 0; i < left.length; i++) {
            if (left[i] == 6) {
                field[i] = new int[]{1, 2, 3, 4, 5, 6};
            }
            if (left[i] == 1) {
                field[5 - i][0] = 6;
            }
        }
    }

    private static boolean backTracking(int[][] field) {
        long startTime = System.currentTimeMillis();
        int[] emptyCell = findEmptyCell(field);
        if (emptyCell.length == 0) {
            return true;
        }
        int y = emptyCell[0];
        int x = emptyCell[1];
        for (int height = 1; height <= 6; height++) {
            field[y][x] = height;
            if (isConflict(field, y, x, height)) {
                field[y][x] = 0;
            } else {
                if (backTracking(field)) {
                    return true;
                } else {
                    field[y][x] = 0;
                }
            }
        }
        return false;
    }

    private static int[] findEmptyCell(int[][] field) {
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x < 6; x++) {
                if (field[y][x] == 0) {
                    return new int[]{y, x};
                }
            }
        }
        return new int[0];
    }

    private static boolean isConflict(int[][] field, int y, int x, int height) {
        return containsHeight(field, y, x, height) || !trueStep(field, y, x);
    }

    private static boolean containsHeight(int[][] field, int y, int x, int height) {
        for (int i = 0; i < 6; i++) {
            if (i == x) {
                continue;
            }
            if (field[y][i] == height) {
                return true;
            }
        }
        for (int j = 0; j < 6; j++) {
            if (j == y) {
                continue;
            }
            if (field[j][x] == height) {
                return true;
            }
        }
        return false;
    }

    private static boolean trueStep(int[][] field, int y, int x) {
        int[] verticalRotated = new int[6];
        for (int i = 0; i < 6; i++) {
            verticalRotated[i] = field[i][x];
        }
        boolean zeroInHorizontal = false;
        boolean zeroInVertical = false;
        for (int i : field[y]) {
            if (i == 0) {
                zeroInHorizontal = true;
                break;
            }
        }
        for (int i : verticalRotated) {
            if (i == 0) {
                zeroInVertical = true;
                break;
            }
        }
        if (zeroInHorizontal && zeroInVertical) {
            return true;
        }
        if (!zeroInHorizontal && zeroInVertical) {
            return checkLine(left[5 - y], right[y], field[y]);
        }
        if (zeroInHorizontal) {
            return checkLine(top[x], bottom[5 - x], verticalRotated);
        }
        return checkLine(top[x], bottom[5 - x], verticalRotated) && checkLine(left[5 - y], right[y], field[y]);
    }

    private static boolean checkLine(int left, int right, int[] skyscrapersOnTheLine) {
        if (left == 0 && right == 0) {
            return true;
        }
        if (left == 0) {
            return right == countOfViewed(false, skyscrapersOnTheLine);
        }
        if (right == 0) {
            return left == countOfViewed(true, skyscrapersOnTheLine);
        }
        return (left == countOfViewed(true, skyscrapersOnTheLine) && right == countOfViewed(false, skyscrapersOnTheLine));
    }

    private static int countOfViewed(boolean directionLeftToRight, int[] skyscrapersOnTheLine) {
        int count = 0;
        int max = 0;
        if (directionLeftToRight) {
            if (skyscrapersOnTheLine[0] != 0) {
                max = skyscrapersOnTheLine[0];
                count++;
            }
            for (int i = 1; i < 6; i++) {
                if (skyscrapersOnTheLine[i] > skyscrapersOnTheLine[i - 1] && skyscrapersOnTheLine[i] > max) {
                    max = skyscrapersOnTheLine[i];
                    count++;
                }
            }
        } else {
            if (skyscrapersOnTheLine[5] != 0) {
                max = skyscrapersOnTheLine[5];
                count++;
            }
            for (int i = 4; i >= 0; i--) {
                if (skyscrapersOnTheLine[i] > skyscrapersOnTheLine[i + 1] && skyscrapersOnTheLine[i] > max) {
                    max = skyscrapersOnTheLine[i];
                    count++;
                }
            }
        }
        return count;
    }
}
