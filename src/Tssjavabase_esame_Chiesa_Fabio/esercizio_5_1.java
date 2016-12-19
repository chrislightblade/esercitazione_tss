/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tssjavabase_esame_Chiesa_Fabio;

/**
 * StampaZigZag
 * @author tss
 */
public class esercizio_5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {//inserisce nell'array 10 numeri casuali
            array[i] = (int) Math.floor(Math.random() * 50) + 1;            
        }
        System.out.println(stampaZigZag(array));
    }

    //metodo che stampa in un report, a gruppi di 2 per ciclio for, il primo e l'ultimo numero dell'array e poi avanzando fino ada rrivare al centro dell'array
    private static String stampaZigZag(int[] array) {
        String report = "";
        for (int i = 0; i < array.length; i++) {
            if(i >= Math.floor(array.length/2)){
                return report;
            }
            report += array[i] + " " + array[(array.length-1) - i] + " "; 
        }
        return report;//necessario ai fini del programma, mai usato in realtà
    }
    
}
