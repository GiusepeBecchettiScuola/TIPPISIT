package autovelox;

public class Poliziotto {
	int limite;
	int multa;
	Poliziotto(int max){
		this.limite=max;
	}
	double fareMulta(int velocita) {
		return multa=2*(velocita-limite);
	}
	void modificaAutoVelox(int nuovoLimite) {
		limite = nuovoLimite;
	}
	void modificaTariffa() {
		
	}
}
