package SchedulerVideo;

import java.util.Random;

public class Video {

	public static void main(String[] args) {
		// Dichiarazione e inizializzazione delle variabili
		int nVideo = 4;
		String[] idVideo = new String[nVideo];
		int[] durataVideo = new int[nVideo];
		int[] tempoAschermoTot = new int[nVideo];
		Random random = new Random();

		// Generazione dei video casuali
		for (int i = 0; i < nVideo; i++) {
			idVideo[i] = "video" + i;
			tempoAschermoTot[i] = 0;

			// Durata del video generata casualmente tra 1 e 5 minuti
			durataVideo[i] = random.nextInt(5) + 1;
		}

		// Ordinamento dei video in base alla durata (bubble sort)
		for (int superficie = 0; superficie <= durataVideo.length - 1 - 1; superficie = superficie + 1) {
			for (int posizione = durataVideo.length - 1 - 1; posizione >= superficie; posizione--) {
				if (durataVideo[posizione] > durataVideo[posizione + 1]) {

					// Scambio delle informazioni tra i video
					int appoggioTast = tempoAschermoTot[posizione];
					tempoAschermoTot[posizione] = tempoAschermoTot[posizione + 1];
					tempoAschermoTot[posizione + 1] = appoggioTast;

					String appoggioId = idVideo[posizione];
					idVideo[posizione] = idVideo[posizione + 1];
					idVideo[posizione + 1] = appoggioId;

					int appoggioDurata = durataVideo[posizione];
					durataVideo[posizione] = durataVideo[posizione + 1];
					durataVideo[posizione + 1] = appoggioDurata;
				}
			}
		}

		// Tempo totale di proiezione
		int tempoTotale = 120;
		int posizioneVideoEseguibile = 0;

		// Proiezione dei video
		for (int i = 0; i < tempoTotale;) {
			//Verifica se è possibile proiettare l'intero video senza superare il tempo totale disponibile
			if (tempoAschermoTot[posizioneVideoEseguibile] + durataVideo[posizioneVideoEseguibile] <= tempoTotale) {
				//Aggiorna il tempo totale di proiezione del video, aggiungendo la sua durata.
				tempoAschermoTot[posizioneVideoEseguibile] += durataVideo[posizioneVideoEseguibile];
				//Aggiorna la variabile i in modo che il ciclo salterà il tempo corrispondente alla durata del video appena proiettato.
				i += durataVideo[posizioneVideoEseguibile];
				System.out.println("Video: " + idVideo[posizioneVideoEseguibile] + ", Tempo di proiezione: " + durataVideo[posizioneVideoEseguibile] + " minuti");
			}
			//Incrementa l'indice del video eseguibile. L'uso del % assicura che l'indice rimanga nel range corretto (da 0 a nVideo-1).
			posizioneVideoEseguibile = (posizioneVideoEseguibile + 1) % nVideo;
		}

		// Stampa delle informazioni sui video
		System.out.println("");
		for (int i = 0; i < nVideo; i++) {
			System.out.println("ID video: " + idVideo[i]);
			System.out.println("Tempo a schermo totale: " + tempoAschermoTot[i]);
			System.out.println("Durata singolo video: " + durataVideo[i]);
		}
	}
}
