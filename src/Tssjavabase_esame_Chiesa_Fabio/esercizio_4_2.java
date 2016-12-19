package Tssjavabase_esame_Chiesa_Fabio;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * TuttiUguali
 *
 * @author tss
 */
public class esercizio_4_2 {

    /**
     * TuttiUguali
     * programma che prende in input 3 numeri e verifica se sono uguali o meno
     * il controllo viene fatto con un metodo esterno
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inserire 3 numeri i quali verrano controllati e verrà detto se sono tutti uguali o meno\n");

        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        int numero1 = s.nextInt();

        Scanner t = new Scanner(System.in);
        System.out.println("Inserisci il secondo numero");
        int numero2 = t.nextInt();

        Scanner u = new Scanner(System.in);
        System.out.println("Inserisci il terzo numero");
        int numero3 = u.nextInt();
        
        if(controllaNumeri(numero1, numero2, numero3)){
            System.out.println("i numeri da te inseriti sono uguali");
        } else {
            System.out.println("i numeri da te inseriti NON sono uguali");
        }

    }

    private static boolean controllaNumeri(int numero1, int numero2, int numero3) {
        if(numero1 == numero2 && numero2 == numero3){
            return true;
        }
        return false;
    }
}
