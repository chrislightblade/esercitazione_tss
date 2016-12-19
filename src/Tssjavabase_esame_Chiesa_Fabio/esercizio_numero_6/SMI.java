/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio.esercizio_numero_6;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class SMI {

    Utente account;
    ArrayList<Utente> rubrica;
    ArrayList<Messaggio> inviati;
    ArrayList<Messaggio> ricevuti;

    public SMI(Utente account) {
        this.account = account;
        this.rubrica = new ArrayList<Utente>();
        this.inviati = new ArrayList<Messaggio>();
        this.ricevuti = new ArrayList<Messaggio>();
    }
    
    public SMI registrazione(Utente utente){//possibilità di registrarsi
        SMI smi = new SMI(utente);
        return smi;
    }
    
    public void inviaMessaggio(){
    Messaggio messaggio = new Messaggio(mittente, destinatario, testo);
}

•
invio messaggio ad uno o più destinatari
•
ricezione messaggi non letti
•
cancellazione messaggio
•
elenco utenti online  
}
