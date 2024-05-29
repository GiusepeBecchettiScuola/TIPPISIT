package it.edu.iisgubbio.ExThreads;

public class Princ {
	public static void main(String[] args) {
		A t1 = new A();
		t1.run();
		B t2 = new B();
		t2.run();
	}
}
