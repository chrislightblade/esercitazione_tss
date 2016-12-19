/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio.esercizio_numero_3;

/**
 * Realizza un programma per gestire una pila di interi di max 5 elementi attraverso una classe pila 
   che deve prevedere dei metodi per l'inserimento e per l'estrazione di un elemento.
 * 
 * @author tss
 */
public class esercizio_numero_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila pila = new Pila();
        pila.addPila(3);
        pila.addPila(8);
        pila.addPila(-4);
        pila.mostraPila();
        pila.addPila(8);
        pila.addPila(3);
        pila.addPila(11);
        pila.togliPila(3);
        pila.togliPila(13);
        pila.mostraPila();
    }
    
}
