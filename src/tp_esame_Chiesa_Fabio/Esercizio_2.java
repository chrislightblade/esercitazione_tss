/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_esame_Chiesa_Fabio;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Esercizio_2 {

    /**
     *
     * produco un programma che prenda in input un minimo e un valore e mi dica
     * se può versarlo
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int valore_minimo = 0, valore_da_versare = 0;//valori monetari convertiti
        String input = "";
        String report = "";

        input = JOptionPane.showInputDialog("Inserire il valore dell'importo minimo che si può versare");//input importo minimo
        valore_minimo = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Inserire il'importo da versare");//input importo da versare
        valore_da_versare = Integer.parseInt(input);

        report += "importo minimo prelevabile:             " + valore_minimo + "\n";
        report += "importo che si desidera prelevare: " + valore_da_versare + "\n";

        if (valore_da_versare < valore_minimo) {
            report += "versamento di " + valore_da_versare + " non accettato - versare almeno " + valore_minimo;
        }//fine if 
        else {
            report += "versamento di " + valore_da_versare + " accettato";
        }//fine else

        JOptionPane.showMessageDialog(null, report);
    }

}
