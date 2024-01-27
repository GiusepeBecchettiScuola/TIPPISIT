package tpsit;

public class Holt {
	int processi,risorse;
	int grafo[][];
	public Holt(int x, int y) {
		risorse=x;
		processi=y;
		grafo = new int[x][y];
		for(int i=0;i<x;i++) {
			for(int c=0;c<y;c++) {
				grafo[i][c]=0;
			}
		}
	}
	public void in (int processo, int risorsa) {
		boolean preso=false;
		for(int i=0;i<processi;i++) {
			if(grafo[risorsa][i]==1) {
				preso=true;			
			}
		}
		if(preso) {
			grafo[risorsa][processo]=2;
		}else {
			grafo[risorsa][processo]=1;
		}
		
	}
}