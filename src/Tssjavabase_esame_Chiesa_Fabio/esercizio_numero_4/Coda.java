/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio.esercizio_numero_4;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Coda {

    private ArrayList<Integer> coda;

    public Coda() {
        this.coda = new ArrayList<Integer>();
    }

    public void addCoda(Integer num) {//aggiunge un elemento alla coda, ma solo se la capienza non è max
        if (coda.size() < 5) {
            coda.add(num);
            System.out.println("Aggiunto il valore con successo.");
        } else {
            System.out.println("Pila completa, impossibile aggiungere un ulteriore valore.");
        }
    }

    public void togliCoda(Integer num) {//toglie elementi dalla coda solo se ce ne sono e se li trova. toglie dal fondo finchè non trova l'elemento,poi li rimette nell'ordine in cui li ha trovati
        ArrayList<Integer> coda2 = new ArrayList<Integer>();
        if (coda.size() > 0) {
            for (int i = 0; i < coda.size(); i++) {
                if (coda.remove(num)) {
                    System.out.println("Rimosso il valore con successo.");
                    break;
                } else {
                    coda2.add(coda.get(i));
                    coda.remove(i);
                }
                if (coda.size() == 0) {
                    System.out.println("Valore non trovato. Impossibile rimuovere.");
                }
            }
            int j = 0;
            for (int i = coda2.size(); i > 0; i--) {
                coda.add(j, (coda2.get(i)));
                coda2.remove(i);
                j++;
            }
        } else {
            System.out.println("Non vi sono elementi nella pila da togliere. Pila vuota.");
        }
    }

    public void mostraCoda() {
        String report = "La pila contiene i seguenti valori:\n";
        for (int i = 0; i < coda.size(); i++) {
            report += coda.get(i) + "\n";
        }
        System.out.println(report);
    }

}
