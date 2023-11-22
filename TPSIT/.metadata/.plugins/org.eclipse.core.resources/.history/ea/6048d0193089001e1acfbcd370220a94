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

		//PROVA GIT HUB
		for(int i=0; i<4;i++) {
			System.out.println(processo[i]);
			System.out.println(tArrivo[i]);
			System.out.println(tExe[i]);

			if(tArrivo[i]==0) {
				tServizio[i]=0;
				tAttesa[i]=0;

			}else {
				tServizio[i]=tServizio[i-1]+tExe[i-1];
				tAttesa[i]=tServizio[i]-tArrivo[i];
				media= media+tAttesa[i]/4;
			}
			System.out.println(tServizio[i]);
			System.out.println(tAttesa[i]);
			System.out.println(media);
		}
	}	
}

