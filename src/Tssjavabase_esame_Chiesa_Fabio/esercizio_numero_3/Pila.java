/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio.esercizio_numero_3;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Pila {

    private ArrayList<Integer> pila;

    public Pila() {
        this.pila = new ArrayList<Integer>();
    }

    public void addPila(Integer num) {//aggiunge un elemento alla pila, ma solo se la capienza non è max
        if (pila.size() < 5) {
            pila.add(num);
            System.out.println("Aggiunto il valore con successo.");
        } else {
            System.out.println("Pila completa, impossibile aggiungere un ulteriore valore.");
        }
    }

    public void togliPila(Integer num) {//toglie elementi dalla pila solo se ce ne sono e se li trova. toglie dalla cima finchè non trova l'elemento,poi li rimette nell'ordine in cui li ha trovati
        ArrayList<Integer> pila2 = new ArrayList<Integer>();
        if (pila.size() > 0) {
            for (int i = pila.size() - 1; i >= 0; i--) {
                if (pila.remove(num)) {
                    System.out.println("Rimosso il valore con successo.");
                    break;
                } else {
                    pila2.add(pila.get(i));
                    pila.remove(i);
                }                
            }
            if (pila.size() == 0) {
                    System.out.println("Valore non trovato. Impossibile rimuovere.");
                }
            for (int i = 0; i < pila2.size(); i++) {
                pila.add(pila2.get(i));
                pila2.remove(i);
            }
        } else {
            System.out.println("Non vi sono elementi nella pila da togliere. Pila vuota.");
        }
    }

    public void mostraPila() {
        String report = "La pila contiene i seguenti valori:\n";
        for (int i = 0; i < pila.size(); i++) {
            report += pila.get(i) + "\n";
        }
        System.out.println(report);
    }

}
