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
public class esercizio_2_1 {

    /**
     * TuttiPositiviPari
     * programma che chiede in input la quantità dei numeri da verificare e poi controlla un sequenza di numeri se sono tutti come  da titolo del programma stesso
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //input da linea di comando
        Scanner s = new Scanner(System.in);
        System.out.println("Quanti numeri desideri inserire?");
        int numero = s.nextInt();
        String report = "";
        
        //creo un variabile che aumenta ogni qualvolta inserisco un numero paripositivo
        int control = 0;
        for (int i = 0; i < numero; i++) {
            Scanner t = new Scanner(System.in);
            System.out.println("Inserire il " + (i+1) + "° numero da verificare");
            int num = t.nextInt();
            if(num % 2 == 0 && num >= 0){
                control++;
            }
        }
        if (control == numero){//se ho inserito solo nuermi pari positivi, allora control è uguale a numero delle cifre inserite
            report = "i numeri sono tutti pari e positivi";
        } else {
            report = "No, i numeri non sono tutti positivi e pari";
        }
        System.out.println(report);
    }

}
