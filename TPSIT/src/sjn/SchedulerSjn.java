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

		for(int i=0; i<4;i++) {
			System.out.println("Processo: "+processo[i]);
			System.out.println("Tempo di arrivo: "+tArrivo[i]);
			System.out.println("Tempo di Esecuzione:"+tExe[i]);

			for(int superficie=0;superficie<=tExe.length-1-1;superficie=superficie+1){
				for(int posizione=tExe.length-1-1;posizione>=superficie;posizione--){
					if(tExe[posizione]>tExe[posizione+1]){
						int appoggio=tExe[posizione];
						tExe[posizione]=tExe[posizione+1];
						tExe[posizione+1]=appoggio;
					}
					if(tArrivo[posizione]>tArrivo[posizione+1]){
						int appoggio2=tArrivo[posizione];
						tArrivo[posizione]=tArrivo[posizione+1];
						tArrivo[posizione+1]=appoggio2;
					}
				}
			}

			if(tArrivo[i]==0) {
				tServizio[i]=0;
				tAttesa[i]=0;

			}else {
				tServizio[i]=tServizio[i-1]+tExe[i-1];
				tAttesa[i]=tServizio[i]-tArrivo[i];
				media= media+tAttesa[i]/4;
			}
			System.out.println("Tempo di servizio: "+tServizio[i]);
			System.out.println("Tempo di attesa: "+tAttesa[i]);
		}
		System.out.println("Media tempi di attesa: "+media);
	}	
}

