package it.edu.iisgubbio.thread;
/**
 * Un thread in java può essere realizzato in vari modi:
 * 1)Faccio una classe che estende la classe nativa di Java
 * thread che ha 2 metodi principali:
 * start(): fa partire il thread
 * run(): contiene il codice che deve essere eseguito dal thread
 */
public class HelloThreads extends Thread{
	public static void main(String args[]) {
		HelloThreads t1 = new HelloThreads();
		t1.start();


	}
	public void run() {
		System.out.println("Hello from a thread");
	}
}
