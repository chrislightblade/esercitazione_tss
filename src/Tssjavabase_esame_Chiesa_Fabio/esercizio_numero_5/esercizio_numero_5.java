/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio.esercizio_numero_5;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class esercizio_numero_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Tavolo> tavoli = new ArrayList<Tavolo>();
        for (int i = 0; i < 10; i++) {
            Tavolo e = new Tavolo();
            tavoli.add(e);
        }
        Menù menù = new Menù();
        
        tavoli.get(6).addOrdine(menù.bevande.get(0));
        tavoli.get(6).addOrdine(menù.bevande.get(1));
        tavoli.get(6).ottieniStoricoTavolo();
        tavoli.get(6).ottieniContoTavolo();
        
    }
    
}
