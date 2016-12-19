/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio.esercizio_numero_4;


/**
 *
 * @author tss
 */
public class esercizio_numero_4 {

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
