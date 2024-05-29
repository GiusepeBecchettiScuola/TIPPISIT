package biblioteca;

public class Main {
	public static void main(String[] args) {
		Libro lista[] = new Libro[10];
		for(int i=0;i<10;i++) {
			 lista[i]= "Libro",false;
		}
		System.out.println(lista);
		Biblioteca metropolis = new Biblioteca(lista);
		Cliente giulio = new Cliente("Giulio",0);
		if (lista[0].inPrestito == true ) {
			System.out.println("Libro occupato");
		}
		else {
			System.out.println("Libro libero");

		}
	}
}
