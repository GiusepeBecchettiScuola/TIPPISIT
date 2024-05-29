package bubbleSort;

public class Main {
    public static void main(String[] args) {
        int v[] = new int[10];
        
        // Riempimento dell'array con numeri casuali
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100);
            System.out.println("Prima dell'ordinamento: " + v[i]);
        }
        
        int superficie = 0;
        int posizione = 0;
        int appoggio = 0;
        int ultimo = v.length; // Lunghezza dell'array

        // Algoritmo di ordinamento a bolle
        for (superficie = 0; superficie < ultimo - 1; superficie++) {
            for (posizione = 0; posizione < ultimo - superficie - 1; posizione++) {
                if (v[posizione] > v[posizione + 1]) {
                    // Scambio di v[posizione] e v[posizione + 1]
                    appoggio = v[posizione];
                    v[posizione] = v[posizione + 1];
                    v[posizione + 1] = appoggio;
                }
            }
        }
        
        // Stampa dell'array ordinato
        for (int i = 0; i < v.length; i++) {
            System.out.println("Dopo l'ordinamento: " + v[i]);
        }
    }
}
