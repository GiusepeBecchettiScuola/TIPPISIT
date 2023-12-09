package fcfs;


public class Scheduler {

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

		tArrivo[0]=0;
		tArrivo[1]=1;
		tArrivo[2]=2;
		tArrivo[3]=3;

		tExe[0]=5;
		tExe[1]=3;
		tExe[2]=8;
		tExe[3]=6;

		//Printa nella console i processi e i relativi tempi di arrivo ed esecuzione
		for(int i=0; i<4;i++) {
			System.out.println(processo[i]);
			System.out.println(tArrivo[i]);
			System.out.println(tExe[i]);
			//Controllo se un processo ha come tempo di arrivo 0, in tal caso imposto
			//il tempo di servizio e di attesa a 0
			if(tArrivo[i]==0) {
				tServizio[i]=0;
				tAttesa[i]=0;
			//Se il tempo di arrivo è diverso da 0 vado ad eseguire il calcolo del
			//tempo di servizio, di attesa e la media totale dei tempi di attesa
			}else {
				tServizio[i]=tServizio[i-1]+tExe[i-1];
				tAttesa[i]=tServizio[i]-tArrivo[i];
				media= media+tAttesa[i]/4;
			}
			//Stampo nella console i tempi di servizio di attesa e la media totale
			System.out.println(tServizio[i]);
			System.out.println(tAttesa[i]);
			System.out.println(media);
		}
	}	
}

