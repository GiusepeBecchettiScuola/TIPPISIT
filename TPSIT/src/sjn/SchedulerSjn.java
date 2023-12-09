package sjn;


public class SchedulerSjn {

	public static void main(String[] args ) {	
		String[] processo= new String[4];
		int []tArrivo=new int [4];
		int []tExe=new int [4];
		int []tServizio=new int [4];
		double []tAttesa= new double [4];
		double media=0;

		processo[0]="P0";
		processo[1]="P1";
		processo[2]="P2";
		processo[3]="P3";

		//		tExe[0]=(int) (Math.random()*10)+1;
		//		tExe[1]=(int) (Math.random()*10)+1;
		//		tExe[2]=(int) (Math.random()*10)+1;
		//		tExe[3]=(int) (Math.random()*10)+1;

		tExe[0]=5;
		tExe[1]=3;
		tExe[2]=8;
		tExe[3]=6;

		tArrivo[0]=0;
		tArrivo[1]=1;
		tArrivo[2]=2;
		tArrivo[3]=3;

		//Creo un for che ingloberà tutto il calcolo di quale sia il processo più corto
		for (int i = 0; i < 4; i++) {
			/*
			Nei seguenti for utilizzo l'algorithmo di ricerca "BUBBLE SORT" per andare a
			trovare e mettere in ordine i processi secondo il loro tempo di esecuzione,
			il loro nome e il loro tempo di arrivo
			 */
			for(int superficie=0;superficie<=tExe.length-1-1;superficie=superficie+1){
				for(int posizione=tExe.length-1-1;posizione>=superficie;posizione--){
					if(tExe[posizione]>tExe[posizione+1]){

						int appoggioExe=tExe[posizione];
						tExe[posizione]=tExe[posizione+1];
						tExe[posizione+1]=appoggioExe;

						String appoggioPro=processo[posizione];
						processo[posizione]=processo[posizione+1];
						processo[posizione+1]=appoggioPro;

						int appoggioArrivo=tArrivo[posizione];
						tArrivo[posizione]=tArrivo[posizione+1];
						tArrivo[posizione+1]=appoggioArrivo;			
					}
				}
			}
			/*
			Se la condizione dell'if  vera significa che il primo processo è il primo ad
			essere eseguito quindi il suo tempo di servizio e il suo tempo di attesa va
			impostato a 0
			 */
			if(i==0) {
				tServizio[0]=0;
				tAttesa[0]=0;
			}else {
				tServizio[i]=tServizio[i-1]+tExe[i-1];
				tAttesa[i]=tServizio[i]-tArrivo[i];
				media= media+tAttesa[i]/processo.length;
			}
		}
		//Stampo per ogni singolo processo ogni sua singola variabile per metterlo in ordine
		//nella console
		for(int i=0;i<4;i++) {
			System.out.println("Processo: " + processo[i]);
			System.out.println("Tempo di arrivo: " + tArrivo[i]);
			System.out.println("Tempo di Esecuzione: " + tExe[i]);
			System.out.println("Tempo di servizio: "+tServizio[i]);
			System.out.println("Tempo di attesa: "+tAttesa[i]);
		}
		System.out.println("Media tempi di attesa: "+media);
	}	
}