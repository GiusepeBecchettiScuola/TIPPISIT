package prioritysScheduling;

public class Pbs {

    public static void main(String[] args) {
        String[] processo = new String[4];
        int[] tArrivo = new int[4];
        int[] tExe = new int[4];
        int[] tServizio = new int[4];
        int[] priorità = new int[4];
        double[] tAttesa = new double[4];
        double media = 0;

        processo[0] = "P0";
        processo[1] = "P1";
        processo[2] = "P2";
        processo[3] = "P3";

        tArrivo[0] = 0;
        tArrivo[1] = 1;
        tArrivo[2] = 2;
        tArrivo[3] = 3;

        tExe[0] = 5;
        tExe[1] = 3;
        tExe[2] = 8;
        tExe[3] = 6;

        priorità[0] = 1;
        priorità[1] = 2;
        priorità[2] = 1;
        priorità[3] = 3;

        // Ordina i processi in base alla priorità (ordine decrescente)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                if (priorità[j] < priorità[j + 1]) {
                    // Scambia i valori di priorità e gli altri relativi ai processi
                    int tempPriorità = priorità[j];
                    priorità[j] = priorità[j + 1];
                    priorità[j + 1] = tempPriorità;

                    // Scambia i valori degli altri array corrispondenti ai processi
                    String tempProcesso = processo[j];
                    processo[j] = processo[j + 1];
                    processo[j + 1] = tempProcesso;

                    int tempArrivo = tArrivo[j];
                    tArrivo[j] = tArrivo[j + 1];
                    tArrivo[j + 1] = tempArrivo;

                    int tempExe = tExe[j];
                    tExe[j] = tExe[j + 1];
                    tExe[j + 1] = tempExe;
                }
            }
        }

        // Calcola i tempi di servizio, attesa e la media totale
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                tServizio[0] = 0;
                tAttesa[0] = 0;
            } else {
                tServizio[i] = tServizio[i - 1] + tExe[i - 1];
                tAttesa[i] = tServizio[i] - tArrivo[i];
                media = media + tAttesa[i] / 4;
            }
            System.out.println("Processo: " + processo[i]);
            System.out.println("Priorità: " + priorità[i]);
			System.out.println("Tempo di arrivo: " + tArrivo[i]);
			System.out.println("Tempo di Esecuzione: " + tExe[i]);
			System.out.println("Tempo di servizio: "+tServizio[i]);
			System.out.println("Tempo di attesa: "+tAttesa[i]);
        }
        System.out.println("Media tempi di attesa: "+media);
    }
}
