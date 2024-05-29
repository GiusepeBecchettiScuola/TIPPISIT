package it.edu.iisgubbio.ExThreads;

public class B extends Thread{
	public void run() {
		for(int i=50;i<=100;i++) {
			System.out.println(i);
		}
	}
}
