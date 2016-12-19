/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio.esercizio_numero_1;

/**
 *
 * @author tss
 */
public class esercizio_numero_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Potenza pow = new Potenza(4);
        pow.cambioBase(5);
        System.out.println(pow.Pow());
    }
    
}
