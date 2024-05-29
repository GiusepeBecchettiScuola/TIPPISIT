package esercizio;

public class Poliziotto {
	int limiteVelox;
	double multaPerKm;
	
	public void settareLimite(int limite) {
		this.limiteVelox=limite;
	}
	public void settareMulta(double multa) {
		this.multaPerKm=multa;
	}
	public double calcolaMulta(int velocita) {
		if (velocita > this.limiteVelox) {
			return this.multaPerKm*(velocita-this.limiteVelox);
		}else {
			return 0;
		}
	}
}
