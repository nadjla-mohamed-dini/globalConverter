package com.exemple;

public class Decimal {

    public static String charToDecimal(char c) {
        int ascii = (int) c;
        return String.valueOf(ascii); 
    }

    public static char decimalToChar(String decimalStr) {
        int valeur = 0;

        for (int i = 0; i < decimalStr.length(); i++) {
            char chiffre = decimalStr.charAt(i);
            if (chiffre < '0' || chiffre > '9') {
                throw new IllegalArgumentException("Caractère non valide dans le nombre décimal.");
            }
            valeur = valeur * 10 + (chiffre - '0');
        }

        return (char) valeur;
    }

    public static void main(String[] args) {
        char exemple = 'A';
        String resultat = charToDecimal(exemple);
        System.out.println("Décimal de '" + exemple + "' : " + resultat);

        // Test inverse
        String decimalExemple = "65";
        char caractere = decimalToChar(decimalExemple);
        System.out.println("Caractère pour le décimal " + decimalExemple + " : " + caractere);
    }
}
