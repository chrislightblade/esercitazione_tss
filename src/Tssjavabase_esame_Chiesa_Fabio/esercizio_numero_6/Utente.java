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
public class Utente {
    
    private String nome;
    private String cognome;
    private int numero;
    private String online;

    public Utente(String nome, String cognome, int numero) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;        
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNickName() {
        return online;
    }

    public void setNickName(String online) {
        this.online = online;
    }
    
    
}
