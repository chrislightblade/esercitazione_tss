/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio.esercizio_numero_5;

import java.util.ArrayList;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author tss
 */
public class Tavolo {

    private int coperti;
    private static int ID;
    private int IDt;
    private ArrayList<Alimento> Ordinazione = new ArrayList<Alimento>();

    static { //viene lancia solo la prima volta che viene richiamato questo oggetto
        ID = 0;

    }

    public Tavolo() {
        int coperti = (int) Math.floor(Math.random() * 5) + 2;
        this.coperti = coperti;
        this.IDt = ID++;
    }

    public int getCoperti() {
        return coperti;
    }

    public int getIDt() {
        return IDt;
    }

    public void addOrdine(Alimento alimento) {
        Ordinazione.add(alimento);
    }

    public void ottieniContoTavolo() {
        double conto = 0;
        String report = "Consumazioni del tavolo " + IDt + ":";
        for (int i = 0; i < Ordinazione.size(); i++) {
            conto += Ordinazione.get(i).getCosto();            
        }
        System.out.println(conto);        
    }

    public void ottieniStoricoTavolo() {
        double conto = 0;
        String report = "Consumazioni del tavolo " + IDt + ":\n";
        for (int i = 0; i < Ordinazione.size(); i++) {
            report += "Alimento: " + Ordinazione.get(i).getNome() + " - Costo: " + Ordinazione.get(i).getCosto() + "\n";
        }
        System.out.println(report);
    }

}
