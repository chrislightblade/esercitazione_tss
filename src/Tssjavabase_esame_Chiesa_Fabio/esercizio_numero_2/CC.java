/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio.esercizio_numero_2;

import java.util.ArrayList;

/**
 * Il programma deve essere in grado di effettuare versamenti, prelievi, di restituire il saldo e di 
   effettuare la lista degli ultimi 5 movimenti
 * @author tss
 */
public class CC {
     private String nomeUtente;
     private double contoCorrente;
     private ArrayList<String> movimenti;

    public CC(String nomeUtente, double contoCorrente) {
        this.nomeUtente = nomeUtente;
        this.contoCorrente = contoCorrente;
        this.movimenti = new ArrayList<String>();
    }
    
    public void versamento(int valoreVersato){//aggiunge al conto un valore e salva in moviemto il processo
        String report = "Saldo iniziale: " + contoCorrente;
        contoCorrente += valoreVersato;
        report += " - Valore versato: " + valoreVersato + " - Saldo finale: " + contoCorrente;
        movimenti.add(report);
    }
    
    public void prelievo(int valorePrelevato){//toglie al conto un valore e salva in moviemto il processo
        String report = "Saldo iniziale: " + contoCorrente;
        contoCorrente -= valorePrelevato;
        report += " - Valore versato: -" + valorePrelevato + " - Saldo finale: " + contoCorrente;
        movimenti.add(report);
    }
    
    public void saldo(){//stamp il saldo del conto
        System.out.println("Saldo attuale: " + contoCorrente);
    }
    
    public void ultimi5Movimenti(){//stampa gli ultimi 5 movimenti effettuati sul conto
        String report = "Ultimi 5 movimenti:\n";
        for (int i = movimenti.size()-5; i < movimenti.size(); i++) {
            report += movimenti.get(i) + "\n";            
        }
        
        System.out.println(report);
    }
    
    
}
