package it.edu.iisgubbio.thread;

/**
 * Lanciare 2 thread, uno che scrive i numeri da 1 a 10
 * e l'altro che scrive i numeri da 50 a 100
 * 
 * Dato che abbiamo realizzato un unica classe che implementa il thread, 
 * per distinguere i due thread occorre passare al costruttore una variabile 
 * di selezione
 * 
 * In questa versione non abbiamo implementato uno scheduler, i thread partono
 * con un ordien impartito dalla Virtual Machine e stampano tutti i numeri prima di passare
 * al secondo thread
 */

public class Conta extends Thread{

	int typeThread=0;
	public static void main (String args[]) {

		Conta t1 = new Conta(0);
		Conta t2 = new Conta(1);
		t1.start();
		t2.start();


	}
	public Conta (int type) {
		typeThread = type;
	}
	public void stopThread(int tempo) {
		if(tempo==5) {
			this.stop();
		}
	}
	public void run() {
		if(typeThread==0) {
			for(int i=1;i<=10;i++) {
				System.out.println(i);
				this.stopThread(i);
			}
		}else {
			try {
				this.sleep(500);
				
			} catch (InterruptedException e) {
				System.out.println("erroreeeeee eeehh noneeeeee");
			}
		
			for(int i=50;i<=100;i++) {
				System.out.println(i);
			}
		}
	}
}