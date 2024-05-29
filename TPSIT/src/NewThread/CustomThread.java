package NewThread;

public class CustomThread  extends Thread{
	public void run(int[]x) {
		for (int i =0; i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println(" ");

		for (int i =0; i<x.length;i++) {
			for(int l=1;l<=10;l++) {
				if(x[i]==l) {
					System.out.print(x[i]+" ");
				}
			}
		}
		System.out.println(" ");
		try {
			sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
//dato un vettore di numeri tra 1 e 10 diversi, il thread stampi solo se il numero del ciclo 
//è presente nel vettore che gli passo
//dopo ciò fare UML