package com.exemple;

public class Binaire {

    public static String charToBinary(char c) {
        int ascii = (int) c;  
        StringBuilder binaire = new StringBuilder();

      
        for (int i = 7; i >= 0; i--) {
            int bit = (ascii >> i) & 1;
            binaire.append(bit);
        }

        return binaire.toString(); 
    }
    public static void main(String[] args) {
        char exemple = 'A';
        String resultat = charToBinary(exemple);
        System.out.println("Binaire de '" + exemple + "' : " + resultat); 
    }
}
