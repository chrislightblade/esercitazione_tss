/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_esame_Chiesa_Fabio;

import javax.swing.JOptionPane;

/**
 *
 * programma che prenda in input il punteggio di x lanciatori e mi stampi un
 * report con tutti i lanci, il migliore e il peggiore ( con ciclo for)
 *
 * @author tss
 */
public class Esercizio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int quanti = 0;//numero lanciatori        
        String input = "";
        String report = "";
        int maxlancio = 0, minlancio = 0;

        input = JOptionPane.showInputDialog("Dire quanti lanci si vuole inserire");//input importo minimo
        quanti = Integer.parseInt(input);
        report += "Hanno effettuato un lancio " + quanti + " lanciatori di peso" + "\n\n";
        
        Double lanci[] = new Double[quanti];//array che contiene il valore dei lanci
        for (int i = 0; i < lanci.length; i++) {
            input = JOptionPane.showInputDialog("inserire punteggio lancio " + (i + 1) + "° lanciatore\n");//inserisco il valore del lancio 
            lanci[i] = Double.parseDouble(input);
            report += (i + 1) + "° lanciatore: " + lanci[i] + " metri\n";

        }
        
        for (int i = 0; i < lanci.length; i++) {
            if (lanci[i] > lanci[maxlancio]) {//cerco il punteggio migliore
                maxlancio = i;
            }
            
            if (lanci[i] < lanci[minlancio]) {//cerco il punteggio perggiore
                minlancio = i;
            }

        }
        
        report += "\nIl lanciatore col punteggio migliore è stato\nil " + (maxlancio + 1) + "° lanciatore con un punteggio di " + lanci[maxlancio] + " metri\n\n";
        report += "Il lanciatore col punteggio peggiore è stato\nil " + (minlancio + 1) + "° lanciatore con un punteggio di " + lanci[minlancio] + " metri\n\n";
        
        JOptionPane.showMessageDialog(null, report);//stampo tutto


    }
}
