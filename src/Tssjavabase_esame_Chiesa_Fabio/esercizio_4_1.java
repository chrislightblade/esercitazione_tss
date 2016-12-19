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
public class esercizio_4_1 {

    /**
     * ripeti
     * programma che ripete una frase tot volte
     * frase e il tot vengono presi in input
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Inserire una frase da ripetere un tot di volte\n");
        String frase = s.nextLine();
        Scanner t = new Scanner(System.in);
        System.out.println("Quante volte vuoi ripetere la frase?");
        int numero = t.nextInt();
        //system.out che passa da un metodo esterno
        System.out.println(ripetiFrase(frase, numero));
        
    }

    //metodo che prende la frase e il numero di volte in input e offre come output una stringa che contiene la frase ripetuta tot volte
    private static String ripetiFrase(String frase, int numero) {
        String report = "ERRORE: numero negativo";
        if(numero == 0){
            report = "Hai chiesto di ripetere la frase zero volte ?!?";
        }
        if(numero > 0){
            report = "";
            for (int i = 0; i < numero; i++) {
                report +=frase + "\n";
            }
        }
        return report;
    }
    
}
