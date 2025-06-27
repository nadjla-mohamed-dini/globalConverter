package com.exemple;

public class ChiffrementCesar {

    public static String chiffrer(String input, int decalage) {
        return traiterTexte(input, decalage, true);
    }

    public static String dechiffrer(String input, int decalage) {
        return traiterTexte(input, decalage, false);
    }

    private static String traiterTexte(String input, int decalage, boolean isChiffrement) {
        StringBuilder resultat = new StringBuilder();

        
        int decalageLettres = ((isChiffrement ? decalage : -decalage) % 26 + 26) % 26;
        int decalageChiffres = ((isChiffrement ? decalage : -decalage) % 10 + 10) % 10;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                char shifted = (char) (c + decalageLettres);
                if (shifted > 'Z') shifted -= 26;
                if (shifted < 'A') shifted += 26;
                resultat.append(shifted);

            } else if (c >= 'a' && c <= 'z') {
                char shifted = (char) (c + decalageLettres);
                if (shifted > 'z') shifted -= 26;
                if (shifted < 'a') shifted += 26;
                resultat.append(shifted);

            } else if (c >= '0' && c <= '9') {
                int shiftedChiffre = ((c - '0') + decalageChiffres) % 10;
                resultat.append((char) (shiftedChiffre + '0'));

            } else {
                resultat.append(c); 
            }
        }

        return resultat.toString();
    }
}
