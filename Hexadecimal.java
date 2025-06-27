package com.exemple;

public class Hexadecimal {

    public static String charToHexadecimal(char c) {
        int ascii = (int) c;
        StringBuilder hex = new StringBuilder();

        // Division successive par 16
        do {
            int reste = ascii % 16;
            char hexChar = valeurEnHexa(reste);
            hex.insert(0, hexChar);
            ascii = ascii / 16;
        } while (ascii > 0);

        return hex.toString();
    }

    public static char hexadecimalToChar(String hexStr) {
        int valeur = 0;

        for (int i = 0; i < hexStr.length(); i++) {
            char hexChar = hexStr.charAt(i);
            int chiffre = valeurDepuisHexa(hexChar);
            valeur = valeur * 16 + chiffre;
        }

        return (char) valeur;
    }

    private static char valeurEnHexa(int valeur) {
        if (valeur >= 0 && valeur <= 9) {
            return (char) ('0' + valeur);
        } else if (valeur >= 10 && valeur <= 15) {
            return (char) ('A' + (valeur - 10));
        } else {
            throw new IllegalArgumentException("Valeur hors intervalle pour l'hexadécimal.");
        }
    }

    private static int valeurDepuisHexa(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        } else if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        } else {
            throw new IllegalArgumentException("Caractère non valide pour l'hexadécimal.");
        }
    }

    public static void main(String[] args) {
        char exemple = 'A';
        String resultat = charToHexadecimal(exemple);
        System.out.println("Hexadécimal de '" + exemple + "' : " + resultat);

        // Test inverse
        String hexExemple = "41";
        char caractere = hexadecimalToChar(hexExemple);
        System.out.println("Caractère pour l'hexadécimal " + hexExemple + " : " + caractere);
    }
}
