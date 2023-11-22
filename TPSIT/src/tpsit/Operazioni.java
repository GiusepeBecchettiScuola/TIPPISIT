package it.edu.iisgubbio.tpsit;

public class Operazioni {

	int n1,n2;

	public Operazioni (int x, int y) {

		n1 = x;
		n2 = y;

	}
	public int Somma() {
		return n1+n2;
	}
	public int Prodotto() {
		return n1*n2;
	}
	static void main() {
		Operazioni OP=new Operazioni(3,4);
		OP .Somma();
		OP .Prodotto();
	}
}
