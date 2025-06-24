package com.exemple;

public class AsciiConvertion {
    public static void printAsciiCodes(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Chaine vide ou nulle");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            System.out.print((int) c);
            if (i < input.length() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();  
    }
}
