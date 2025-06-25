package com.exemple;
import java.util.Scanner;


public class ChoixBase {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String choixBase = "";
       boolean baseValide = false;

       while (!baseValide) {
           System.out.println("Choisissez une base : -h (hexadecimal), -o (octal), -d (decimal), -b (binary), -t (text)");
           choixBase = scanner.nextLine().trim().toLowerCase();

           if (choixBase.equals("h") || choixBase.equals("o") || 
               choixBase.equals("d") || choixBase.equals("b") || 
               choixBase.equals("t")) {
               baseValide = true;
           } else {
               System.out.println("Choix invalide. Veuillez réessayer.");
           }
        }
        System.out.println("Base choisie : " + baseEnTexte(choixBase));
        
    
            if (choixBase.equals("b")) {
            System.out.println("Entrez une chaîne à convertir en binaire : ");
            String texte = scanner.nextLine();

            System.out.println("Conversion binaire :");
            for (int i = 0; i < texte.length(); i++) {
                char c = texte.charAt(i);
                String binaire = Binaire.charToBinary(c);
                System.out.print(binaire + " ");
            }
            System.out.println();
            
    }
    scanner.close();
    }

    public static String baseEnTexte(String choixBase) {
        switch (choixBase) {
            case "h":
                return "hexadecimal";
            case "o":
                return "octal";
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