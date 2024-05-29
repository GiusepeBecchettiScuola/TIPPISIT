package esercizio;

public class Automobilista {
	String nome;
	String cognome;
	double soldi;
	int veloce;
	/**
	 * Questo è il metodo costruttore
	 * @param nome Il nome dell'autista
	 * @param cognome Il cognome dell'autista
	 * @param soldi Il denaro disponibile dell'autista
	 * @param veloce La velocità dell'autista
	 * @return Un oggetto della classe automobilista
	 */
	
	public Automobilista(String nome, String cognome, double soldi, int veloce) {
		this.nome=nome;
		this.cognome=cognome;
		this.soldi=soldi;
		this.veloce=veloce;
		
	}
	/**
	 * Questo metodo verifica se l'automobilista ha i soldi per pagare
	 * @param multa Il valore complessivo della multa
	 * @return boolean il valore è vero se...
	 */
	public boolean pagabile(double multa) {
		if(this.soldi>=multa) {
			return true;
		}else {
			return false;
		}
		
	}
}
