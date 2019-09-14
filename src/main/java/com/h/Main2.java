package com.h;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public final class Main2 {
    // todo think about name
    private static Map<Integer, String[]> map = new HashMap<>();
    private static int helperWithPinArrayIndex;
    private static int outFromRecursionHelper = 1;

    // default is 0
    private static int helperCountWithPin;

    // static initializer block
    static {
        map.put(1, new String[]{"1", "2", "4"});
        map.put(2, new String[]{"1", "2", "3", "5"});
        map.put(3, new String[]{"2", "3", "6"});
        map.put(4, new String[]{"1", "4", "5", "7"});
        map.put(5, new String[]{"2", "4", "5", "6", "8"});
        map.put(6, new String[]{"3", "5", "6", "9"});
        map.put(7, new String[]{"4", "7", "8"});
        map.put(8, new String[]{"0", "5", "7", "8", "9"});
        map.put(9, new String[]{"6", "8", "9"});
        map.put(0, new String[]{"0", "8"});
    }

    private char[][] pin = new char[4][3];

    public static void main(String[] args) {
        Main2 main2 = new Main2();

        System.out.println(main2.pin.length);
        System.out.println(main2.pin[0].length);
        int value = 1;
        for (int i = 0; i < main2.pin.length; i++) {
            for (int j = 0; j < main2.pin[0].length; j++) {
                if (i == 3) {
                    if (j != 1) {
                        continue;
                    } else {
                        main2.pin[i][j] = "0".charAt(0);
                        break;
                    }
                }
                main2.pin[i][j] = String.valueOf(value).charAt(0);
                value++;
            }
        }

        System.out.println(Arrays.deepToString(main2.pin));

        System.out.println("Please enter the pin!");

        String supposedPin = main2.getPinFromUser();
        System.out.println("Supposed pin is: " + supposedPin);

//        char[] charSupposedPin = supposedPin.toCharArray();
//
//        System.out.println(Arrays.toString(charSupposedPin));
//
//        // O(n2) should be optimized
//        // todo should optimized length
//        // if we not sure that user enter correct pin
//        for (char ch : charSupposedPin) {
//            for (int i = 0; i < main2.pin.length; i++) {
//                for (int j = 0; j < main2.pin[0].length; j++) {
//                    if(main2.pin[i][j] == ch) {
//                        // logic from getting all near symbols
//                        System.out.println();
//                    }
//                }
//            }
//        }

        // todo think can we use there char[]
        int[] pinArrayInInt = new int[supposedPin.length()];
        for (int i = 0; i < supposedPin.length(); i++) {
            pinArrayInInt[i] = Integer.parseInt(String.valueOf(supposedPin.charAt(i)));
        }

        System.out.println(Arrays.toString(pinArrayInInt));

        // todo optimize lengh
        List<String[]> helperArrayForCorrectPin = new ArrayList<>();

        for (int i = 0; i < supposedPin.length(); i++) {
            helperArrayForCorrectPin.add(map.get(pinArrayInInt[i]));
        }

        System.out.println(helperArrayForCorrectPin);

        // recursion
        main2.printResult(helperArrayForCorrectPin);
//        main2.printResult(helperArrayForCorrectPin, helperCountWithPin);
        System.out.println();


        // realize method with logic for getting near number
    }

    private void printResult(List<String[]> arrayForCorrection) {
        System.out.println();
        int[] array = new int[arrayForCorrection.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = arrayForCorrection.get(i).length;
        }

//        for (int i = 0; i < arrayForCorrection.size(); i++) {
//            outFromRecursionHelper = 0;
//            outFromRecursionHelper = arrayForCorrection.size();
        for (int i = 0; i < arrayForCorrection.size(); i++) {
            outFromRecursionHelper = outFromRecursionHelper * arrayForCorrection.get(i).length;
        }
            printFinalResult(arrayForCorrection, helperWithPinArrayIndex);
//        }
//        countOfPins--;
//
//        // logic123
//        for (int i = 0; i < arrayForCorrection.length; i++) {
//            System.out.print(arrayForCorrection[i]);
//        }
//
//        if(countOfPins != 0) {
//            System.out.print(",");
//        }
//        // think about count of operation
//
//        //todo - think about logic of displaying all variants of pins
////        printFinalResult(arrayForCorrection, helperWithPinArrayIndex);
//
//        if (countOfPins > 0) {
//            printResult(arrayForCorrection, countOfPins);
//        }
        for (int i = 0; i < arrayForCorrection.size(); i++) {
//            printResult(arrayForCorrection);
        }
    }

    private void printFinalResult(List<String[]> arrayForCorrection, int tempCount) {
        if(outFromRecursionHelper > 0) {
            outFromRecursionHelper--;
            tempCount++;
            printFinalResult(arrayForCorrection, tempCount);
        } else {
            System.out.println(tempCount);
        }




//        for (int i = 0; i < array.length; i++) {
//            while (array[i] > 0) {
//                for (int j = 0; j < arrayForCorrection.size(); j++) {
//                    String[] strings = arrayForCorrection.get(j);
//                    for (int k = 0; k < strings.length; k++) {
//                        tempCount++;
//                    }
//                }
//
////                while (array[] > 0) {
////                    for (int j = 0; j < arrayForCorrection.size(); j++) {
////                        StringBuilder s = new StringBuilder();
////                        for (int k = 0; k < arrayForCorrection.get(j).length; k++) {
////                            s.append(arrayForCorrection.get(j)[k]);
////                        }
////                        System.out.println(s.toString());
////                    }
////                    printFinalResult(arrayForCorrection, --i, --tempCount);
////                }
////                System.out.println();
//              array[i]--;
//            }
//        }

    }


    private String getPinFromUser() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pin = null;

        try {
            // todo check that user enter possible pin
            pin = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (pin != null) {
            return pin;
        }

        throw new IllegalArgumentException("Pin should not be null");
    }
}
