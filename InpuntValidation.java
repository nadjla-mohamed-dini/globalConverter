package com.exemple;

public class InpuntValidation {
    public static boolean isValid(String input) {
        return input!= null &&input.matches("^[a-zA-Z0-9]+$");
    }
}
