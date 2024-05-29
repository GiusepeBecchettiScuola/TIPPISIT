package it.edu.iisgubbio.ExThreads;

public class A extends Thread{
	public void run() {
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}