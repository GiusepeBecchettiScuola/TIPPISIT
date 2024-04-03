package macchinetta;

public class Cliente {
	double credito;
	String nome;
	String cognome;
	int eta;
	Prodotto prodottoScelto;
	Cliente(double credito,String nome, String cognome,int eta, String prodottoScelto){
		this.credito=credito;
		this.prodottoScelto=prodottoScelto;
	}
}
