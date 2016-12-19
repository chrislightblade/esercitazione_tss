/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_esame_Chiesa_Fabio;

import javax.swing.JOptionPane;

/**
 *
 * produco un convertitore di valuta
 *
 * @author tss
 */
public class Esercizio_1 {

    public static void main(String[] args) {
        double valore = 0;//variabile in cui inserisco il valore monetario da convertire
        double v_sterlina = 0, v_franco = 0, v_dollaro = 0;//i valori di cambio della valuta
        double v_c_sterlina = 0, v_c_franco = 0, v_c_dollaro = 0;//valori monetari convertiti
        String input = "";
        String report = "";

        input = JOptionPane.showInputDialog("Inserire il valore di cambio della sterlina");//input valore cambio sterlina = 0.854215
        v_sterlina = Double.parseDouble(input);
        //v_sterlina = 0.854215;
        report += "valore cambio sterlina: " + v_sterlina + "\n";//stampo in report

        input = JOptionPane.showInputDialog("Inserire il valore di cambio del franco");//input valore cambio franco = 1.071725
        v_franco = Double.parseDouble(input);
        //v_franco = 1.071725;
        report += "valore cambio franco:   " + v_franco + "\n";//stampo in report

        input = JOptionPane.showInputDialog("Inserire il valore di cambio del dollaro");//input valore cambio dollaro = 1.0611
        v_dollaro = Double.parseDouble(input);
        //v_dollaro = 1.0611;
        report += "valore cambio dollaro:  " + v_dollaro + "\n" + "\n";//stampo in report

        input = JOptionPane.showInputDialog("inserire il valore da convertire");//inserisco il valore da convertire
        valore = Double.parseDouble(input);
        report += "valore monetario\nin euro da convertire:     " + valore + "\n" + "\n";//stampo in report

        v_c_sterlina = valore * v_sterlina;//converto
        v_c_sterlina = (Math.floor((v_c_sterlina) * 100)) / 100;//arrotondo

        v_c_franco = valore * v_franco;//converto
        v_c_franco = (Math.floor((v_c_franco) * 100)) / 100;//arrotondo

        v_c_dollaro = valore * v_dollaro;//converto
        v_c_dollaro = (Math.floor((v_c_dollaro) * 100)) / 100;//arrotondo

        report += "valore in sterlina: " + v_c_sterlina + "\n";//stampo in report
        report += "valore in franco:   " + v_c_franco + "\n";//stampo in report
        report += "valore in dollaro : " + v_c_dollaro + "\n";//stampo in report

        JOptionPane.showMessageDialog(null, report);
    }

}
