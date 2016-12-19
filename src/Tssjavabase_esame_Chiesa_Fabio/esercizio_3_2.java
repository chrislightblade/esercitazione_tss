/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class esercizio_3_2 {

    /**
     * SoloVocali
     * programmache data in input una frase in linea di comadno, ne estrae le vocali e le stampa in output
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Inserire una frase da cui estrarre le vocali\n");
        String frase = s.nextLine();
        String vocali = "";
        //con un ciclo for,analizzo ogni singolo carattere della stringa e verifico sia vocale, stampandola
        for (int i = 0; i < frase.length(); i++) {
            char a = frase.charAt(i);
            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            vocali += a;
            }
        }
        System.out.println("Ecco le vocali della frase " + frase + ": " + vocali);
    
    }
    
}
