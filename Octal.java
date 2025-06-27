package com.exemple;

public class Octal {

    public static String decimalToOctal(int number) {
        StringBuilder octal = new StringBuilder();

        if (number == 0) {
            return "0";
        }

        while (number > 0) {
            int reste = number % 8;
            octal.insert(0, reste);
            number = number / 8;
        }

        return octal.toString();
    }
    public static String convertToBase8(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            int ascii = (int) c;
            String base8 = decimalToOctal(ascii);
            result.append(base8).append(" ");
        }

        return result.toString().trim();
    }
}
