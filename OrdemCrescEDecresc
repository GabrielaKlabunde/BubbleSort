
package bubblesort;

public class Ordenacao {
   
    public static int[] bubbleCrescente(int[] vetorDes) {

        int[] vetorOrdenado = vetorDes;
        int aux = 0;

        for (int i = 0; i < vetorDes.length; i++) {
            for (int j = 0; j < (vetorDes.length - 1); j++) {
                if (vetorOrdenado[j] > vetorOrdenado[j + 1]) {
                    aux = vetorOrdenado[j];
                    vetorOrdenado[j] = vetorOrdenado[j + 1];
                    vetorOrdenado[j + 1] = aux;
                }
            }
        }
        
        return vetorOrdenado;
        
    }
        public static int[] bubbleDecrescente(int[] vetorDecre) {

        int[] vetorDecrescente = vetorDecre;
        int aux = 0;

        for (int i = 0; i < vetorDecre.length; i++) {
            for (int j = 0; j < (vetorDecre.length-1); j++) {
                if (vetorDecrescente[j] < vetorDecrescente[j + 1]) {
                    aux = vetorDecrescente[j];
                    vetorDecrescente[j] = vetorDecrescente[j + 1];
                    vetorDecrescente[j + 1] = aux;
                }
            }
        }
        
        return vetorDecrescente;
    
}
}
