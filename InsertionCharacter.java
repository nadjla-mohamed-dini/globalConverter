package com.exemple;

import java.util.Scanner;

public class InsertionCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String character;
        do {
            System.out.print("Veuillez entrer une chaine de charactere: ");
            character = scanner.nextLine(); 
            if (!InpuntValidation.isValid(character)) {
                System.out.println("Erreur: seules les lettres et chiffres sont autorisés.");
            }
        } while (!InpuntValidation.isValid(character)); 

        System.out.println("Chaîne valide : " + character);
        System.out.println("chaine de caractere ASCII :");
        AsciiConvertion.printAsciiCodes(character); 
        
        System.out.println("entrer le decalage pour le chiffrement César: ");
        int decalage = scanner.nextInt();
        String chiffre = ChiffrementCesar.chiffrer(character, decalage);
        System.out.println("Chaine chiffrée: "+ chiffre);

        String dechiffrer = ChiffrementCesar.dechiffrer(chiffre, decalage);
        System.out.println("Chaine déchiffrer: " + dechiffrer);
        scanner.close();
    }

}

/*char c = 'A';
System.out.println((int)c);
int result = 0;

for (int i =0; i<=15;  i++) {
    if((c & (1 << i)) != 0){
        result += (1<<i);
    }

}*/