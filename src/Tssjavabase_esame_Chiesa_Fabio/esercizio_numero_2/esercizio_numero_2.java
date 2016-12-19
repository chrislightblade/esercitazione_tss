/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio.esercizio_numero_2;

/**
 *
 * @author tss
 */
public class esercizio_numero_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CC conto = new CC("Gianfilippo", 100);
        conto.prelievo(20);
        conto.prelievo(30);
        conto.prelievo(10);
        conto.saldo();
        conto.versamento(60);
        conto.versamento(90);
        conto.ultimi5Movimenti();
    }
    
}
