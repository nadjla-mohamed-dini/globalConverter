package com.exemple;

import java.util.Scanner;

public class ChoixBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choixBase = "";
        boolean baseValide = false;

        while (!baseValide) {
            System.out.println("Choisissez une base : -h (hexadecimal), -d (decimal), -b (binary), -t (text)");
            choixBase = scanner.nextLine().trim().toLowerCase();

            if (choixBase.equals("h") || //choixBase.equals("o") ||
                choixBase.equals("d") || choixBase.equals("b") ||
                choixBase.equals("t")) {
                baseValide = true;
            } else {
                System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }

        System.out.println("Base choisie : " + baseEnTexte(choixBase));
        System.out.println("Entrez une chaîne à convertir :");
        String texte = scanner.nextLine();

        System.out.println("Résultat de la conversion :");

        for (int i = 0; i < texte.length(); i++) {
            char c = texte.charAt(i);
            switch (choixBase) {
                case "b":
                    System.out.print(Binaire.charToBinary(c) + " ");
                    break;
                // case "o":
                //     System.out.print(Octal.charToOctal(c) + " ");
                //     break;
                case "d":
                    System.out.print(Decimal.charToDecimal(c) + " ");
                    break;
                case "h":
                    System.out.print(Hexadecimal.charToHexadecimal(c) + " ");
                    break;
                case "t":
                    System.out.print(c + " ");
                    break;
            }
        }

        System.out.println();
        scanner.close();
    }

    public static String baseEnTexte(String choixBase) {
        switch (choixBase) {
            case "h":
                return "hexadecimal";
            // case "o":
            //     return "octal";
            case "d":
                return "decimal";
            case "b":
                return "binary";
            case "t":
                return "text";
            default:
                return "inconnue";
        }
    }
}
