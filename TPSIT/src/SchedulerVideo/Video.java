package SchedulerVideo;

import java.util.Random;

public class Video {

	public static void main(String[] args ) {
		int nVideo=4;
		String[] idVideo= new String[nVideo];
		int[] tempoAschermoTot= new int[nVideo];
		int[] durataVideo= new int[nVideo];
		
		for(int i =0; i<nVideo;i++) {
			idVideo[i]="video"+i;
			tempoAschermoTot[i]=0;
			
			durataVideo[i]=(int) (Math.random() * 5) + 1;; //durata impostata con la i per semplicità
		}
		
		for(int superficie=0;superficie<=durataVideo.length-1-1;superficie=superficie+1){
			for(int posizione=durataVideo.length-1-1;posizione>=superficie;posizione--){
				if(durataVideo[posizione]>durataVideo[posizione+1]){

					int appoggioExe=tempoAschermoTot[posizione];
					tempoAschermoTot[posizione]=tempoAschermoTot[posizione+1];
					tempoAschermoTot[posizione+1]=appoggioExe;

					String appoggioPro=idVideo[posizione];
					idVideo[posizione]=idVideo[posizione+1];
					idVideo[posizione+1]=appoggioPro;

					int appoggioArrivo=durataVideo[posizione];
					durataVideo[posizione]=durataVideo[posizione+1];
					durataVideo[posizione+1]=appoggioArrivo;			
				}
			}
		}
		int min=100;
		for(int a=0;a<100;a++) {
			
			for(int i=0; i<nVideo;i++) {
			if(tempoAschermoTot[i]<100) {
				min= tempoAschermoTot[i]; 
			
			}			
		}
			
		}
		
		for(int i=0; i<nVideo;i++) {
			System.out.println(idVideo[i]);
			System.out.println(tempoAschermoTot[i]);
			System.out.println(durataVideo[i]);
		}
	}	
}

