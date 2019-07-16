
package javaapplication1;

import bubblesort.Ordenacao;

public class JavaApplication1 {

    public static void main(String[] args) {
        /**Ordem crescente
        */
        int [] arrayDesordenado = {9, 2, 3, 4, 7, 1, 2, 78, 15, 11};
        
        for (int i = 0; i < arrayDesordenado.length; i++) {
            System.out.println(arrayDesordenado[i]);
        }
        
        System.out.println("\n Array Ordenado: ");
       
        int [] arrayOrdenado = Ordenacao.bubbleCrescente(arrayDesordenado);
        
        for (int i = 0; i < arrayOrdenado.length; i++) {
            System.out.println(arrayOrdenado[i]);
        }    
        /**Ordem decrescente
         */
        System.out.println("\n Array Decrescente: ");
        int [] arrayDescrescente = Ordenacao.bubbleDecrescente(arrayDesordenado);
        for (int i = 0; i < arrayDescrescente.length; i++) {
            System.out.println(arrayDescrescente[i]);
        }
    }
    
}
