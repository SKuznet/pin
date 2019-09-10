package com.h;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    private char[][] pin = new char[4][3];

    public static void main(String[] args) {
        Main2 main2 = new Main2();

//        System.out.println(main2.pin.length);
//        System.out.println(main2.pin[0].length);
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

        char[] charSupposedPin = supposedPin.toCharArray();

        System.out.println(Arrays.toString(charSupposedPin));

        // O(n2) should be optimized
        // todo should optimized length
        // if we not sure that user enter correct pin
        for (char ch : charSupposedPin) {
            for (int i = 0; i < main2.pin.length; i++) {
                for (int j = 0; j < main2.pin[0].length; j++) {
                    if(main2.pin[i][j] == ch) {
                        // logic from getting all near symbols
                        System.out.println();
                    }
                }
            }
        }

        // realize method with logic for getting near number
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
