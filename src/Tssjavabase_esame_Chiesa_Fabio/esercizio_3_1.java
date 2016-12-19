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
public class esercizio_3_1 {

    /**
     * Contrario
     *programma che prende una frase presa in input da frase di comando e restituisce in output la frase rovesciata
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Inserire una frase da capovolgere\n");
        String frase = s.nextLine();
        String fraseRovesciata = "";
        //con un ciclo for, prendo ogni singolo char della Stringa partendo dalla fine e compongo la frase al contrario
        for (int i = frase.length()-1; i >= 0; i--) {
            char a = frase.charAt(i);
            fraseRovesciata += a;
        }
        System.out.println("Ecco la frase rovesciata: " + fraseRovesciata);
    }

}


