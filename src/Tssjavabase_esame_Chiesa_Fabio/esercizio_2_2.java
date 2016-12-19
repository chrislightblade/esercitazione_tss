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
public class esercizio_2_2 {

    /**
     * ContinuaFino
     * programma che accetta in input numeri da verificare che sono negativi e divisibili per 2 oppure positivi e divisibili per 3
     * alla fine stampa la s omma di tutti i numeri ignorando il numero non idoneo
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numeroFinale = 0;
        boolean control = true;
        while (control == true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Inserire un Valore,\nverrà verificato se è negativo e divisibile per 2\noppure positivo e divisibile per 3\n");
            int numero = s.nextInt();
            //verifica della validità del numero inserito
            if((numero < 0 &&(numero%2 == 0)) || (numero > 0 &&(numero%3 == 0))){
                numeroFinale += numero;
            } else {
                //uscita dal ciclo while e stampa della somma di tutti i numeri
                control = false;
                String report = "Spiacente, hai inserito un numero non valido.\nTi verrà ora dato il valore della somma di tutti\ni numeri che hai inserito fino a ora\n";
                report += "Il valore è " + numeroFinale;
                report += "\nNon è stato preso in considerazione il numero non valido."; 
                System.out.println(report);
            }
        }
    }

}

