/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_esame_Chiesa_Fabio;

import javax.swing.JOptionPane;

/**
 *
 * uso il ciclo while per stampare una serie di marche di automobili
 *
 * @author tss
 */
public class Esercizio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;//contatore per il massimo di modelli da inserire
        boolean controllo = false;//controllo per restare nel while
        String input = "";
        String report = "";

        while (controllo == false && i < 6) {//inserisco input fintanto che non metto "exit" o non ho svolto il ciclo completo (5)
            input = JOptionPane.showInputDialog("Inserire un modello di automobile\n                o scrivere exit");//input importo minimo

            if (!(input.toLowerCase()).equals("exit")) {//verifico che l'input non sia "exit"
                report += i + "# " + input + "\n";
                i++;

            } else {//se è "exit" allora svolgo questo comando
                controllo = true;//ed esco dal ciclo while
            }
        }

        JOptionPane.showMessageDialog(null, report);

    }

}
