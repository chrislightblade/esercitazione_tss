/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio.esercizio_numero_5;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Menù {

    ArrayList<Bevanda> bevande;
    ArrayList<Piatto> piatti;

    public Menù() {
        bevande = new ArrayList<Bevanda>();
        piatti = new ArrayList<Piatto>();
        bevande.add(new Bevanda("Acqua", 1));
        bevande.add(new Bevanda("Vino", 3));
        piatti.add(new Piatto("Pollo", 5));
        piatti.add(new Piatto("Cotoletta", 5));
    }

    public void getMenù() {
        String report = "Menù:\n";
        for (int i = 0; i < bevande.size(); i++) {
            report += "Nome: " + bevande.get(i).getNome() + " - Costo: " + bevande.get(i).getCosto(); 
        }
        
        for (int i = 0; i < piatti.size(); i++) {
            report += "Nome: " + piatti.get(i).getNome() + " - Costo: " + piatti.get(i).getCosto(); 
        }
    }
    }




    class Bevanda implements Alimento{
        
        private String nome;
        private double costo;

    public Bevanda(String nome, int costo) {
            this.nome = nome;
            this.costo = costo;
        }
        
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getCosto() {
        return costo;
    }    
    }

    class Piatto implements Alimento{

        private String nome;
        private double costo;

        public Piatto(String nome, int costo) {
            this.nome = nome;
            this.costo = costo;
        }

        @Override
        public String getNome() {
            return nome;
        }

        @Override
        public double getCosto() {
            return costo;
        }
    }


