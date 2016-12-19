/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio.esercizio_numero_6;

/**
 *
 * @author tss
 */
public class Messaggio {
    
    private String mittente;
    private String destinatario;
    private String testo;
    private String letto = "No";

    public Messaggio(String mittente, String destinatario, String testo) {
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.testo = testo;
    }
    
    @Override
    public String toString(){
        String report = "Mittente: " + mittente;
        report += "\nDestinatario: " + destinatario;
        report += "\nTesto: " + testo;
        report += "\nLetto: " + letto;
        return report;
    }
    
    public void setLetto(){
        this.letto = "Si";
    }
}
