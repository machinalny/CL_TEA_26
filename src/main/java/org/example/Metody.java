package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Metody {
    public static int multiply(int multiplier, int index) {
        return multiplier * index;
    }

    public static int square(int num) {
        return num * num;
    }

    public static double convertToUsd(double pln) {
        return pln / 4.04;
    }

    public static String createName(String name, String surname, String nickname) {
        return String.format("%s %s %s", name, nickname, surname);
    }

    public static BigDecimal calculateNetto(Double gross, Double vat) {
        BigDecimal result = new BigDecimal(gross / (1 + vat));
        return result.setScale(2, RoundingMode.HALF_EVEN);
    }

    public static boolean checkMaturity(int age) {
        if (age < 18) {
            return false;
        } else {
            return true;
        }
    }


    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

}
