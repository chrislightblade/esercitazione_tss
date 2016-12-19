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
public class Potenza {
    
    private int base;
    private int esponente = 2;
    private int potenza;

    public Potenza(int numero) {
        this.base = numero;
        this.potenza = Pow();
        
    }
    
    public int Pow(){//poW mostra anche la potenza in linea di comando
        int valore = (int) Math.pow(base, esponente);
        System.out.println(Pow());
        return valore;
    }
    
    public void cambioBase(int valore){
        this.base = valore;
    }

    public int getPotenza() {
        return potenza;
    }

    public int getBase() {
        return base;
    }

    public int getEsponente() {
        return esponente;
    }
    
    
}
