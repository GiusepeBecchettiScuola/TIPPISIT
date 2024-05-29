package semafori;

import java.util.concurrent.Semaphore;
public class Main {
	public static void main(String[] args) throws InterruptedException{
		Semaphore sem = new Semaphore(1);
		RisorsaCon risorsa = new RisorsaCon();
		WorkThread t1 = new WorkThread(sem, risorsa, "P");
		WorkThread t2 = new WorkThread(sem, risorsa, "C");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Valore finale del contatore: "+risorsa.count);
	}
}
