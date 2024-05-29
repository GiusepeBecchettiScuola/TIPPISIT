package semafori;

import java.util.concurrent.Semaphore;
public class WorkThread extends Thread{
	Semaphore sem;
	RisorsaCon ris;
	public WorkThread(Semaphore sem, RisorsaCon ris, String threadName) {
		super(threadName);
		this.sem = sem;
		this.ris = ris;
	}
	@Override
	public void run() {
		if(this.getName().equals("P")) {
			System.out.println("O bona, so il Produttore");
			try {
				System.out.println("O bona, so ancora io, lProduttore, sto aspetta lpermesso di scrivere");
				sem.acquire();
				System.out.println("Permesso accordato");
				for(int i=0;i<5;i++) {
					ris.count++;
					System.out.println(getName()+":"+ris.count);
					Thread.sleep(10);
				}
			}
			catch(InterruptedException exc) {
				System.out.println(exc);
			}
			System.out.println("Il Produttore rilascia il permesso");
			sem.release();	
		}else {
			System.out.println("O bona, so il Consumatore");
			try {
				System.out.println("O bona, so ancora io, lConsumatore, sto aspetta lpermesso di scrivere");
				sem.acquire();
				System.out.println("Permesso accordato");
				for(int i=0;i<5;i++) {
					ris.count--;
					System.out.println(getName()+":"+ris.count);
					Thread.sleep(10);
				} 
			}
			catch(InterruptedException exc) {
				System.out.println(exc);
			}
			System.out.println("Il Consumatore rilascia il permesso");
			sem.release();
		}
	}
}
